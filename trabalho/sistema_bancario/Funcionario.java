package trabalho.sistema_bancario;

public class Funcionario extends Thread {
    Conta conta_funcionario;
    protected Conta conta_investimento;
    private double valor_retirado;
    Banco banco;
    
    public Funcionario(Conta conta_funcionario,Conta conta_investimento,Banco banco){
        this.conta_funcionario = conta_funcionario;
        this.conta_investimento = conta_investimento;
        this.conta_funcionario.setSaldo(0.0);
        this.conta_investimento.setSaldo(0.0);;
        this.banco = banco;
    }

    public void investir(){
        if(conta_funcionario.getSaldo() >= 1400.00){
            valor_retirado = conta_funcionario.getSaldo() * 0.20;
            banco.transferencia(conta_funcionario, conta_investimento, valor_retirado);
        }
    }
}
