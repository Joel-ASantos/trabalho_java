package trabalho.sistema_bancario;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Funcionario extends Thread {
    private Conta conta_funcionario;
    private Conta conta_investimento;
    private double valor_retirado;
    Banco banco;
    
    static Lock lock = new ReentrantLock();


    public Conta getConta_funcionario() {
        return this.conta_funcionario;
    }

    public void setConta_funcionario(Conta conta_funcionario) {
        this.conta_funcionario = conta_funcionario;
    }

    public Conta getConta_investimento() {
        return this.conta_investimento;
    }

    public void setConta_investimento(Conta conta_investimento) {
        this.conta_investimento = conta_investimento;
    }

    public Funcionario(Conta conta_funcionario,Conta conta_investimento,Banco banco){
        this.conta_funcionario = conta_funcionario;
        this.conta_investimento = conta_investimento;
        this.conta_funcionario.setSaldo(0.0);
        this.conta_investimento.setSaldo(0.0);;
        this.banco = banco;
    }

    public void investimento(){
        lock.lock();
        try{
            if(conta_funcionario.getSaldo() >= 1400.00){
                valor_retirado = conta_funcionario.getSaldo() * 0.20;
                banco.transferencia(conta_funcionario, conta_investimento, valor_retirado);
            }
        } finally{
            lock.unlock();
        }
    }
}
