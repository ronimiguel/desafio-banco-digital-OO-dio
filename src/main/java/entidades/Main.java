package entidades;

public class Main {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		ContaCorrente conta = new ContaCorrente();

		cliente.setNome("Fulano de Tal");
		conta.setConta(1233);
		conta.setSaldo(1000.01);

		System.out.println("---- Cliente ----");
		System.out.println("Nome:\t" + cliente.getNome());
		System.out.println("Conta:\t" + conta.getConta());
		conta.sacar(10.00);
		conta.depositar(20.00);
		System.out.println("Saldo:\t" + conta.getSaldo());
		conta.setTipo("Corrente");


	}
}
