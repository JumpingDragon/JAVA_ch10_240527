package com.jumpingdragon.exer;

public class ExceptionTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throwTest(10,0);
		} catch(NullPointerException e) {
			//e.printStackTrace();
			System.out.println("0 나누기 에러 발생");
		}
				
	}
	//예외 떠넘기기
	public static void throwTest(int a, int b) throws ArithmeticException{
		System.out.println(a/b);
	} //에러가 났을 때 에러를 잡아주는데 throwTest에서 난 에러의 처리를 위임.

}
