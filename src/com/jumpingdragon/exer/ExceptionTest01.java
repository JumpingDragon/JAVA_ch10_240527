package com.jumpingdragon.exer;

public class ExceptionTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			int a =10;
//			int sum = a / 0;
//			System.out.println(sum);
//		} catch(ArithmeticException e) {
//			System.out.println("0 나누기 에러 발생. 다시 확인 바람.");
//			e.printStackTrace(); //에러 코드를 콘솔창에 출력해줌
//		} finally {
//			System.out.println("null 값 발생, 확인 바람.");
//		}
//		
		try {
			int a = 10;
			int sum = a / 0; // 0 나누기 에러 발생
			System.out.println(sum);
		} catch (Exception e){
			System.out.println("0 나누기 에러 발생. 다시 확인 바람.");
			e.printStackTrace(); //에러 코드를 콘솔창에 출력해줌
		} finally {
			System.out.println("에러의 발생 여부와 상관없이 실행됨");
		}
	}

}
