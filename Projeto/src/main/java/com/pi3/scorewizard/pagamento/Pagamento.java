package com.pi3.scorewizard.pagamento;

import java.util.Date;
import java.util.Optional;

import javax.persistence.*;

import com.pi3.scorewizard.fonte.Fonte;
import com.pi3.scorewizard.modalidade.Modalidade;
import com.pi3.scorewizard.pessoafisica.PessoaFisica;

import org.springframework.lang.Nullable;

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

	@Nullable
	@ManyToOne
    @JoinColumn(name="pessoafisica_documento")
	private PessoaFisica pessoaFisica;

	@ManyToOne
    @JoinColumn(name="modalidade_id")
	private Modalidade modalidade;

	private Date dataPagamento;
	private Double valor;
	private String numUnc;
	private String tipoCliente;
	private Date dataVencimento;
	
	public Pagamento(){}
	
	public Pagamento(int id, Fonte fonte, PessoaFisica pessoaFisica, Modalidade modalidade,
					 Date dataPagamento, Double valor, String numUnc, String tipoCliente, Date dataVencimento) {
		this.id = id;
		this.fonte = fonte;
		this.pessoaFisica = pessoaFisica;
		this.modalidade = modalidade;
		this.dataPagamento = dataPagamento;
		this.valor = valor;
		this.numUnc = numUnc;
		this.tipoCliente = tipoCliente;
		this.dataVencimento = dataVencimento;
	}	
}
