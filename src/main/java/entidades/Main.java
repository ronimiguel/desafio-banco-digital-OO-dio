package entidades;



public class Main {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Conta conta = new Conta();

		cliente.setNome("Fulano de Tal");
		conta.setConta(1233);

		System.out.println("---- Cliente ----");
		System.out.println("Nome:\t" + cliente.getNome());
		System.out.println("Conta:\t" + conta.getConta());
	}
}
