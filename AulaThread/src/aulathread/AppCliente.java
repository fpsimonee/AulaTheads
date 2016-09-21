package aulathread;

public class AppCliente extends Thread{

//    public static void main(String args[]) {
//        
//        
//    }

    @Override
    public void run() {
        int porta = 9600;
        String ip = "localhost";
        
        SocketCliente cliente = new SocketCliente(ip, porta);
        Conexao conexao = new Conexao();  
        
        Mensagens ms1 = new Mensagens();
        ms1.setMessage("Ola, Mundo!!");
        ms1.setUser("Felipe");
        
        conexao.send(cliente.getSocket(), ms1);
        
        RespMessage RespMessage = (RespMessage) conexao.receive(cliente.getSocket());
        
        System.out.println(ms1.getUser()+" diz:");
        System.out.println(ms1.getMessage());
        
        System.out.println(RespMessage.getUser()+" diz:");
        System.out.println(RespMessage.getRespMessage());
        
        cliente.encerraCliente();
    }
}