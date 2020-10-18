package com.pi3.scorewizard.operacao;

import java.util.Date;

import javax.persistence.*;

import com.pi3.scorewizard.fonte.Fonte;
import com.pi3.scorewizard.modalidade.Modalidade;
import com.pi3.scorewizard.pessoafisica.PessoaFisica;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Operacao {
	@Id
	private int id;

	@ManyToOne
    @JoinColumn(name="pessoaFisica_docCli")
	private PessoaFisica pessoaFisica;

	@ManyToOne
    @JoinColumn(name="fonte_id")
	private Fonte fonte;

	@ManyToOne
    @JoinColumn(name="modalidade_id")
	private Modalidade modalidade;
	
	private String tipoCliente;
	private int numUnc;
	private int qtdParcela;
	private Date dataVencimentoUltimaParcela;
	private Date dataContrato;
	private Double valorContratoParcelado;
	private Double valorContrato;
	private Double valorSaldoDevedor;
	
	public Operacao(){}
	
	public Operacao(int id, String tipoCliente_operacoes, int numUnc, int qtdParcela, Date dataVencimentoUltimaParcela,
			Date dataContrato, Double valorContratoParcelado, Double valorContrato, Double valorSaldoDevedor) {
		super();
		this.id = id;
		this.tipoCliente = tipoCliente_operacoes;
		this.numUnc = numUnc;
		this.qtdParcela = qtdParcela;
		this.dataVencimentoUltimaParcela = dataVencimentoUltimaParcela;
		this.dataContrato = dataContrato;
		this.valorContratoParcelado = valorContratoParcelado;
		this.valorContrato = valorContrato;
		this.valorSaldoDevedor = valorSaldoDevedor;
	}
	
	
	
}
