package trabalho.sistema_bancario;

public class Loja {
    Conta conta_loja;
    Funcionario primeiroFuncionarios;
    Funcionario segundoFuncionarios;
    Banco banco;

    public Loja(Conta conta_loja,Funcionario primeiroFuncionarios,Funcionario segundoFuncionarios,Banco banco){
        this.conta_loja = conta_loja;
        this.primeiroFuncionarios = primeiroFuncionarios;
        this.segundoFuncionarios = segundoFuncionarios;
        this.banco = banco;
    }

    public boolean verificar_conta_pagamento(Conta conta_loja){
        if(conta_loja.getSaldo() >= 1400.00){
            return true;
        }
        return false;
    }

    public void pagar_funcionario(Funcionario primeiroFuncionarios,Funcionario segundoFuncionarios){
        boolean saldo_conta = verificar_conta_pagamento(conta_loja);
        if(saldo_conta){
            double salario = 1400.00;
            banco.transferencia(conta_loja, primeiroFuncionarios.conta_funcionario, salario);
            banco.transferencia(conta_loja, segundoFuncionarios.conta_funcionario, salario);
        }else{
            System.out.println("saldo insuficiente para pagar funcionarios");
        }
    }
}
