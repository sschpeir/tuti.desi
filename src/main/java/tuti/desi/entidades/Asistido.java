package tuti.desi.entidades;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Asistido extends Persona {

    private LocalDate fechaRegistro;

    @ManyToOne
    @JoinColumn(name = "familia_id")
    private Familia familia;

	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
}
