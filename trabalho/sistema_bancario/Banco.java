package trabalho.sistema_bancario;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banco {
    private static Lock lock = new ReentrantLock();

    public void transferencia(Conta origem,Conta destino, double valor){
       lock.lock();
        try{
            if(origem.getSaldo() >= valor){
                origem.setSaldo(origem.getSaldo() - valor);
                destino.setSaldo(destino.getSaldo() + valor);
                System.out.println("Valor da tranferencia: R$ " + valor);
            }else {
                System.out.println("Saldo insuficiente!");
            }
        } finally{
            lock.unlock();
        }   
    }
}
