import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ToArrayDemo {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(15);
		arrayList.add(25);
		arrayList.add(5);
		arrayList.add(30);

		// step1 : get a stream object
		Stream<Integer> openStream = arrayList.stream();
		// step2: configure stream by filtering out required values
		Stream<Integer> filterdStream = openStream.filter(x -> x >= 15);
		//step3: convert into object array
		
		Object[] objectArray=filterdStream.toArray();
		for (Object object : objectArray) {
			System.out.println("Element in arrayis: "+ object);
			
		}

	}

}
