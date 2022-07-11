package excersise.ex01;

import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
	public static void main(String args[]) {
		System.out.println("Who are you?");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Hello!" + name + "!");
		System.out.println("Tossing a coin...");
		
		Random random = new Random();
		int cntHead = 0;
		int cntTail = 0;
		
		for(int i=0;i<3;i++) {
			int coin = random.nextInt(5);
			if(coin % 2 == 0) {
				System.out.println("Round-" + (i+1) + ": HEAD");
				cntHead++;
			}
			else {
				System.out.println("Round-" + (i+1) + ": TAIL");
				cntTail++;
			}
		}
		System.out.println("HEAD: " + cntHead + ", " + "TAIL: " + cntTail);
		
		if(cntHead > cntTail) {
			System.out.println(name + " won!");
		}
		else {
			System.out.println(name + " lose!");
		}
		sc.close();
	}
}
