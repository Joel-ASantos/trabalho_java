package trabalho.sistema_bancario;
import java.util.Random;

public class Cliente extends Thread {
    protected Conta conta_cliente;
    Loja loja1;
    Loja loja2;
    Banco banco;
    Random random;

    public Cliente(Conta conta_cliente,Loja loja1,Loja loja2,Banco banco){
        this.conta_cliente = conta_cliente;
        this.loja1 = loja1;
        this.loja2 = loja2;
        this.banco = banco;
        this.conta_cliente.setSaldo(1000.00);
        this.random = new Random();
    }

    public Loja alternar_lojas(Loja loja_selecionada,Loja loja1,Loja loja2){
        return loja_selecionada = random.nextBoolean() ? loja1 : loja2;
    }

    public void run(){
        while(conta_cliente.getSaldo() > 0){
            double valor = (double) (Math.random() < 0.5 ? 100.00 : 200.00);

            Loja loja_selecionada = alternar_lojas(null, loja1, loja2);
            if(loja_selecionada == loja1){
                banco.transferencia(conta_cliente, loja1.conta_loja, valor);
            }else{
                banco.transferencia(conta_cliente, loja2.conta_loja, valor); 
            }
        }
    }
}
