package Kaulins;

import java.util.Random;
import java.util.Scanner;

public class Kaulins {

	public static void main(String[] args) {
		int skaitlis, reizes;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		skaitlis = rand.nextInt(6)+1;
		System.out.println("Cik reizes mest kauliņu?");
		reizes = scan.nextInt();
		for(int i=0; i<reizes;i++) {
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkrita skaitlis: "+skaitlis);
			
		}

	}

}
