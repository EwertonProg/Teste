package br.instituto.modelo.cadastro;

public class Curso {

	private String nome;
	private Turno turno;
	private Byte idadeMin;
	private Byte idadeMax;
	private Byte numTurmas;
	private Integer numJovens;// retirar depois do banco pronto

	public Curso() {
		
	}
	
	public Curso(String nome, Turno turno) {
		this.nome = nome;
		this.turno = turno;
	}
	
	public Curso(String nome, Turno turno, Byte idadeMin, Byte idadeMax) {
		this(nome,turno);
		this.idadeMin = idadeMin;
		this.idadeMax = idadeMax;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public Byte getIdadeMin() {
		return idadeMin;
	}

	public void setIdadeMin(Byte idadeMin) {
		this.idadeMin = idadeMin;
	}

	public Byte getIdadeMax() {
		return idadeMax;
	}

	public void setIdadeMax(Byte idadeMax) {
		this.idadeMax = idadeMax;
	}

	public Byte getNumTurmas() {
		return numTurmas;
	}

	public void setNumTurmas(Byte numTurmas) {
		this.numTurmas = numTurmas;
	}

	public Integer getNumJovens() {
		return numJovens;
	}

	public void setNumJovens(Integer numJovens) {
		this.numJovens = numJovens;
	}

}
