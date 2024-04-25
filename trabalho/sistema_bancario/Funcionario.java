package trabalho.sistema_bancario;

public class Funcionario extends Thread {
    private Conta conta_funcionario;
    private Conta conta_investimento;
    
    public Funcionario(Conta conta_funcionario,Conta conta_investimento){
        this.conta_funcionario = conta_funcionario;
        this.conta_investimento = conta_investimento;
    }

    public void run(){
        /*
         *receber salario
         *fazer investimento de 20% 
        */
    }
}
