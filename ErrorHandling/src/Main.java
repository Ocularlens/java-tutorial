import java.util.InputMismatchException;
import java.util.Scanner;

class SampleException extends Exception {
	SampleException(String message) {
		super(message);
	}

}

public class Main {

	private int input1, input2, answer;
	private Scanner scanner;

	public static void main(String[] args) throws SampleException {
		// TODO Auto-generated method stub

		Main main = new Main();

		try {
			main.execute();
		} catch (ArithmeticException e) {
			System.out.println("Division by zero is not allowed input again");

			main.execute();
		} catch (InputMismatchException e) {
			System.out.println("Incorrect input,  input again");

			main.execute();
		} finally {
			System.out.print("Done");
		}

//		exceptionSample(3);

		throw new SampleException("Message");
	}

	public void execute() {
		scanner = new Scanner(System.in);
		System.out.print("Input first number: ");
		this.input1 = scanner.nextInt();
		System.out.print("Input second number: ");
		this.input2 = scanner.nextInt();

		this.answer = this.input1 / this.input2;

		System.out.println("Answer: " + this.answer);
	}

	static int exceptionSample(int n) throws InputMismatchException {
		if (n == 1)
			throw new InputMismatchException("Number is equal to one");

		return n;
	}

}
