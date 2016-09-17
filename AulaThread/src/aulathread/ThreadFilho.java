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
public class ThreadFilho extends Thread{

	String nomeThreadFilho;
	
	public ThreadFilho(String nome){
		this.nomeThreadFilho = nome;
	}

	public void run(){
		
			try {
				
				if(nomeThreadFilho.equalsIgnoreCase("thread 1")){
					sleep(500);
					System.out.println("Eu sou a thread filho - "+nomeThreadFilho);
				}
				if(nomeThreadFilho.equalsIgnoreCase("thread 2")){
					sleep(500);
					System.out.println("Eu sou a thread filho - "+nomeThreadFilho);
					
				}
				if(nomeThreadFilho.equalsIgnoreCase("thread 3")){
					sleep(500);
					System.out.println("Eu sou a thread filho - "+nomeThreadFilho);
					
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	}
}