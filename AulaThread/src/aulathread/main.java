/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulathread;

/**
 *
 * @author felipe
 */
public class main {

    public static void main(String args[]) {

        AppServidor servidor = new AppServidor();
        Thread threadServidor = new Thread(servidor);
        threadServidor.start();

        //System.out.print(threadServidor.getState());

        AppCliente cliente = new AppCliente();
        Thread threadCliente = new Thread(cliente);
        threadCliente.start();

    }
}
