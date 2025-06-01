package tuti.desi.entidades;

import jakarta.persistence.Entity;

@Entity
public class Voluntario extends Persona {

    private String nroSeguridadSocial;

	public String getNroSeguridadSocial() {
		return nroSeguridadSocial;
	}

	public void setNroSeguridadSocial(String nroSeguridadSocial) {
		this.nroSeguridadSocial = nroSeguridadSocial;
	}
}
