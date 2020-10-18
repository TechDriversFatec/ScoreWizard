package com.pi3.scorewizard.pessoafisica;

import java.util.Date;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PessoaFisica {
	@Id
	private int cpf_pef;
	private char sexo_pef;
	private Date datanasc_pef;
	private String cidade_pef;
	private String estado_pef;
	
	public PessoaFisica(){}
	
	public PessoaFisica(int cpf_pef, char sexo_pef, Date datanasc_pef, String cidade_pef, String estado_pef) {
		super();
		this.cpf_pef = cpf_pef;
		this.sexo_pef = sexo_pef;
		this.datanasc_pef = datanasc_pef;
		this.cidade_pef = cidade_pef;
		this.estado_pef = estado_pef;
	}
	
	
}
