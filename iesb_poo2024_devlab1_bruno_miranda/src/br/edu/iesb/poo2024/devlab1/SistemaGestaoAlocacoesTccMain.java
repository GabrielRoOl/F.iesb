package br.edu.iesb.poo2024.devlab1;

import java.util.ArrayList;

public class SistemaGestaoAlocacoesTccMain {

	public static void main(String[] args) {
		
		System.out.println("Gabriel Rodrigues de Oliveira - 2312130033\n");
		Professor professor = new Professor();
		professor.setNome("João");
		professor.setCargoProfessor("Professor Assistente");
		
		Aluno aluno = new Aluno();
		aluno.setNome("Maria");
		aluno.setNrSemestre(7);
		aluno.setNomeCurso("Ciencias da computação");
		
		LinhaPesquisaOrientacao linhaPesquisa = new LinhaPesquisaOrientacao(1, "Desenvolvimento de software", "Técnicas de desenvolvimento em 00");
		
		ArrayList<LinhaPesquisaOrientacao> listaLinhasPesquisa = new ArrayList<LinhaPesquisaOrientacao>();
		listaLinhasPesquisa.add(linhaPesquisa);
		 
		ProfessorOrientadorTCC orientadorTCC = new ProfessorOrientadorTCC();
		orientadorTCC.setQtdVagasOrientacao(2);
		orientadorTCC.setListaLinhaPesquisa(listaLinhasPesquisa);
		
		TrabalhoConclusaoCurso tcc = new TrabalhoConclusaoCurso();
		tcc.setAlunoAutorTCC(aluno);
		tcc.setOrientadorTCC(orientadorTCC);
		tcc.setTitulo("Implementação de sistema de informação para a empresa XYZ");
		
		System.out.println("Professor cadastro: " + professor.getNome());
		System.out.println("Aluno cadastrado: " + aluno.getNome());
		System.out.println("TCC cadastrado: " + tcc.getTitulo());		

	}

}
