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
@Table(name = "movimientos")
@Data
public class Movimientos {
    @Id
    @Column(name = "idmovimiento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idMovimiento;

    @Column(name = "tipomoviminento")
    private String tipoMovimiento;
    private  Double monto;

    @Column(name = "fechamovimiento")
    private LocalDate fechaMovimiento;

    @ManyToOne
    @JoinColumn(name="numeroCuenta",referencedColumnName="numeroCuenta")
    private Cuentas cuenta;
}
