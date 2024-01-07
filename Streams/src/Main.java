import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		IntStream.range(0, 10).forEach(x -> System.out.print(x + " "));
		System.out.println();
		IntStream.range(0, 10).skip(5).forEach(x -> System.out.print(x + " "));
		System.out.println();
		System.out.println(IntStream.range(0, 10).sum());

		String[] str = { "Curry", "James", "Durant" };

		Stream<String> strSteam = Stream.of(str);

		strSteam.sorted().forEach(System.out::print);
		System.out.println();
		Arrays.stream(str).filter(x -> x.startsWith("Jam")).forEach(System.out::print);
		System.out.println();
		Arrays.stream(new int[] { 1, 2, 4, 5 }).map(x -> x * x).forEach(x -> System.out.print(x + " "));
	}
}
