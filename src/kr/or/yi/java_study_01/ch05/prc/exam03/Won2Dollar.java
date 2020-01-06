package kr.or.yi.java_study_01.ch05.prc.exam03;

public class Won2Dollar extends Converter {
	
	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}
	
	@Override
	protected double convert(double src) {
		double result = src / ratio;
		return result;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}

}
