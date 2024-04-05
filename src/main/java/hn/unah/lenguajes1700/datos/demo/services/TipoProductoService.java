package hn.unah.lenguajes1700.datos.demo.services;

import java.util.List;

import hn.unah.lenguajes1700.datos.demo.entities.TipoProducto;

public interface TipoProductoService {

    public TipoProducto crearProducto(TipoProducto tipoProducto);
    public List<TipoProducto> obtenerTipoProductos();
    public String eliminarTipoProducto(long id);
}
