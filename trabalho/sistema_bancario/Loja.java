package trabalho.sistema_bancario;

public class Loja {
    Conta conta_loja;
    Funcionario funcionarios;
    Banco banco;

    public Loja(Conta conta_loja){
        this.conta_loja = conta_loja;
    }
    public void verificar_conta(){
        banco.conferindo_conta(conta_loja, 0);
    }

    public void pagar_funcionario(){
        // pagar funcionario via banco
    }
}
