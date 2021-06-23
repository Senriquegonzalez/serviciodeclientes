/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergio.dao;

import com.sergio.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Sergio Enrique Jair Gonzalez Arcos>
 */
//dao se encarga de la comunicacion con la base de datos 
//CrudRepository con tiene los metodos basicos para un CRUD
public interface IclienteDao extends CrudRepository<Cliente, Integer>{
    
}
