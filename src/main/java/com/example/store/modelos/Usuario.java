package com.example.store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombres;
    private String apellido;
    private String cedula;
    private String correo;
    private Integer telefono;
    private Integer direccion;
    private Integer sexo;
    private Integer metodoPago;
    private String pais;
    private String departamento;
    private String municipio;
    private Integer codigoPostal;










}
