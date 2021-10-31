package com.kkevinchoo.sia.controller;

import java.util.ArrayList;
import java.util.Optional;

import com.kkevinchoo.sia.models.estudianteModel;
import com.kkevinchoo.sia.services.estudianteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cita")
public class estudianteController {
    @Autowired
    private estudianteService dService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ArrayList<estudianteModel> obtenerestudiantes(){
        return this.dService.obtenerestudiantes();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public estudianteModel guardarUsuario(@RequestBody estudianteModel estudiante){
        return this.dService.guardarestudiante(estudiante);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<estudianteModel> obtenerEstudiante(@PathVariable int id){
        return this.dService.obtenerEstudiante(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Optional<estudianteModel> cambiarEstadoEstudiante(@PathVariable int id){
        return this.dService.cambiarEstadoEstudiante(id);
    }
}
