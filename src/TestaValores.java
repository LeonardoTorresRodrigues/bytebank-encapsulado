
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getAgencia());
		
		new Conta(1337, 16549);
		
		new Conta(666, 56465);
		
		System.out.println(Conta.getTotal());

	}
}
