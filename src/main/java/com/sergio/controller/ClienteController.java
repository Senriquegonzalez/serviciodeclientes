/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sergio.controller;

import com.sergio.entity.Cliente;
import com.sergio.services.IclienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Sergio Enrique Jair Gonzalez Arcos>
 */
@RestController
@RequestMapping("/api") //para indicar la url
public class ClienteController {
    @Autowired //inyecion de dependencias en este caso inyectare cliente services
    private IclienteService  clienteservice;

    
    @GetMapping("/clientes")
    public List<Cliente> mostartodo(){
    return clienteservice.listartodo();
    }
    
}
