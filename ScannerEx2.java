package tj.exam.ex01;

import java.util.Scanner;

public class ScannerEx2 {
		 
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        while(sc.hasNextInt()) {
	            System.out.println(sc.nextInt()*1000); 
	        }
	        sc.close();
	    }
	 
	}
