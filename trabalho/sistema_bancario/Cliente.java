package trabalho.sistema_bancario;

public class Cliente extends Thread {
    private Conta conta_cliente;

    public Cliente(Conta conta_cliente){
        this.conta_cliente = conta_cliente;
    }

    public void run(){
        /*
         *alternar entre as lojas
         *ter um saldo de R$ 1000,00 
        */
    }
}
