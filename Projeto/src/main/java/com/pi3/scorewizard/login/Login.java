package com.pi3.scorewizard.login;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Login {
	@Id
	private int senha_usu;
	private int pessoaFisica_cpf_pef;
	
	public Login(){}
	
	public Login(int senha_usu, int pessoaFisica_cpf_pef) {
		super();
		this.senha_usu = senha_usu;
		this.pessoaFisica_cpf_pef = pessoaFisica_cpf_pef;
	}
}
