package br.edu.iesb.poo2024.devlab1;

import java.util.Date;

public class Pessoa {
	
	private int id;
	protected String nome;
	protected String sobrNome;
	protected Date dtNascimento;
	
	public Pessoa() {
	}
	
	public Pessoa(int id, String nome, String sobrNome, Date dtNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrNome = sobrNome;
		this.dtNascimento = dtNascimento;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrNome() {
		return sobrNome;
	}
	public void setSobrNome(String sobrNome) {
		this.sobrNome = sobrNome;
	}
	public Date getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
}
