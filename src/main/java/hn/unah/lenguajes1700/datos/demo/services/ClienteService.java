package hn.unah.lenguajes1700.datos.demo.services;

import java.util.List;

import hn.unah.lenguajes1700.datos.demo.entities.Cliente;

public interface ClienteService {
    public List<Cliente> obtenerClientes();
    public Cliente crearCliente(Cliente cliente);
    public Cliente buscarClientePorDNI(String dni);
}
