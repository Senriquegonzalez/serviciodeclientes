/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sergio.service.serviceImp;

import com.sergio.dao.IclienteDao;
import com.sergio.entity.Cliente;
import com.sergio.services.IclienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author Sergio Enrique Jair Gonzalez Arcos>
 */
@Service
public class ClienteServiceImp implements IclienteService{
    
    
    @Autowired  //anotacion patra hacer inyeccion de dependencias
    private IclienteDao  clientedao; //se inyecta el dao
    //se implementan los metodos del sercvices en este caso el liostar todo
    
    @Override
    @Transactional(readOnly = true)
    public List<Cliente> listartodo() {
       return  (List<Cliente>) clientedao.findAll();
    }

}
