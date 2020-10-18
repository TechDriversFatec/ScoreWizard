package com.pi3.scorewizard.movimento;

import java.util.Date;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Movimento {
	@Id
	private int id;
	private Date dataVencimento_mov;
	private int qtdParcelasAVencer_mov;
	private int qtdParcelasAPagar_mov;
	private Double valorFatura_mov;
	private Double valorMinimoFatura_mov;
	private Double valorParcela;
	private String movimentoAtual;
	private String prd_mov;
	private int PessoaFisica_cpf_pef;
	private String tipo_cli;
	private int num_unc;
	
	public Movimento(){}
	
	public Movimento(int id, Date dataVencimento_mov, int qtdParcelasAVencer_mov, int qtdParcelasAPagar_mov,
			Double valorFatura_mov, Double valorMinimoFatura_mov, Double valorParcela, String movimentoAtual,
			String prd_mov, int pessoaFisica_cpf_pef, String tipo_cli, int num_unc) {
		super();
		this.id = id;
		this.dataVencimento_mov = dataVencimento_mov;
		this.qtdParcelasAVencer_mov = qtdParcelasAVencer_mov;
		this.qtdParcelasAPagar_mov = qtdParcelasAPagar_mov;
		this.valorFatura_mov = valorFatura_mov;
		this.valorMinimoFatura_mov = valorMinimoFatura_mov;
		this.valorParcela = valorParcela;
		this.movimentoAtual = movimentoAtual;
		this.prd_mov = prd_mov;
		PessoaFisica_cpf_pef = pessoaFisica_cpf_pef;
		this.tipo_cli = tipo_cli;
		this.num_unc = num_unc;
	}
	
	
}
