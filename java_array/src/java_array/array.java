package java_array;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		int[] number = new int[10];
		number[0] = 10;
		number[1] = 12;
		number[2] = 14;
		number[3] = 16;
		number[4] = 18;
		number[5] = 20;
		number[6] = 22;
		number[7] = 24;
		number[8] = 26;
		number[9] = 28;
		System.out.println(number[0]);
		System.out.println(number[1]);
		System.out.println(number[2]);
		System.out.println(number[3]);
		System.out.println(number[4]);
		System.out.println(number[5]);
		System.out.println(number[6]);
		System.out.println(number[7]);
		System.out.println(number[8]);
		System.out.println(number[9]);
		System.out.println();
		
		int num[] = {11, 12, 13, 14, 15};
		for(int i=0; i<5; i++) {
			System.out.println(num[i]);
		}
		System.out.println();
		
		int numbers [] =  {55, 60, 70, 82};
		int sum = Arrays.stream(numbers).sum();
		System.out.println(sum);
		
		int nums[] = {5, 8, -1, 2};
		for (int i = 0; i < numbers.length; i++) {
			if(nums[i] % 2 == 0) {
				System.out.println(nums[i]+"偶数");
			}else {
				System.out.println(nums[i]+"奇数");
			}
		}System.out.println();
		
		int[] numms = {10, 20, 30, 40, 50};
		//配列[]で中身を取り出す
		int score = 0;
		//初期値
		for(int i =0; i < numms.length; i++) {
		//.length配列の中身の数（配列の数（今回の場合は５）が増えても対応7できる）
			score += numms[i];
		}
		if(score > 100) {
			System.out.println("閾値を超えました");
		}System.out.println();
		
		int[][] table = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j=0; j < 9; j++) {
				table[i][j] = (i + 1) * (j + 1);
			}
		}
		for (int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				System.out.print(table[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
