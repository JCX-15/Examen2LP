package hn.unah.lenguajes1700.datos.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1700.datos.demo.entities.Cliente;
import hn.unah.lenguajes1700.datos.demo.services.impl.ClienteServicioImpl;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class ClienteController {
    @Autowired
    private ClienteServicioImpl clienteServicioImpl;

    @PostMapping("/cliente/crear")
    public Cliente crearCliente(@RequestBody Cliente cliente){
        return this.clienteServicioImpl.crearCliente(cliente);
    }
}
