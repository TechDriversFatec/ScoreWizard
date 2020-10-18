package com.pi3.scorewizard.modalidade;

import javax.persistence.*;

import com.pi3.scorewizard.operacao.Operacao;
import com.pi3.scorewizard.pagamento.Pagamento;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Modalidade {
	@Id
	private int id;
	private String descModalidade;

	@OneToMany(mappedBy = "modalidade")
	private List<Operacao> operacoes;

	@OneToMany(mappedBy = "modalidade")
	private List<Pagamento> pagamentos;
	
	public Modalidade(){}
	
	public Modalidade(int id, String descModalidade) {
		super();
		this.id = id;
		this.descModalidade = descModalidade;
	}
	
	
}
