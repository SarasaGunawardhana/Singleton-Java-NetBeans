/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Toshiba
 */
public class Singleton {
    	private static Singleton firstInstance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		
		if (firstInstance == null){
			firstInstance = new Singleton();
			System.out.println("instance created");
		}
		return firstInstance;
	}
	
	public static void main(String arg []) {

		 for (int i = 0; i < 10; i++) {
			Singleton.getInstance();
		}
		}
}
