package hn.unah.lenguajes1700.datos.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1700.datos.demo.entities.Movimientos;
import hn.unah.lenguajes1700.datos.demo.repositories.CuentasRepository;
import hn.unah.lenguajes1700.datos.demo.repositories.MovimientosRepository;
import hn.unah.lenguajes1700.datos.demo.services.MovimientosService;

@Service
public class MovimientosServiceImpl implements  MovimientosService{
    @Autowired
    private MovimientosRepository movimientosRepository;

    @Autowired
    private CuentasRepository cuentasRepository;

    @Override
    public List<Movimientos> obtenerMovimientos(String numeroCuenta) {
        return null;
    }

    @Override
    public Movimientos crearMovimiento(Movimientos movimiento) {
        if(cuentasRepository.existsById(movimiento.getCuenta())){
            
        }
        Movimientos nvoMov= new Movimientos();
        nvoMov.setCuenta(movimiento.getCuenta());
        nvoMov.setMonto(movimiento.getMonto());
    }

}
