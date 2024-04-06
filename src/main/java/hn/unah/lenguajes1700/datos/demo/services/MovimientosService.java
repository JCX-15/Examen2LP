package hn.unah.lenguajes1700.datos.demo.services;

import java.util.List;

import hn.unah.lenguajes1700.datos.demo.entities.Movimientos;

public interface MovimientosService {
    public Movimientos crearMovimiento(Movimientos movimiento);
    public List<Movimientos> obtenerMovimientos(String numeroCuenta);
}
