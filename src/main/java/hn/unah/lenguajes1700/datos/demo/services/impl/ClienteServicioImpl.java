package hn.unah.lenguajes1700.datos.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1700.datos.demo.entities.Cliente;
import hn.unah.lenguajes1700.datos.demo.repositories.ClienteRepository;
import hn.unah.lenguajes1700.datos.demo.services.ClienteService;

@Service
public class ClienteServicioImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> obtenerClientes() {
        return (List<Cliente>) this.clienteRepository.findAll();
    }

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return  this.clienteRepository.save(cliente);
    }

    @Override
    public Cliente buscarClientePorDNI(String dni) {
        return  this.clienteRepository.findById(dni).get();
    }

    @Override
    public Cliente actualizarCliente(String dni, Cliente cliente) {
        Cliente clienteActualizar = this.clienteRepository.findById(dni).get();
        if(clienteActualizar != null){
            clienteActualizar.setNombre(cliente.getNombre());
            clienteActualizar.setApellido(cliente.getApellido());
            clienteActualizar.setCorreo(cliente.getCorreo());
            clienteActualizar.setTelefono(cliente.getTelefono());
            this.clienteRepository.save(clienteActualizar);
        }
        return clienteActualizar;
    }

    @Override
    public String eliminarCliente(String dni) {
        Cliente clienteEliminar = this.clienteRepository.findById(dni).get();
        if(clienteEliminar != null){
            this.clienteRepository.delete(clienteEliminar);
            return "Cliente eliminado";
        }
        return "Cliente no existe";
    }
    
}
