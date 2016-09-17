package aulathread;

public class AppServidor {

    public static void main(String args[]) {

        int porta = 9600;
        String texto;
        
        SocketServidor servidor = new SocketServidor(porta);
        Conexao conexao = new Conexao();

        if (servidor.connect()) {
        
//               conexao.send(servidor.getClientSocket(), resultado);
            servidor.encerraServidor();
        }

    }
}
