import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountDemo {

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
		Stream<Integer> filteredStream = openStream.filter(x -> x >= 15);
		// step3:process the stream with count
	
		long streamCount = filteredStream.count();
		
		
		
		long streamCount2 = arrayList.stream().filter(x -> x >= 15).count();
		System.out.println(streamCount);
	}

}
