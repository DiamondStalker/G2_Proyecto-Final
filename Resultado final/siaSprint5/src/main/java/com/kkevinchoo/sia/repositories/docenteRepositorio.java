package com.kkevinchoo.sia.repositories;

import com.kkevinchoo.sia.models.docenteModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface docenteRepositorio  extends CrudRepository<docenteModel,Integer>{
}
