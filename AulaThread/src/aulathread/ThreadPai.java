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
public class ThreadPai {
    
    public static void main(String[] args) throws InterruptedException{
        
        System.out.println("Eu sou a THREAD PAI e criando as threads filhos");

        Thread t1 = new ThreadFilho("THREAD 1");
        Thread t2 = new ThreadFilho("THREAD 2");
        Thread t3 = new ThreadFilho("THREAD 3");
        
        System.out.println("Iniciando as threads filhos");

        t1.start();
        t2.start();
        t3.start();
        
        t1.join();
        t2.join();
        t3.join();
        
        System.out.println("Encerrando thread pai");

    }
}