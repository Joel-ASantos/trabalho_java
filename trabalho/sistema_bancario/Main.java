package trabalho.sistema_bancario;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Banco banco = new Banco();

        Conta contaCliente1 = new Conta(1000.00);
        Conta contaCliente2 = new Conta(1000.00);
        Conta contaCliente3 = new Conta(1000.00);
        Conta contaCliente4 = new Conta(1000.00);
        Conta contaCliente5 = new Conta(1000.00);
        
        Conta contaFuncionario1 = new Conta(0.0);
        Conta contaFuncionario2 = new Conta(0.0);
        Conta contaFuncionario3 = new Conta(0.0);
        Conta contaFuncionario4 = new Conta(0.0);

        Conta contaFuncionarioInvestimento1 = new Conta(0.0);
        Conta contaFuncionarioInvestimento2 = new Conta(0.0);
        Conta contaFuncionarioInvestimento3 = new Conta(0.0);
        Conta contaFuncionarioInvestimento4 = new Conta(0.0);
        
        Conta loja1 = new Conta(0);
        Conta loja2 = new Conta(0);

        Funcionario funcionario1 = new Funcionario(contaFuncionario1, contaFuncionarioInvestimento1, banco);
        Funcionario funcionario2 = new Funcionario(contaFuncionario2, contaFuncionarioInvestimento2, banco);
        Funcionario funcionario3 = new Funcionario(contaFuncionario3, contaFuncionarioInvestimento3, banco);
        Funcionario funcionario4 = new Funcionario(contaFuncionario4, contaFuncionarioInvestimento4, banco);

        Loja loja01 = new Loja(loja1, banco);
        Loja loja02 = new Loja(loja2, banco);

        Cliente cliente1 = new Cliente(contaCliente1, loja01 ,loja02, banco);
        Cliente cliente2 = new Cliente(contaCliente2, loja01 ,loja02, banco);
        Cliente cliente3 = new Cliente(contaCliente3, loja01 ,loja02, banco);
        Cliente cliente4 = new Cliente(contaCliente4, loja01 ,loja02, banco);
        Cliente cliente5 = new Cliente(contaCliente5, loja01 ,loja02, banco);

        cliente1.start();
        cliente2.start();
        cliente3.start();
        cliente4.start();
        cliente5.start();

        try {
            cliente1.join();
            cliente2.join();
            cliente3.join();
            cliente4.join();
            cliente5.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        loja01.pagar_funcionario(funcionario1,funcionario2);
        loja02.pagar_funcionario(funcionario3,funcionario4);

        funcionario1.investimento();
        funcionario2.investimento();
        funcionario3.investimento();
        funcionario4.investimento();
        
        System.out.println("saldo da loja1: " + loja01.conta_loja.getSaldo());
        System.out.println("saldo da loja2: " + loja02.conta_loja.getSaldo());
        
        System.out.println("\n");

        System.out.println("saldo do funcionario1: " + funcionario1.getConta_funcionario().getSaldo() + " conta investimento: " + funcionario1.getConta_investimento().getSaldo());
        System.out.println("saldo do funcionario2: " + funcionario2.getConta_funcionario().getSaldo() + " conta investimento: " + funcionario2.getConta_investimento().getSaldo());
        System.out.println("saldo do funcionario3: " + funcionario3.getConta_funcionario().getSaldo() + " conta investimento: " + funcionario3.getConta_investimento().getSaldo());
        System.out.println("saldo do funcionario4: " + funcionario4.getConta_funcionario().getSaldo() + " conta investimento: " + funcionario4.getConta_investimento().getSaldo());

        System.out.println("\n");

        System.out.println("saldo do cliente1: " + cliente1.conta_cliente.getSaldo());
        System.out.println("saldo do cliente2: " + cliente2.conta_cliente.getSaldo());
        System.out.println("saldo do cliente3: " + cliente3.conta_cliente.getSaldo());
        System.out.println("saldo do cliente4: " + cliente4.conta_cliente.getSaldo());
        System.out.println("saldo do cliente5: " + cliente5.conta_cliente.getSaldo());
    }
}