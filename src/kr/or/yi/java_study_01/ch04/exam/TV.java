package kr.or.yi.java_study_01.ch04.exam;

public class TV {
	private String name;
	private int year;
	private int inch;
	
	public TV(String name, int year, int inch) {
		this.name = name;
		this.year = year;
		this.inch = inch;
	}

	@Override
	public String toString() {
		return String.format("%s에서 만든 %s년형 %s인치 TV", name, year, inch);
	}
	
}
