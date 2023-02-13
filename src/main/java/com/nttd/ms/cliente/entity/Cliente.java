package com.nttd.ms.cliente.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    //1: natural
    //2: juridica
    @Column(name = "tipo_cliente")
    private String tipoCliente;

    //1: DNI
    //2: Carnet de extranjería
    //3: RUC
    @Column(name = "tipo_documento")
    private String tipoDocumento;

    @Column(name = "Numero_documento")
    private String numeroDocumento;

    @Column(name = "Nombre_razon_social")
    private String nombreRazonSocial;

    @Column(name = "fecha_nacimiento_creacion")
    private LocalDate fechaNacimientoCreacion = LocalDate.now();

    @Column(name = "estado")
    private String estado = "1";

}