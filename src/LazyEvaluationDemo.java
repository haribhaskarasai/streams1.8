import java.util.stream.Stream;

public class LazyEvaluationDemo {

	public static void main(String[] args) {

		Stream stream = Stream.of(1, 2, 3, 4, 5).peek(e -> System.out.println("The numbers are : " + e))
				.filter(i -> i % 2 == 0).peek(e -> System.out.println("The even numbers are : " + e));

		System.out.println("Invoking terminal method count.");

		System.out.printf("The count is " + stream.count());

	}

}
