import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static int binToDec(String[] n){
		int numDec=0;
		for(int i=0; i<n.length; i++) {
			if(n[i].equals("1")) {
				numDec += Math.pow(2, i);
			}
		}
		
		return numDec;
	}
	
	public static String[] binToHex(String[] n) {
		int numDec = binToDec(n);
		
		String[] numHex = String.valueOf(numDec).split("");
		
//		for(int i=0; i<numDec)
		
		return numHex;
	}
	
	public static ArrayList<Integer> decToBin(int num) {
		ArrayList<Integer> numBin = new ArrayList <Integer>();
		
		while(num/2 > 0) {
			numBin.add(num%2);
			num = num/2;
		}
		if(num/2 == 0) {
			numBin.add(num%2);
			
		}
		Collections.reverse(numBin);
		return numBin;
	}
	
	public static String[] hexToBin(String[] numHex){
		String[] numDec = new String[numHex.length]; //não é a conversão direta pra decimal !!!!!!!!
		for(int i=0; i<numHex.length; i++) {
			if(numHex[i].equals("a")) {
				numDec[i] = "10";					// ^^^^^^^^^^^^^^^^
			}
			else if(numHex[i].equals("b")){
				numDec[i] = "11";
			}
			else if(numHex[i].equals("c")){
				numDec[i] = "12";
			}
			else if(numHex[i].equals("d")){
				numDec[i] = "13";
			}
			else if(numHex[i].equals("e")){
				numDec[i] = "14";
			}
			else if(numHex[i].equals("f")){
				numDec[i] = "15";
			}
			else {
				numDec[i] = numHex[i];
			}
		}
//		for(int i=0; i<numDec.length; i++) {
//			
//			System.out.println(numDec[i]);
//		}
		String[] numBin = new String[numDec.length];
		for(int i=0; i<numBin.length; i++) {
			numBin[i] = String.valueOf(decToBin(Integer.valueOf(numDec[i])));
		}
		
		return numBin;
	}
	
   public static void main(String args[]) throws IOException {
	
//   		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
   		Scanner input = new Scanner(System.in);
   		int caso = 1;
   		int c = input.nextInt();
   		for(int i=0; i<c; i++) {
   			String n = input.next();
   			String tipo = input.next();
   		
   			if(tipo.equals("bin")) {
   				
   				int numDec = binToDec(n.split(""));
   				String[] numHex = binToHex(n.split(""));
   				System.out.println("Case " + caso + ":");
   				System.out.println(numDec + "dec");
//   				System.out.println(numHex + "\n");
   				
   			}
   			else if(tipo.equals("dec")) {
   				ArrayList<Integer> numBin = decToBin(Integer.valueOf(n));
   				System.out.println("Case " + caso + ":");
   				System.out.print("");
   				for(int cont=0; cont<numBin.size(); cont++) {
   					System.out.print(numBin.get(cont));
   				}
   				
   			}
   			else if(tipo.equals("hex")) {
   				System.out.println("Case " + caso + ":\n");
   				String[] numBin = hexToBin(n.split(""));
   				for(int cont=0; cont<numBin.length; cont++) {
   					System.out.println(numBin[i]);
   				}
   			}
   		}
   		
   }
   		
   	
} 
