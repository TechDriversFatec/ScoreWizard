package com.pi3.scorewizard.pessoafisica;

import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;

public interface PessoaFisicaRepository extends CrudRepository<PessoaFisica, Integer> {
	ArrayList<PessoaFisica> findAll();
}
