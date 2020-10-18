package com.pi3.scorewizard.fonte;

import java.util.List;

import javax.persistence.*;

import com.pi3.scorewizard.movimento.Movimento;
import com.pi3.scorewizard.operacao.Operacao;
import com.pi3.scorewizard.pagamento.Pagamento;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Fonte {
	@Id
	private int id;
	private String nomeFonte;

	@OneToMany(mappedBy = "fonte")
	private List<Movimento> movimento;

	@OneToMany(mappedBy = "fonte")
	private List<Operacao> operacoes;

	@OneToMany(mappedBy = "fonte")
	private List<Pagamento> pagamentos;
	
	public Fonte() {}
	
	public Fonte(int id, String nomeFonte) {
		super();
		this.id = id;
		this.nomeFonte = nomeFonte;
	}
	
	
}
