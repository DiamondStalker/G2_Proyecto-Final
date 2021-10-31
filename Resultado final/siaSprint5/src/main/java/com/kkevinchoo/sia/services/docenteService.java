package com.kkevinchoo.sia.services;

import java.util.ArrayList;
import java.util.Optional;

import com.kkevinchoo.sia.models.docenteModel;
import com.kkevinchoo.sia.repositories.docenteRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class docenteService {
    @Autowired
    private docenteRepositorio docenter;

    public ArrayList<docenteModel> obtenerDocentes(){
        return (ArrayList<docenteModel>) docenter.findAll();
    }

    public Optional<docenteModel> obtenerDocente(int id){
        return docenter.findById(id);
    }

    public docenteModel guardarDocente(docenteModel docente){
        return docenter.save(docente);
    }

    public Optional<docenteModel> cambiarEstadoDocente(int id){
        Optional<docenteModel> docente = docenter.findById(id);
        if (docente.isPresent()) {
            docenteModel docenteTemp = docente.orElse(null);
            //docenteTemp.setEstado_usuario(false);
            docenter.save(docenteTemp);
        } 
        return docente;
    }

}
