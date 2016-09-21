package aulathread;

public class AppServidor implements Runnable{

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

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
