package kr.or.yi.java_study_01.ch05.exam03;

public class FountainPen extends BallPen implements Refill{
	
	@Override
	public void refill(int n) {
		setAmount(n);
//		amount = n;
	}
}
