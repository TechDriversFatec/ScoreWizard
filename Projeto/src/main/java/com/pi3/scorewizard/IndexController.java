package com.pi3.scorewizard;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.pi3.scorewizard.login.Login;
import com.pi3.scorewizard.pessoafisica.PessoaFisica;
import com.pi3.scorewizard.pessoafisica.PessoaFisicaController;

import lombok.var;

import java.io.IOException;
import java.util.ArrayList;

@RestController
public class IndexController {
	
	@Autowired
	PessoaFisicaController pf = new PessoaFisicaController();
	
	HelloController cont = new HelloController();
	
	@PostMapping(value = "/submitFunc")
	public ResponseEntity<Object> salvarFunc(@RequestBody final String funcData) throws IOException, JSONException {
				
	 	System.out.println("Funcionou!");
	 	System.out.println(funcData);
		
	 	final JSONObject obj = new JSONObject(funcData);
	 	
	 	ArrayList<PessoaFisica> pessoaf = new ArrayList<>();
	 	pessoaf.addAll(pf.getAllPessoaFisica());
	 	
	 	int i = 1;
	 	while( i <= pessoaf.size()) {
	 		if(i == pessoaf.size()) {
		  		pf.addpessoaf(obj.getString("docCli"),
		  				obj.getString("senha"),
						obj.getString("sexo"), 
						obj.getInt("anoNascimento"), 
						obj.getString("cidade"), 
						obj.getString("estado"));
		  		  break;
		    	}
		  	  if(obj.getString("docCli").equals(pessoaf.get(i).getDocumento())) {
		  		  break;
		  	  }  
		  	  i++;
		}
	 	return new ResponseEntity<Object>(funcData, HttpStatus.OK);
	}
	
	@PostMapping(value = "/Login")
	public String login(@RequestBody final String LoginData, final Model model) throws IOException, JSONException {
		
	 	System.out.println("Funcionou!");
	 	System.out.println(LoginData);
	 	
	 	final JSONObject obj = new JSONObject(LoginData);
	 	
	 	ArrayList<PessoaFisica> pessoaf = new ArrayList<>();
	 	pessoaf.addAll(pf.getAllPessoaFisica());
	 	
	 	int i = 1;
	 	while( i <= pessoaf.size()) {
		  	  if(obj.getString("docCli").equals(pessoaf.get(i).getDocumento()) && obj.getString("senha").equals(pessoaf.get(i).getSenha())) {
		  		  System.out.println("User já cadastrado");
		  		  break;
		  	  }  
		  	  i++;
		}
	 	String greeting = "hello fuck";
	 	model.addAttribute("greeting", greeting);
	 	return "result";
	}
	
    @GetMapping("/Login")
    public String homeInit(Model model) {
        return "dashboard";
    }

}
