package Kaulins;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Kaulins {
	
	static void mestKaulinu(int reizes) {
		int skaitlis, lielakais =0;
		Random rand = new Random();
		for(int i=0; i<reizes;i++) {
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkrita skaitlis"+skaitlis);
		if(lielakais<skaitlis) {
			lielakais = skaitlis;
		}
		}
		System.out.println("Lielakais skaitlis ir "+lielakais);
		
	}

	public static void main(String[] args) {
		int skaitlis, reizes;
		ArrayList<Integer> skaitli = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		Random rand = new   Random();
		skaitlis = rand.nextInt(6)+1;
		do {
		System.out.println("Cik reizes mest kauliņu?");
		reizes=scan.nextInt();
		mestKaulinu(reizes);
		}while(reizes<1);

	}

}
