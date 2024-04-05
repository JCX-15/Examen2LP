package hn.unah.lenguajes1700.datos.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1700.datos.demo.entities.Cliente;
import hn.unah.lenguajes1700.datos.demo.services.impl.ClienteServicioImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")
public class ClienteController {
    @Autowired
    private ClienteServicioImpl clienteServicioImpl;

    @PostMapping("/cliente/crear")
    public Cliente crearCliente(@RequestBody Cliente cliente){
        return this.clienteServicioImpl.crearCliente(cliente);
    }
    @GetMapping("/cliente/obtener")
    public List<Cliente> obtenerCliente() {
        return this.clienteServicioImpl.obtenerClientes();
    }
    @GetMapping("/cliente/buscarPorId")
    public Cliente buscarCliente(@RequestParam String dni) {
        return this.clienteServicioImpl.buscarClientePorDNI(dni);
    }
    @PutMapping("cliente/actualizar/{id}")
    public Cliente actualizarCliente(@PathVariable String id, @RequestBody Cliente cliente) {
        return this.clienteServicioImpl.actualizarCliente(id, cliente);
    }
    @DeleteMapping("/cliente/eliminar/{id}")
    public String eliminarCliente( @PathVariable String id) {
        return this.clienteServicioImpl.eliminarCliente(id);
    }
}
