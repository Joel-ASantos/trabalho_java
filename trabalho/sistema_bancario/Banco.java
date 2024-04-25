package trabalho.sistema_bancario;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Banco {
    private static Lock lock = new ReentrantLock(); // add lock

    public static void transferencia(Conta cliente,Conta loja, float valor){

    }
}
