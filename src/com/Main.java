/**
 * 
 */
package com;

/**
 * @author dr
 * 
 */
public class Main {

	public Main() {
		stringToConsole("Név érték párok következnek!");
		stringToConsole("Szín","Piros");
		stringToConsole("Hossz","1m");
		stringToConsole("Súly","10kg");
		
		
	}
	
	private void stringToConsole(String consoleText){
		System.out.println(consoleText);
		
	}
	private void stringToConsole(String name , String value){
		System.out.println(name +  ":\t" + value );
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Main();
	}

}
