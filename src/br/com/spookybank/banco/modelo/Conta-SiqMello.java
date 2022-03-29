package br.com.spookybank.banco.modelo;

/**
 * Está classe representa a moldura de uma Conta
 * 
 * @author Rafael Siq
 *
 */
public abstract class Conta extends Object {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	/**
	 * Construtor pede agencia e número para criação de Conta
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta (int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Criando uma nova conta");
		total++;
	}

/**
 * 	O Método pede como parametro um valor para comparação com Saldo
 * se o valor for maior que saldo, devolve Exception
 * @param valor
 * @throws SaldoInsuficienteException
 *
 */		
	public void saca (double valor) {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo " + this.saldo + ", Valor " + valor);
		}
		this.saldo -= valor;
	}

//	pede que a classe que herder implemente o método deposita, 
//	direcionando o valor pra classe mãe usando super para acessar o valor
	public abstract void deposita (double valor);

	public void transfere (double valor, Conta destino) {
		this.saca(valor);
		destino.deposita(valor);
	}

	public void extrato () {
		System.out.println("O Saldo da Conta é de R$ "+ this.saldo);
	}

	public double getSaldo () {
		return this.saldo;
	}
	
	public int getAgencia () {
		return this.agencia;
	}
	
	public int getConta () {
		return this.numero;
	}
	
	public Cliente getTitular () {
		return this.titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public String toString() {
		return "Número: " + this.getConta() + ", Agencia: " + this.getAgencia();
	}
	
	@Override
	public boolean equals(Object o) {
		Conta ref = (Conta) o;
		if (ref.agencia != this.agencia && ref.numero != this.numero) {
			return false;
		} else {
			return true;
		}
	}
}
