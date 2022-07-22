package entidades;



public class Main {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Conta conta = new Conta();

		cliente.setNome("Fulano de Tal");
		conta.setConta(1234);
		conta.setSaldo(1000.01);

		System.out.println("---- Cliente ----");
		System.out.println("Nome:\t" + cliente.getNome());
		System.out.println("Conta:\t" + conta.getConta());
		conta.retirar(10.00);
		System.out.println("Saldo:\t" + conta.getSaldo());

	}
}
