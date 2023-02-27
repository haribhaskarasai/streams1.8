import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortDemo {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(15);
		arrayList.add(25);
		arrayList.add(5);
		arrayList.add(30);

//		// ascending order
//		Stream<Integer> stream3 = arrayList.stream().sorted();
//		stream3.forEach(x -> System.out.println(x));

		// descending order
		Stream<Integer> stream4 = arrayList.stream().sorted((i1, i2) -> i2.compareTo(i1));
		stream4.forEach(x -> System.out.println(x));

	}

}
