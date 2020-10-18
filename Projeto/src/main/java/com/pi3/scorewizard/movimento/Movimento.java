package com.pi3.scorewizard.movimento;

import java.util.Date;

import javax.persistence.*;

import com.pi3.scorewizard.fonte.Fonte;
import com.pi3.scorewizard.pessoafisica.PessoaFisica;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Movimento {
	@Id
	private int id;

	@ManyToOne
    @JoinColumn(name="pessoaFisica_docCli")
	private PessoaFisica pessoaFisica;

	@ManyToOne
    @JoinColumn(name="fonte_id")
	private Fonte fonte;

	private Date dataVencimento;
	private int qtdParcelasAVencer;
	private int qtdParcelasAPagar;
	private Double valorFatura;
	private Double valorMinimoFatura;
	private Double valorParcela;
	private String movimentoAtual;
	private String periodo;
	private String tipoCliente;
	private int numUnc;
	
	public Movimento(){}
	
	public Movimento(int id, Date dataVencimento, int qtdParcelasAVencer, int qtdParcelasAPagar,
			Double valorFatura, Double valorMinimoFatura, Double valorParcela, String movimentoAtual,
			String periodo, String tipoCliente, int numUnc) {
		super();
		this.id = id;
		this.dataVencimento = dataVencimento;
		this.qtdParcelasAVencer = qtdParcelasAVencer;
		this.qtdParcelasAPagar = qtdParcelasAPagar;
		this.valorFatura = valorFatura;
		this.valorMinimoFatura = valorMinimoFatura;
		this.valorParcela = valorParcela;
		this.movimentoAtual = movimentoAtual;
		this.periodo = periodo;
		this.tipoCliente = tipoCliente;
		this.numUnc = numUnc;
	}
	
	
}
