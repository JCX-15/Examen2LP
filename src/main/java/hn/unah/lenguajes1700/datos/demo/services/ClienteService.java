package hn.unah.lenguajes1700.datos.demo.services;

import java.util.List;

import hn.unah.lenguajes1700.datos.demo.entities.Cliente;

public interface ClienteService{

    public Cliente crearCliente(Cliente cliente);
    public List<Cliente> obtenerClientes();
    public Cliente obtenerClientePorId(String dni);
}
