package com.pi3.scorewizard.pessoafisica;

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
	private String documento;
	
	private String nome;

	@OneToMany(mappedBy = "pessoaFisica")
	private List<Movimento> movimentos;

	@OneToMany(mappedBy = "pessoaFisica")
	private List<Operacao> operacoes;
	
	private String senha;

	private String sexo;
	private int anoNascimento;
	private String cidade;
	private String estado;
	
	public PessoaFisica(){}

	public PessoaFisica(String docCli, String senha, String sexo, int anoNascimento, String cidade, String estado) {
		super();
		this.documento = docCli;
		this.senha = senha;
		this.sexo = sexo;
		this.anoNascimento = anoNascimento;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public PessoaFisica(String docCli, String sexo, int anoNascimento, String cidade, String estado) {
		super();
		this.documento = docCli;
		this.nome = nome;
		this.sexo = sexo;
		this.anoNascimento = anoNascimento;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	
}
