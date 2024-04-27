package trabalho.sistema_bancario;

public class Loja {
    Conta conta_loja;
    Funcionario funcionarios;
    Banco banco;

    public Loja(Conta conta_loja){
        this.conta_loja = conta_loja;
    }

    public boolean verificar_conta_pagamento(Conta conta_loja){
        if(conta_loja.saldo != 0 && conta_loja.saldo >= 1400){
            return true;
        }
        System.out.println("Não possui o valor suficiente para pagar o funcionario");
        return false;
    }

    public void pagar_funcionario(Funcionario funcionarios){
        if(verificar_conta_pagamento(conta_loja)){
            banco.transferencia(conta_loja, funcionarios.conta_funcionario, 1400);
        }
    }
}
