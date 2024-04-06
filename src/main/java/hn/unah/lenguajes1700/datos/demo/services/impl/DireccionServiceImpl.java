package hn.unah.lenguajes1700.datos.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1700.datos.demo.entities.Direccion;
import hn.unah.lenguajes1700.datos.demo.repositories.ClienteRepository;
import hn.unah.lenguajes1700.datos.demo.repositories.DireccionRepository;
import hn.unah.lenguajes1700.datos.demo.services.DireccionService;

@Service
public class DireccionServiceImpl implements DireccionService{
    @Autowired
    private DireccionRepository direccionRepository;

    @Autowired
    private ClienteRepository  clienteRepository;

    @Override
    public Direccion crearDireccion(Direccion direccion, String dni) {
        if (clienteRepository.existsById(dni)) {
            Direccion  nvoDireccion = new Direccion();
            nvoDireccion.setEstado(direccion.getEstado());
            nvoDireccion.setCiudad(direccion.getCiudad());
            nvoDireccion.setCalle(direccion.getCalle());
            return this.direccionRepository.save(nvoDireccion);
        }
        return null;
    }

}
