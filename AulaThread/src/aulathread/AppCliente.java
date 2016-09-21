package aulathread;

public class AppCliente implements Runnable{

    public static void main(String args[]) {
        
        int porta = 9600;
        String ip = "localhost";
        
        SocketCliente cliente = new SocketCliente(ip, porta);
        Conexao conexao = new Conexao();        
        

        cliente.encerraCliente();
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}