package entidades;

public class ContaCorrente extends Conta {

    private double chequeEspecial;
    private String tipo;


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String tipo() {
        return this.tipo;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial() {
        return this.chequeEspecial;

    }

    @Override
    public void sacar(double valor) {
        valor += 10; //taxa de retirada
        System.out.println("Valor do saque com taxa de 10 reais: "+valor);
        super.sacar(valor);
    }


}
