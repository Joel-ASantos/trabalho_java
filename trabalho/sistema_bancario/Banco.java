package trabalho.sistema_bancario;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banco {
    private static Lock lock = new ReentrantLock(); // add lock

    public static boolean conferindo_conta(Conta contaLojas){
        // verificar se recebeu algo na conta *usar na loja
        if(contaLojas.saldo != 0){
            return true;
        }
        return false;
    }

    public static void transferencia(Conta origem,Conta destino, float valor){
        if(lock.tryLock()){
            try{
                if(origem.saldo >= valor){
                    origem.saldo -= valor;
                    destino.saldo +=valor;
                }else{
                    System.out.println("Saldo insuficiente!");
                }
            } finally{
                lock.unlock();
            }
        }else{
            System.out.println("Erro durante a operação");
        }
    }
}
