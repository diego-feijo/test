package diegofeijo;

import java.security.InvalidParameterException;

public class Main {
	
	private static float execute(String op, float f1, float f2) {
		if (op.equals("'+'")) {
			return f1 + f2;
		} else if (op.equals("'*'")) {
			return f1 * f2;
		} else if (op.equals("'-'")) {
			return f1 - f2;
		} else if (op.equals("'/'")) {
			return f1 / f2;
		} else {
			throw new InvalidParameterException("Invalid operation.");
		}
	}

	public static void main(String[] args) {
		
		System.out.println(args);
		System.out.println(args.length);
		
		for (String s: args) {
			System.out.println(s);
		}
		
		if (args.length != 3) {
			throw new InvalidParameterException("Syntax: java Main <Number1> '<op>' <Number2>");
		}
		
		float f1 = Float.parseFloat(args[0]);
		float f2 = Float.parseFloat(args[2]);
		
		String op = args[1];
		
		float result = Main.execute(op, f1, f2);
		
		// TODO Auto-generated method stub
		System.out.println("Result: " + result);
	}

}
