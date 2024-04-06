package hn.unah.lenguajes1700.datos.demo.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cliente")
@Data
public class Cliente {
    @Id
    private String dni;

    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;

    @OneToOne
    private Direccion direccion;

    @OneToMany
    private List<Cuentas> cuentas;
}
