package br.edu.iesb.poo2024.devlab1;

import java.util.Date;

public class Aluno extends Pessoa{
	
	private int id;
	private String nrMatricula;
	private String nomeCurso;
	private int nrSemestre;
	private Date dtMatricula;
	
	public Aluno(int id, String nome, String sobrNome, Date dtNascimento, int id2, String nrMatricula, String nomeCurso,
			int nrSemestre, Date dtMatricula) {
		super(id, nome, sobrNome, dtNascimento);
		id = id2;
		this.nrMatricula = nrMatricula;
		this.nomeCurso = nomeCurso;
		this.nrSemestre = nrSemestre;
		this.dtMatricula = dtMatricula;
	}

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNrMatricula() {
		return nrMatricula;
	}

	public void setNrMatricula(String nrMatricula) {
		this.nrMatricula = nrMatricula;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public int getNrSemestre() {
		return nrSemestre;
	}

	public void setNrSemestre(int nrSemestre) {
		this.nrSemestre = nrSemestre;
	}

	public Date getDtMatricula() {
		return dtMatricula;
	}

	public void setDtMatricula(Date dtMatricula) {
		this.dtMatricula = dtMatricula;
	}
	
}