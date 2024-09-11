package br.edu.iesb.poo2024.devlab1;

import java.util.Date;

public class TrabalhoConclusaoCurso {

	private int id;
	private String titulo;
	private Date dtInicio;
	private Date dtConclusao;
	private ProfessorOrientadorTCC orientadorTCC;

	private Aluno alunoAutorTCC;
	
	public TrabalhoConclusaoCurso() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	public Date getDtConclusao() {
		return dtConclusao;
	}

	public void setDtConclusao(Date dtConclusao) {
		this.dtConclusao = dtConclusao;
	}

	public ProfessorOrientadorTCC getOrientadorTCC() {
		return orientadorTCC;
	}

	public void setOrientadorTCC(ProfessorOrientadorTCC orientadorTCC) {
		this.orientadorTCC = orientadorTCC;
	}

	public Aluno getAlunoAutorTCC() {
		return alunoAutorTCC;
	}

	public void setAlunoAutorTCC(Aluno alunoAutorTCC) {
		this.alunoAutorTCC = alunoAutorTCC;
	}

}
