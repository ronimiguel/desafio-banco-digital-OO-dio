package entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Conta {
    private int conta;
    private double saldo;
    private int deposito;
    private int saque;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void retirar(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo() {
        return this.saldo;
    }
}


