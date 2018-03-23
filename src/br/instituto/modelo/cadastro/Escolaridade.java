package br.instituto.modelo.cadastro;

public class Escolaridade {
	private String colegio;
	private NivelEscolaridade nivel;
	private Turno turno;

	public enum NivelEscolaridade {
		PRIMEIRO, SEGUNDO, TERCEIRO, EMC;
	}

	public Escolaridade(String colegio, NivelEscolaridade nivel, Turno turno) {
		this.colegio = colegio;
		this.nivel = nivel;
		this.turno = turno;
	}

	public String getColegio() {
		return colegio;
	}

	public void setColegio(String colegio) {
		this.colegio = colegio;
	}

	public String getNivel() {
		return nivel.name();
	}

	public void setNivel(NivelEscolaridade nivel) {
		this.nivel = nivel;
	}

	public String getTurno() {
		return turno.name();
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

}
