﻿package CodeUp;

import java.util.Scanner;

public class Codeup_1090 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력된 값
		
		long a = sc.nextInt(); // a = sc
		int r = sc.nextInt(); // r = sc
		
		for(int n=sc.nextInt();n>1;n--) { // n = sc, n>1일 경우 반복 실행한다., 실행한 뒤 n에 1을 뺀 값으로 초기화 한다.
			a *= r; // a = a*r; a를 a*r의 값으로 초기화 한다.
		}
		System.out.println(a); // a
		
		sc.close();
	}
}

