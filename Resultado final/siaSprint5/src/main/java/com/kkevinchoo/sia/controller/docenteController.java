package com.kkevinchoo.sia.controller;

import java.util.ArrayList;
import java.util.Optional;

import com.kkevinchoo.sia.models.docenteModel;
import com.kkevinchoo.sia.services.docenteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//localhost:8080/docente/
@RequestMapping("/usuario")
public class docenteController {
    @Autowired
    private docenteService dService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ArrayList<docenteModel> obtenerDocentes(){
        return this.dService.obtenerDocentes();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public docenteModel guardarUsuario(@RequestBody docenteModel docente){
        return this.dService.guardarDocente(docente);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<docenteModel> obtenerDocente(@PathVariable int id){
        return this.dService.obtenerDocente(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Optional<docenteModel> cambiarEstadoDocente(@PathVariable int id){
        return this.dService.cambiarEstadoDocente(id);
    }
}
