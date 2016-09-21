package aulathread;

public class AppServidor extends Thread{

//    public static void main(String args[]) {
//
//        
//
//    }

    @Override
    public void run() {
   int porta = 9600;
        String texto;
        
        SocketServidor servidor = new SocketServidor(porta);
        Conexao conexao = new Conexao();
        
        

        if (servidor.connect()) {
            Mensagens msg = (Mensagens) conexao.receive(servidor.getClientSocket());
                String nome = msg.getUser();
                String mensage = msg.getMessage();
                
                RespMessage resposta = new RespMessage();
                resposta.setRespMessage("Conectado ao servidor!");
                resposta.setUser("Servidor");
        
               conexao.send(servidor.getClientSocket(), resposta);
            servidor.encerraServidor();
        }
    }
}
