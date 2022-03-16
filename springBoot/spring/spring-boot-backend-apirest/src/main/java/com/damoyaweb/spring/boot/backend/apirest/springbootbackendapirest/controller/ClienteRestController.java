package com.damoyaweb.spring.boot.backend.apirest.springbootbackendapirest.controller;

import java.util.List;

import com.damoyaweb.spring.boot.backend.apirest.springbootbackendapirest.models.entity.Cliente;
import com.damoyaweb.spring.boot.backend.apirest.springbootbackendapirest.models.services.IClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:42000"})
@RestController
@RequestMapping("/api")
public class ClienteRestController {
    
    @Autowired
    private IClienteService clienteService;


    @GetMapping("/clientes")
    public List<Cliente> index(){
        return clienteService.findAll();
    }
}
