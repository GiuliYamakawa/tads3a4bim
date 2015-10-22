package br.com.feltex.academicnet.mdb;

import java.io.Serializable;

public class Professor implements Serializable{
	
	private String nome;
	private long   matricula;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + "]";
	}
	
	

	
	
}
