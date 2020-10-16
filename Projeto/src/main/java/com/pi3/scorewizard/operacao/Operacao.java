package com.pi3.scorewizard.operacao;

import java.util.Date;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Operacao {
	@Id
	private int id;
	private String tipoCliente_operacoes;
	private int num_unc;
	private int qtdParcela_operacao;
	private Date dat_vct_ult_pcl;
	private Date dataContrato_operacao;
	private Double valorContratoParcelado_operacao;
	private Double valorContrato_operacao;
	private Double valorSaldoDevedor;
	private int pessoaFisica_cpf_pef;
	private int fonte_id_fonte;
	private int modalidade_id_modalidade;
	
	public Operacao(){}
	
	public Operacao(int id, String tipoCliente_operacoes, int num_unc, int qtdParcela_operacao, Date dat_vct_ult_pcl,
			Date dataContrato_operacao, Double valorContratoParcelado_operacao, Double valorContrato_operacao,
			Double valorSaldoDevedor, int pessoaFisica_cpf_pef, int fonte_id_fonte, int modalidade_id_modalidade) {
		super();
		this.id = id;
		this.tipoCliente_operacoes = tipoCliente_operacoes;
		this.num_unc = num_unc;
		this.qtdParcela_operacao = qtdParcela_operacao;
		this.dat_vct_ult_pcl = dat_vct_ult_pcl;
		this.dataContrato_operacao = dataContrato_operacao;
		this.valorContratoParcelado_operacao = valorContratoParcelado_operacao;
		this.valorContrato_operacao = valorContrato_operacao;
		this.valorSaldoDevedor = valorSaldoDevedor;
		this.pessoaFisica_cpf_pef = pessoaFisica_cpf_pef;
		this.fonte_id_fonte = fonte_id_fonte;
		this.modalidade_id_modalidade = modalidade_id_modalidade;
	}
	
	
	
}
