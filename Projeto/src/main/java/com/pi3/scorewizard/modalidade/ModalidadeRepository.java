package com.pi3.scorewizard.modalidade;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModalidadeRepository extends CrudRepository<Modalidade, String> {
    
}
