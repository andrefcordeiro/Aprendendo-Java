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
//		System.out.print(numDec);
		
		return numDec;    
	}
	
	public static String binToHex(String[] n) {
		
		String[] numHex = new String[n.length/4];
		int c = 0; //contador das posições do numero em hexa 
		
		for(int i=0; i<n.length; i+=4) {
			
			String[] quatroNums = {n[i], n[i+1], n[i+2], n[i+3]};    
		
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
		
		while(numBin.size() % 4 != 0) { //completando os "0" à esquerda, para formar os conjuntos de 4 digitos
			
			numBin.add(0, "0");
		}
	
		return numBin.toArray(String[]::new);
	}
	
	public static String[] hexToBin(String[] numHex){
		
		String[] numDec = new String[numHex.length]; //nÃ£o Ã© a conversÃ£o direta pra decimal !!!!!!!!
		
		for(int i=0; i<numHex.length; i++) {
			if(numHex[i].equals("A")) {
				numDec[i] = "10";					// ^^^^^^^^^^^^^^^^
			}
			else if(numHex[i].equals("B")){
				numDec[i] = "11";
			}
			else if(numHex[i].equals("C")){
				numDec[i] = "12";
			}
			else if(numHex[i].equals("D")){
				numDec[i] = "13";
			}
			else if(numHex[i].equals("E")){
				numDec[i] = "14";
			}
			else if(numHex[i].equals("F")){   
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
		
		System.out.println("");
		
		ArrayList<String> numBin = new ArrayList(); 
		String[] quatroNums = new String[4];
		
		for(int i=0; i<numDec.length; i++) {
			quatroNums = decToBin(Integer.valueOf(numDec[i])); //recebe o array com os quatro digitos em Binario
			
			for(int c=0; c<quatroNums.length; c++) { //percorre o array com os quatro digitos e adiciona 1 a um no arraylist
				
				numBin.add(quatroNums[c]); 
			}
			
		}
		 
		return numBin.toArray(new String[0]); 
	}
	
	public static void main(String args[]) throws IOException {
	
   		Scanner input = new Scanner(System.in);
   		
   		System.out.println("Informe o número: ");
		String n = input.next();
		System.out.println("Informe a base decimal do número [BIN, DEC OU HEX]: ");
		String tipo = input.next();
	
		if(tipo.equals("bin")) { //BINÁRIO
			
			StringBuilder nStrBuilder = new StringBuilder(n);
			
			while(nStrBuilder.length() % 4 != 0) { //completando os "0" à esquerda, para formar os conjuntos de 4 digitos
				
				nStrBuilder.insert(0, "0");
			}
			
			n = nStrBuilder.toString(); 
			double numDec = binToDec(n.split(""));
			System.out.printf("Em dec: %.0f \n", numDec);
			String numHex = binToHex(n.split(""));
			System.out.println("Em hex: " + numHex);

		}
		
		else if(tipo.equals("dec")) { //DECIMAL
			
			String[] numBin = decToBin(Integer.valueOf(n)); 

			System.out.print("Em bin: ");
			for(int cont=0; cont<numBin.length; cont++) {
				if(cont % 4 == 0 && cont != 0)   
					System.out.print(" ");  
				System.out.print(numBin[cont]);
			}
			String numHex = binToHex(numBin);
			
			System.out.print("\nEm hex: ");
			System.out.println(numHex);
			
		} 
		
		else if(tipo.equals("hex")) { //HEXADECIMAL
			
			String[] numBin = hexToBin(n.split("")); 
			System.out.printf("Em bin: "); 
			
			for(int cont=0; cont<numBin.length; cont++) { 
				if(cont % 4 == 0 && cont != 0)    
					System.out.print(" ");   
   				System.out.print(numBin[cont] + ""); 
			}   
			  
			double numDec = binToDec(numBin);   
			System.out.printf("\nEm dec: %.0f", numDec);    
			 
		}	 
		
		input.close();  
   		
   } 
   		 	
} 
