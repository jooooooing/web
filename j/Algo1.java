package j;

import java.util.Scanner;

public class Algo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		String[] strArr = new String[inputNum];
		for (int i = 0; i < inputNum; i++) {
			String inputStr = scanner.next();
			strArr[i] = inputStr;
		}
		System.out.println(resolve(inputNum, strArr));
	}

	public static String resolve(int num, String[] strArr) {

		String Answer = "";
		int cnt = 0;
		for (int i = 0; i < num; i++) {
			if (cnt == num - 1) {
				Answer += strArr[i] + ".";
			} else {
				Answer += strArr[i] + ",";
			}
			cnt++;
		}

		Answer = "Hello " + Answer;

		return Answer;

	}


}
