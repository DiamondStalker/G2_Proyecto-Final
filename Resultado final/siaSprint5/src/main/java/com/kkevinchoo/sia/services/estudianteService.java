package com.kkevinchoo.sia.services;

import java.util.ArrayList;
import java.util.Optional;

import com.kkevinchoo.sia.models.estudianteModel;
import com.kkevinchoo.sia.repositories.estudianteRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class estudianteService {
    @Autowired
    private estudianteRepositorio estudianter;

    public ArrayList<estudianteModel> obtenerestudiantes(){ 
        return (ArrayList<estudianteModel>) estudianter.findAll();
    }

    public Optional<estudianteModel> obtenerEstudiante(int id){
        return estudianter.findById(id);
    }

    public estudianteModel guardarestudiante(estudianteModel estudiante){
        return estudianter.save(estudiante);
    }

    public Optional<estudianteModel> cambiarEstadoEstudiante(int id){
        Optional<estudianteModel> estudiante = estudianter.findById(id);
        if (estudiante.isPresent()) {
            estudianteModel estudianteTemp = estudiante.orElse(null);
            //estudianteTemp.setEstado_cita(false);
            estudianter.save(estudianteTemp);
        } 
        return estudiante;
    }

}
