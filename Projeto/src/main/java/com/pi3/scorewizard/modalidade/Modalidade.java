package com.pi3.scorewizard.modalidade;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Modalidade {
	@Id
	private int id;
	private String desc_modalidade;
	
	public Modalidade(){}
	
	public Modalidade(int id, String desc_modalidade) {
		super();
		this.id = id;
		this.desc_modalidade = desc_modalidade;
	}
	
	
}
