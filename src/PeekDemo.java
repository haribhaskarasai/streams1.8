import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekDemo {

	public static void main(String[] args) {
		Stream.of(1,2,3,4,5,6,7,8,9,0)
        .filter(x -> x%2 ==0)
        .peek(e -> System.out.println("The even numbers are : " + e));

	}

}
