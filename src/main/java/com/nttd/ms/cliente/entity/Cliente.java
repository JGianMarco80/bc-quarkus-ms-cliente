package com.nttd.ms.cliente.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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

    @Column(name = "tipo_cliente")
    private String tipoCliente;

    @Column(name = "tipo_documento")
    private String tipoDocumento;

    @Column(name = "Numero_documento")
    private String numeroDocumento;

    @Column(name = "Nombre_razon_social")
    private String nombreRazonSocial;

    @Column(name = "fecha_nacimiento_creacion")
    private Date fechaNacimientoCreacion;

    @Column(name = "estado")
    private String estado;

}