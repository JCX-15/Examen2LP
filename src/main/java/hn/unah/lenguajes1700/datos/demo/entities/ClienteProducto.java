package hn.unah.lenguajes1700.datos.demo.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "clienteproducto")
@Data
public class ClienteProducto {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "numeroproducto")
    private long numeroProducto;

    @ManyToOne
    @JoinColumn(name = "dni", referencedColumnName = "dni")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "codigotipoproducto", referencedColumnName = "codigotipoproducto")
    private TipoProducto tipoproducto;

    @Column(name = "fechaapertura")
    private LocalDate fechaApertura;
    private char estado;
    private double saldo;


}
