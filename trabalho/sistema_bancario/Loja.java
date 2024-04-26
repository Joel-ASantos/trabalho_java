package trabalho.sistema_bancario;

public class Loja {
    Conta conta_loja;
    Funcionario funcionarios;
    Banco banco;

    public Loja(Conta conta_loja){
        this.conta_loja = conta_loja;
    }

    public void verificar_conta(Conta conta_loja){
        banco.conferindo_conta(conta_loja); //  uso para conferir  conta da loja 
    }

    public void pagar_funcionario(){
        // pagar funcionario via banco
    }
}
