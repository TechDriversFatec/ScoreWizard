package com.pi3.scorewizard.pessoafisica;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.pi3.scorewizard.movimento.Movimento;
import com.pi3.scorewizard.operacao.Operacao;

import lombok.Getter;
import lombok.Setter;

@Entity 
@Getter
@Setter
public class PessoaFisica {
	@Id
	private int docCli;

	@OneToMany(mappedBy = "pessoaFisica")
	private List<Movimento> movimentos;

	@OneToMany(mappedBy = "pessoaFisica")
	private List<Operacao> operacoes;

	private char sexo;
	private Date dataNasc;
	private String cidade;
	private String estado;
	
	public PessoaFisica(){}
	
	public PessoaFisica(int docCli, char sexo, Date dataNasc, String cidade, String estado) {
		super();
		this.docCli = docCli;
		this.sexo = sexo;
		this.dataNasc = dataNasc;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	
}
