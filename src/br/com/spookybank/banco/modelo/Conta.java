package br.com.spookybank.banco.modelo;

/**
 * Est� classe representa a moldura de uma Conta
 * 
 * @author Rafael Siq
 *
 */

// Comparable adiciona metodo para compara��o natural entre contas
public abstract class Conta extends Object implements Comparable <Conta> {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	/**
	 * Construtor pede agencia e n�mero para cria��o de Conta
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
 * 	O M�todo pede como parametro um valor para compara��o com Saldo
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

//	pede que a classe que herder implemente o m�todo deposita, 
//	direcionando o valor pra classe m�e usando super para acessar o valor
	public abstract void deposita (double valor);

	public void transfere (double valor, Conta destino) {
		this.saca(valor);
		destino.deposita(valor);
	}

	public void extrato () {
		System.out.println("O Saldo da Conta � de R$ "+ this.saldo);
	}

	public double getSaldo () {
		return this.saldo;
	}
	
	public int getAgencia () {
		return this.agencia;
	}
	
	public int getNumero () {
		return this.numero;
	}
	
	public Cliente getTitular () {
		return this.titular;
	}
	
	public void setTitular (Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public String toString() {
		return "N�mero: " + this.getNumero() + ", Agencia: " + this.getAgencia() + " Saldo: R$" + this.saldo;
	}
	
	// Override desse m�todo define a ordem natural de compara��o das contas, assinatura de Comparable
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
}
