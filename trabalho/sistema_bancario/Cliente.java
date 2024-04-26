package trabalho.sistema_bancario;

public class Cliente extends Thread {
    protected Conta conta_cliente;
    Loja loja;
    Banco banco;

    public Cliente(Conta conta_cliente,Loja loja){
        this.conta_cliente = conta_cliente;
        this.loja = new Loja(conta_cliente);
        this.banco = new Banco();
    }

    public void run(){
        conta_cliente.saldo = 1000;
        while (conta_cliente.saldo > 0) {
            // alternar entre as lojas e gastar entre 100 e 200
        }
    }
}
