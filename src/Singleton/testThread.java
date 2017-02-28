/*
 * To change this license header, choose License Headers in Project Properties.
 */
package Singleton;
/**
 * @author Sarasa Gunawardhana
 */
public class testThread implements Runnable {

	public void run(){  
		for (int i = 0; i < 10 ; i++) {
			Singleton.getInstance();			
		}  
		}  
		public static void main(String args[]){  
			new Thread (new testThread ()).start();
			
			for (int i = 0; i < 10 ; i++) {
				Singleton.getInstance();		
			}
		 } 
}