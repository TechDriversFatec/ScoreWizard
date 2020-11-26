package com.pi3.scorewizard.login;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Login {
	@Id
	private String cpf;
	private String senha_usu;

	public String getCpf() {
		return this.cpf;
	}

	public String getSenha() {
		return this.senha_usu;
	}
	
	
	public Login(){}
	
	public Login(String senha_usu, String pessoaFisica_cpf_pef) {
		super();
		this.senha_usu = senha_usu;
		this.cpf = pessoaFisica_cpf_pef;
	}
}
