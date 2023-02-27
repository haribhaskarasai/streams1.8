import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(15);
		arrayList.add(25);
		arrayList.add(5);
		arrayList.add(30);

		List<Integer> newList = new ArrayList<Integer>();

//		// filter without streams:
//		newList = findElements(arrayList);
//		for (Integer i : newList) {
//
//			System.out.println(i);
//		}

		
		
		// filter with streams:

		// step1 : get a stream object
		Stream<Integer> openStream = arrayList.stream();
		// step2: configure stream by filtering out required values
		Stream<Integer> filterdStream = openStream.filter(x -> x >= 15);
		// step3:process the stream with collect
		newList = filterdStream.collect(Collectors.toList());
		newList.forEach(x -> System.out.println(x));

//		newList = arrayList.stream().filter(x -> x >= 15).collect(Collectors.toList());
//
//
//
		// Map

		newList = arrayList.stream().map(i -> i * i).collect(Collectors.toList());
		newList.forEach(x -> System.out.println(x));

		


	}

	public static List<Integer> findElements(List<Integer> arrList) {
		List<Integer> newList1 = new ArrayList<Integer>();
		for (Integer i : arrList) {
			if (i >= 15) {
				newList1.add(i);
			}

		}
		return newList1;

	}

}
