package com.pi3.scorewizard.fonte;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Fonte {
	@Id
	private int id;
	private String nome_fonte;
	
	public Fonte() {}
	
	public Fonte(int id, String nome_fonte) {
		super();
		this.id = id;
		this.nome_fonte = nome_fonte;
	}
	
	
}
