public class Conta {
	// atributos
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	// construtor
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;

		if (agencia <= 0) {
			System.out.println("Valor de agencia incorreto. A agencia deve ser maior que 0");
		}
		System.out.println("Estou criando uma conta " + this.numero);
	}

	// comportamentos / métodos

	public void deposita(double valor) {
		if (valor <= 0) {
			System.out.println("valor insuficiente. Deposite mais de R$0,00");
			return;
		}
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (saca(valor)) {
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}