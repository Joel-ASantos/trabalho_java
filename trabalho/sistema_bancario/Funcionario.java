package trabalho.sistema_bancario;

public class Funcionario extends Thread {
    Conta conta_funcionario;
    private Conta conta_investimento;
    private double valor_retirado;
    Banco banco;
    
    public Funcionario(Conta conta_funcionario,Conta conta_investimento,double valor_retirado){
        this.conta_funcionario = conta_funcionario;
        this.conta_investimento = conta_investimento;
        this.conta_funcionario.saldo = 0;
        this.conta_investimento.saldo = 0;
        this.valor_retirado = valor_retirado;
    }

    public void run(){
        if(conta_funcionario.saldo == 1400.00){
            valor_retirado = conta_funcionario.saldo * 0.20;
            banco.transferencia(conta_funcionario, conta_investimento, valor_retirado);
        }
    }
}
