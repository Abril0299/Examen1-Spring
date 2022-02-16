package com.example.SpringExamen.repositories;


import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import com.example.SpringExamen.models.Construccion;


@Repository
public interface ConstruccionRepository extends CrudRepository<Construccion,Long>{
    
    
}

//Holii