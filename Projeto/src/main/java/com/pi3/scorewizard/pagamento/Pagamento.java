package com.pi3.scorewizard.pagamento;

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
public class Pagamento {
	@Id
	private int id;

	@ManyToOne
    @JoinColumn(name="fonte_id")
	private Fonte fonte;

	@ManyToOne
    @JoinColumn(name="pessoaFisica_docCli")
	private PessoaFisica pessoaFisica;

	@ManyToOne
    @JoinColumn(name="modalidade_id")
	private Modalidade modalidade;

	private Date dataPagamento;
	private Double valor;
	private int numUnc;
	private String tipoCliente;
	private Date dataVencimento;
	
	public Pagamento(){}
	
	public Pagamento(int id, Date dataPagamento, Double valor, int numUnc, String tipoCliente, Date dataVencimento) {
		super();
		this.id = id;
		this.dataPagamento = dataPagamento;
		this.valor = valor;
		this.numUnc = numUnc;
		this.tipoCliente = tipoCliente;
		this.dataVencimento = dataVencimento;
	}
	
	
}
