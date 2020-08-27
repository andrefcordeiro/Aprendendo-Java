import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static double binToDec(String[] n){
		double numDec=0;
		for(int i=n.length-1; i>=0; i--) { //percorre todos os digitos
			if(n[i].equals("1")) {
				numDec = numDec +  Math.pow(2, n.length-1-i);
			} 
		}
		
		return numDec;  
	}
	
	public static String binToHex(String[] n) {
		
		String[] numHex = new String[n.length/4];
		int c = 0; //contador das posições do numero em hexa 
		
		for(int i=0; i<n.length; i+=4) {
			
			String[] quatroNums = {n[i], n[i+1], n[i+2], n[i+3]};
			
//			for(int cont=0; cont<4; cont++) {
//				System.out.print(quatroNums[cont] + " ");
//			}
//			System.out.println();
//			
			double numDec = binToDec(quatroNums); 
			
			switch((int)numDec) {
				
				case 10: 
					numHex[c] = "A";
					break;
					
				case 11:
					numHex[c] = "B";
					break;
					
				case 12:
					numHex[c] = "C";
					break;
					
				case 13:
					numHex[c] = "D";
					break;
					
				case 14:
					numHex[c] = "E";
					break;
					
				case 15:
					numHex[c] = "F";
					break;
					
				default:
					numHex[c] = String.valueOf((int)numDec);
					break;
			}
			
			c++;
		}

		return String.join("", numHex);
	}
	
	public static String[] decToBin(int num) {
		ArrayList<String> numBin = new ArrayList <String>();
		
		while(num/2 > 0) {
			numBin.add(String.valueOf(num%2)); 
			num = num/2;
		}
		if(num/2 == 0) {
			numBin.add(String.valueOf(num%2));
			
		}
		Collections.reverse(numBin);
		
		if(numBin.size() % 2 == 1) {
			numBin.add(0, "0");
		}
		
		return numBin.toArray(String[]::new);
	}
	
//	public static ArrayList<Integer> decToHex(ArrayList<Integer> num){
//		
//	}
	
	public static String[] hexToBin(String[] numHex){
		String[] numDec = new String[numHex.length]; //nÃ£o Ã© a conversÃ£o direta pra decimal !!!!!!!!
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
   		
   		System.out.println("Informe o número: ");
		String n = input.next();
		System.out.println("Informe a base decimal do número [BIN, DEC OU HEX]: ");
		String tipo = input.next();
	
		if(tipo.equals("bin")) {
			 
			double numDec = binToDec(n.split(""));
			System.out.printf("Em dec: %.0f \n", numDec);
			String numHex = binToHex(n.split(""));
			System.out.println("Em hex: " + numHex);

		}
		
		else if(tipo.equals("dec")) {
			String[] numBin = decToBin(Integer.valueOf(n));

			System.out.print("Em bin: ");
			for(int cont=0; cont<numBin.length; cont++) { 
				System.out.print(numBin[cont]);
			}
			String numHex = binToHex(numBin);
			
			System.out.print("\nEm hex: ");
			System.out.println(numHex);
			
		} 
		
		else if(tipo.equals("hex")) {
			System.out.println("Case " + caso + ":\n");
			String[] numBin = hexToBin(n.split(""));
   				for(int cont=0; cont<numBin.length; cont++) {
//   					System.out.println(numBin[i]);
   				}
   			}

   		
   }
   		
   	
} 
