import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(15);
		arrayList.add(25);
		arrayList.add(5);
		arrayList.add(30);

		List<Integer> newList = new ArrayList<Integer>();

		// step1 : get a stream object
		Stream<Integer> openStream = arrayList.stream();
		// step2: configure stream by filtering out required values
		Stream<Integer> filterdStream = openStream.filter(x -> x >= 15);
		// step3:process the stream with collect
		newList = filterdStream.collect(Collectors.toList());
		newList.forEach(x -> System.out.println(x));

		newList = arrayList.stream().filter(x -> x >= 15).collect(Collectors.toList());

	}

}
