package br.instituto.modelo.cadastro;

import java.util.Date;
import java.util.List;

public class Jovem {
	private String nomeCompleto;
	private String nomePai;
	private String nomeMae;
	private Date dataNascimento;
	private Date dataInscricao;
	private Endereco endereco;
	private Escolaridade escolaridade;
	private Curso curso;
	private String rg;
	private List<String> numeros;
	
	public Jovem(String nomeCompleto, Date dataNascimento, String rg) {
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.rg = rg;
	}
	
	public Jovem(String nomeCompleto, Date dataNascimento, Endereco endereco, Escolaridade escolaridade, Curso curso,
			String rg, List<String> numeros) {
		this(nomeCompleto,dataNascimento,rg);
		this.endereco = endereco;
		this.escolaridade = escolaridade;
		this.curso = curso;
		this.numeros = numeros;
	}

	public Jovem() {
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public List<String> getNumeros() {
		return numeros;
	}

	public void setNumeros(List<String> numeros) {
		this.numeros = numeros;
	}

	public Date getDataInscricao() {
		return dataInscricao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Escolaridade getEscolaridade() {
		return escolaridade;
	}
	
	@Override
	public boolean equals(Object obj) {
		Jovem jovem = (Jovem) obj;
		return this.getRg().equals(jovem.getRg()) ;
	}

}
