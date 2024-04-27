package trabalho.sistema_bancario;

public class Cliente extends Thread {
    protected Conta conta_cliente;
    Loja loja;
    Banco banco;

    public Cliente(Conta conta_cliente,Loja loja){
        this.conta_cliente = conta_cliente;
        this.loja = loja;
        this.banco = banco;
        this.conta_cliente.setSaldo(1000.00);
    }

    public void run(){
        while(conta_cliente.getSaldo() > 0){
            float valor = (float) (Math.random() < 0.5 ? 100.00 : 200.00);
            banco.transferencia(conta_cliente, loja.conta_loja, valor); // fazer a transferencia da compra
        }
    }
}
