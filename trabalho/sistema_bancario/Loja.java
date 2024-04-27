package trabalho.sistema_bancario;

public class Loja {
    Conta conta_loja;
    Funcionario primeiroFuncionario;
    Funcionario segundoFuncionario;
    Banco banco;

    public Loja(Conta conta_loja,Banco banco){
        this.conta_loja = conta_loja;
        this.banco = banco;
    }

    public boolean verificar_conta_pagamento(double valor){
        return (conta_loja.getSaldo() >= valor);
    }

    public void pagar_funcionario(Funcionario primeiroFuncionario,Funcionario segundoFuncionario) {
        double salario = 1400.00;
        if(verificar_conta_pagamento(salario * 2)){
            banco.transferencia(conta_loja, primeiroFuncionario.conta_funcionario, salario);
            banco.transferencia(conta_loja, segundoFuncionario.conta_funcionario, salario);
        } else {
            System.out.println("Saldo insuficiente para pagar funcionários.");
        }
    }
}
