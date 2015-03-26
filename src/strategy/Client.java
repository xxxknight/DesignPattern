package strategy;

public class Client {

	public static void main(String[] args) {
		Strategy s = new AddStrategy();
		Environment e = new Environment(s);
		System.out.println(e.calculate(3, 4));

		s = new SubStrategy();
		e.setStrategy(s);
		System.out.println(e.calculate(3, 4));

		s = new MulStrategy();
		e.setStrategy(s);
		System.out.println(e.calculate(3, 4));

		s = new DivStrategy();
		e.setStrategy(s);
		System.out.println(e.calculate(3, 4));

	}

}
