package com.pi3.scorewizard;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.pi3.scorewizard.pessoafisica.PessoaFisica;
import com.pi3.scorewizard.pessoafisica.PessoaFisicaController;
import java.io.IOException;
import java.util.Date;

@RestController
public class IndexController {
	
	@Autowired
	PessoaFisicaController pf = new PessoaFisicaController();
	
	@PostMapping(value = "/submitFunc")
	public ResponseEntity<Object> salvarFunc(@RequestBody final String funcData) throws IOException, JSONException {
				
		System.out.println("Funcionou!");
		System.out.println(funcData);
		
		final JSONObject obj = new JSONObject(funcData);
		
		// pf.addFunc(obj.getString("label"));
				
		return new ResponseEntity<Object>(funcData, HttpStatus.OK);
	}

}
