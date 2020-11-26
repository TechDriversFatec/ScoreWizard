package com.pi3.scorewizard.movimento;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MovimentoRepository extends CrudRepository<Movimento, Integer> {
   // @Query()
    ArrayList<Movimento> findByPessoaFisicaDocumento(String documento);
}
