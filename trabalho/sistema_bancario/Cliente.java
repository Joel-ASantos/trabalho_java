package trabalho.sistema_bancario;

public class Cliente extends Thread {
    protected Conta conta_cliente;
    Loja loja;
    Banco banco;

    public Cliente(Conta conta_cliente,Loja loja){
        this.conta_cliente = conta_cliente;
        this.loja = loja;
        this.banco = new Banco();
        this.conta_cliente.saldo = 1000;
    }

    public void run(){
        while(conta_cliente.saldo > 0){
            float valor = (float) (Math.random() < 0.5 ? 100.00 : 200.00);
            banco.transferencia(conta_cliente, loja.conta_loja, valor);
        }
    }
}
