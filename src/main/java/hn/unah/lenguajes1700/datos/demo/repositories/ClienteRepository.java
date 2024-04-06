package hn.unah.lenguajes1700.datos.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes1700.datos.demo.entities.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente,String>{

}
