package hn.unah.lenguajes1700.datos.demo.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cuentas")
@Data
public class Cuentas {
    @Id
    @Column(name = "numerocuenta")
    private String numeroCuenta;

    private Double  saldo;
    
    @Column(name = "fechaapertura")
    private LocalDate fechaApertura=LocalDate.now();

    private Boolean estado;
    private Boolean sobregiro;

    @ManyToOne
    @JoinColumn(name="dni", referencedColumnName = "dni")
    private Cliente cliente;

    @OneToMany
    private List<Movimientos> movimientos;
}
