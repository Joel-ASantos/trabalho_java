package trabalho.sistema_bancario;

public class Loja {
    private Conta conta_loja;
    Funcionario funcionarios;
    Cliente cliente;
    Banco banco;

    public Loja(Conta conta_loja){
        this.conta_loja = conta_loja;
    }

    public void verificar_conta(){
        
    }

    public void pagar_funcionario(){
        // pagar funcionario via banco
    }
}
