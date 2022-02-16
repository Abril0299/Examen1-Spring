package com.example.SpringExamen.controllers;

import java.util.ArrayList;


import com.example.SpringExamen.models.Construccion;
import com.example.SpringExamen.services.ConstruccionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController 
@RequestMapping("/Construccion")


public class ConstruccionController {

    @Autowired
    ConstruccionService construccionService;

        
    //GET
    @GetMapping()
    public ArrayList<Construccion> obtenerControl(){
        return construccionService.obtenerControlcuentas();
    }

    @PostMapping()
    public String guardar(@RequestBody Construccion construccion){
        return construccionService.guardar(construccion);
    }

    
}
