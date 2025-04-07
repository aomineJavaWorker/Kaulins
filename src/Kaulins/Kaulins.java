package Kaulins;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Kaulins {

	public static void main(String[] args) {
		int skaitlis, reizes;
		ArrayList<Integer> skaitli = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		Random rand = new   Random();
		skaitlis = rand.nextInt(6)+1;
		do {
		System.out.println("Cik reizes mest kauliņu?");
		reizes = scan.nextInt();
		}while(reizes<1);
		for(int i=0; i<reizes;i++) {
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkrita skaitlis: "+skaitlis);
			skaitli.add(skaitlis);
			
		}
		System.out.println(skaitli);

	}

}
