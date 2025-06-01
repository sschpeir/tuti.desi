package tuti.desi.entidades;

import jakarta.persistence.Entity;

@Entity
public class Producto extends Ingrediente {

    private Float stockDisponible;
    private Float precioActual;
}
