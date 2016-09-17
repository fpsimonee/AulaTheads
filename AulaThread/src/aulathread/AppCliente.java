package aulathread;

public class AppCliente {

    public static void main(String args[]) {
        
        int porta = 9600;
        String ip = "localhost";
        
        SocketCliente cliente = new SocketCliente(ip, porta);
        Conexao conexao = new Conexao();        
        

        cliente.encerraCliente();
    }
}