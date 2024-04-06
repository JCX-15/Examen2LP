package hn.unah.lenguajes1700.datos.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1700.datos.demo.entities.Cliente;
import hn.unah.lenguajes1700.datos.demo.repositories.ClienteRepository;
import hn.unah.lenguajes1700.datos.demo.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired 
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearCliente'");
    }

    @Override
    public List<Cliente> obtenerClientes() {
        return (List<Cliente>)this.clienteRepository.findAll();
    }

    @Override
    public Cliente obtenerClientePorId(String dni) {
        return this.clienteRepository.findById(dni).get();
    }



}
