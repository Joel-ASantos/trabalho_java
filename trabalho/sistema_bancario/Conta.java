package trabalho.sistema_bancario;

public class Conta {
    private int id_conta;
    private double saldo;

    public Conta(int id_conta,double saldo){
        this.id_conta = id_conta;
        this.saldo = saldo;
    }

    public int getId_conta() {
        return this.id_conta;
    }

    public void setId_conta(int id_conta) {
        this.id_conta = id_conta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
