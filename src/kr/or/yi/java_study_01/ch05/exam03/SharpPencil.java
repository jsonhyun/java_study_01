package kr.or.yi.java_study_01.ch05.exam03;

public class SharpPencil extends Pen implements Refill{
	private int width;

	@Override
	public void refill(int n) {
		setAmount(n);
	}

	
}
