package br.com.spookybank.banco.modelo;

public abstract class Funcionario {
	
	private double salario;
	private String nome;
	private String cpf;
	
	
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public abstract double getBonificacao ();
	
	
	
}
