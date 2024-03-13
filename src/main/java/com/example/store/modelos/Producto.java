package com.example.store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nombre;
    private Integer refencia;
    private Integer cantidadBodega;
    private Integer precioUnitario;
    private String descripcion;
    private String fotogrsfis;
    private String talla;

}
