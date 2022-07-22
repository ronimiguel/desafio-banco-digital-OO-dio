package entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Conta implements IConta {
    private int conta;
    private double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo() {
        return this.saldo;
    }
}


