package com.pi3.scorewizard;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.servlet.ModelAndView;

import com.pi3.scorewizard.pessoafisica.PessoaFisica;
import com.pi3.scorewizard.pessoafisica.PessoaFisicaController;

public class Model {
	
	@Autowired
	PessoaFisicaController pf = new PessoaFisicaController();
	
	HelloController cont = new HelloController();
	
	public void verificacaoCadastro(JSONObject obj) throws JSONException {
		
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
	}
	 	
	public void verificacaoLogin(String LoginData) throws IOException, JSONException {
		final JSONObject obj1 = new JSONObject(LoginData);
		ArrayList<PessoaFisica> pessoaf = new ArrayList<>();
	 	pessoaf.addAll(pf.getAllPessoaFisica());
	 	System.out.println("oii");
	 	int i = 1;
	 	while( i <= pessoaf.size()) {
		  	  if(obj1.getString("docCli").equals(pessoaf.get(i).getDocumento()) && obj1.getString("senha").equals(pessoaf.get(i).getSenha())) {
		  		  System.out.println("User já cadastrado");
		  		  break;
		  	  }  
		  	  i++;
		}
	}
}
