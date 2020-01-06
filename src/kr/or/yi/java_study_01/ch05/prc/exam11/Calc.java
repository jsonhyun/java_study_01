package kr.or.yi.java_study_01.ch05.prc.exam11;

class Add extends Calc {
	@Override
	int calculate() {
		return this.a + this.b;
	}
}

class Sub extends Calc {
	@Override
	int calculate() {
		return this.a - this.b;
	}
}

class Mul extends Calc {
	@Override
	int calculate() {
		return this.a * this.b;
	}
}

class Div extends Calc{
	@Override
	int calculate() {
		return this.a / this.b;
	}
}

public abstract class Calc {

	protected int a;
	protected int b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	abstract int calculate();
}
