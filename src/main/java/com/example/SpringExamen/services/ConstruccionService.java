package com.example.SpringExamen.services;


import com.example.SpringExamen.models.Construccion;
import com.example.SpringExamen.repositories.ConstruccionRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import java.util.ArrayList;


@Service


public class ConstruccionService {
    @Autowired 
    ConstruccionRepository ConstruccionRepo; 


    
    public ArrayList<Construccion> obtenerControlcuentas(){
       
        return (ArrayList<Construccion>) ConstruccionRepo.findAll();
   }



   public String guardar(Construccion construccion){
    ConstruccionRepo.save(construccion);
       return "guardado correctamente";
   }


}
