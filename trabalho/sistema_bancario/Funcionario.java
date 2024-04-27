package trabalho.sistema_bancario;

public class Funcionario extends Thread {
    Conta conta_funcionario;
    private Conta conta_investimento;
    Banco banco;
    
    public Funcionario(Conta conta_funcionario,Conta conta_investimento){
        this.conta_funcionario = new Conta(MIN_PRIORITY, MAX_PRIORITY);
        this.conta_investimento = new Conta(MIN_PRIORITY, MAX_PRIORITY);
        this.conta_funcionario.saldo = 0;
        this.conta_investimento.saldo = 0;
    }

    public void run(){

    }
}
