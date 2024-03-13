package com.example.store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="tipoPrendas")
public class TipoPrenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nombre;
}
