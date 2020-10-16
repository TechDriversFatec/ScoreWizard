package com.pi3.scorewizard.pagamento;

import java.util.Date;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pagamento {
	@Id
	private int id;
	private Date data_pgt;
	private Double valor_pgt;
	private int num_unc;
	private int modalidade_id_modalidade;
	private int fonte_id_fonte;
	private String tipoCliente_operacoes;
	private String doc_cli;
	private String pgtcol;
	private Date dataVencimento_mov;
	
	public Pagamento(){}
	
	public Pagamento(int id, Date data_pgt, Double valor_pgt, int num_unc, int modalidade_id_modalidade,
			int fonte_id_fonte, String tipoCliente_operacoes, String doc_cli, String pgtcol, Date dataVencimento_mov) {
		super();
		this.id = id;
		this.data_pgt = data_pgt;
		this.valor_pgt = valor_pgt;
		this.num_unc = num_unc;
		this.modalidade_id_modalidade = modalidade_id_modalidade;
		this.fonte_id_fonte = fonte_id_fonte;
		this.tipoCliente_operacoes = tipoCliente_operacoes;
		this.doc_cli = doc_cli;
		this.pgtcol = pgtcol;
		this.dataVencimento_mov = dataVencimento_mov;
	}
	
	
}
