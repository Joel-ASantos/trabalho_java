package trabalho.sistema_bancario;

public class Conta {
    private double saldo;

    public Conta(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
