package hn.unah.lenguajes1700.datos.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1700.datos.demo.entities.TipoProducto;
import hn.unah.lenguajes1700.datos.demo.services.impl.TipoProductoServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class TipoProductoContoller {
    @Autowired
    private TipoProductoServiceImpl tipoProductoServiceImpl;

    @PostMapping("/tipoproducto/crear")
    public TipoProducto crearTipoProducto(@RequestBody TipoProducto tipoProducto) {
        return this.tipoProductoServiceImpl.crearProducto(tipoProducto);
    }
    
}
