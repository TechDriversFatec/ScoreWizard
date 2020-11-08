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
	private String documento;

	@OneToMany(mappedBy = "pessoaFisica")
	private List<Movimento> movimentos;

	@OneToMany(mappedBy = "pessoaFisica")
	private List<Operacao> operacoes;

	private String sexo;
	private int anoNascimento;
	private String cidade;
	private String estado;
	
	public PessoaFisica(){}
	
	public PessoaFisica(String docCli, String sexo, int anoNascimento, String cidade, String estado) {
		super();
		this.documento = docCli;
		this.sexo = sexo;
		this.anoNascimento = anoNascimento;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	
}
