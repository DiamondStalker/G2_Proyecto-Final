package com.kkevinchoo.sia.repositories;

import com.kkevinchoo.sia.models.estudianteModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface estudianteRepositorio  extends CrudRepository<estudianteModel,Integer>{
}
