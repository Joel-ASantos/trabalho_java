package trabalho.sistema_bancario;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // criando o banco
        Banco banco = new Banco();

        // criando contas
        Conta contaCliente = new Conta(1000.00);
        Conta contaFuncionario = new Conta(0);
        Conta contaFuncionarioInvestimento = new Conta(0);
        Conta loja = new Conta(0);

        // criando funcionarios
        Funcionario funcionario1 = new Funcionario(contaFuncionario, contaFuncionarioInvestimento, banco);
        Funcionario funcionario2 = new Funcionario(contaFuncionario, contaFuncionarioInvestimento, banco);
        Funcionario funcionario3 = new Funcionario(contaFuncionario, contaFuncionarioInvestimento, banco);
        Funcionario funcionario4 = new Funcionario(contaFuncionario, contaFuncionarioInvestimento, banco);

        // criando lojas
        Loja loja1 = new Loja(loja, funcionario1,funcionario2, banco);
        Loja loja2 = new Loja(loja, funcionario3,funcionario4, banco);

        // criando clientes
        Cliente cliente1 = new Cliente(contaCliente, loja1 ,loja2, banco);
        Cliente cliente2 = new Cliente(contaCliente, loja1 ,loja2, banco);
        Cliente cliente3 = new Cliente(contaCliente, loja1 ,loja2, banco);
        Cliente cliente4 = new Cliente(contaCliente, loja1 ,loja2, banco);
        Cliente cliente5 = new Cliente(contaCliente, loja1 ,loja2, banco);

        // iniciando a thread clientes
        cliente1.start();
        cliente2.start();
        cliente3.start();
        cliente4.start();
        cliente5.start();

        // vendo se deu tudo certo:

        // saldo das lojas
        System.out.println("saldo da loja1: " + loja1.conta_loja.getSaldo());
        System.out.println("saldo da loja2: " + loja2.conta_loja.getSaldo());
        
        // saldo dos funcionario
        System.out.println("saldo do funcionario1: " + funcionario1.conta_funcionario.getSaldo() + "conta investimento: " + funcionario1.conta_investimento.getSaldo());
        System.out.println("saldo do funcionario2: " + funcionario2.conta_funcionario.getSaldo() + "conta investimento: " + funcionario2.conta_investimento.getSaldo());
        System.out.println("saldo do funcionario3: " + funcionario3.conta_funcionario.getSaldo() + "conta investimento: " + funcionario3.conta_investimento.getSaldo());
        System.out.println("saldo do funcionario4: " + funcionario4.conta_funcionario.getSaldo() + "conta investimento: " + funcionario4.conta_investimento.getSaldo());

        // saldo dos clientes
        System.out.println("saldo do cliente1: " + cliente1.conta_cliente.getSaldo());
        System.out.println("saldo do cliente2: " + cliente2.conta_cliente.getSaldo());
        System.out.println("saldo do cliente3: " + cliente3.conta_cliente.getSaldo());
        System.out.println("saldo do cliente4: " + cliente4.conta_cliente.getSaldo());
        System.out.println("saldo do cliente5: " + cliente5.conta_cliente.getSaldo());
    }
}
