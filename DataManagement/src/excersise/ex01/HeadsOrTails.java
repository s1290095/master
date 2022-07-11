package excersise.ex01;

import java.util.Random;

public class HeadsOrTails {
	public static void main(String args[]) {
		System.out.println("コイン投げ");
		
		Random random = new Random();
		int cntHead = 0;
		int cntTail = 0;
		
		for(int i=0;i<3;i++) {
			int coin = random.nextInt(5);
			System.out.println("Round-" + i+1);
			if(coin % 2 == 0) {
				System.out.println("HEAD");
				cntHead++;
			}
			else {
				System.out.println("TAIL");
				cntTail++;
			}
		}
		System.out.println("HEAD: " + cntHead + ", " + "TAIL: " + cntTail);
	}
}
