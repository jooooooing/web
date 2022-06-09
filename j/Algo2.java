package j;

import java.util.Scanner;

public class Algo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int R = scan.nextInt();
		int treeNum = scan.nextInt();

		for (int i = 0; i < treeNum; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();

			if (Math.pow((x - a), 2) + Math.pow((y - b), 2) >= Math.pow(R, 2)) {
				System.out.println("silent");

			} else {
				System.out.println("noisy");
			}

			if (i == treeNum - 1) {
				System.out.println("개행");
			}
		}
		scan.close();
	}


}
