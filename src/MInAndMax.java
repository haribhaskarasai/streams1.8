import java.util.ArrayList;
import java.util.List;

public class MInAndMax {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(15);
		arrayList.add(25);
		arrayList.add(5);
		arrayList.add(30);

		// minimum
		Integer mini = arrayList.stream().min((i1, i2) -> i2.compareTo(i1)).get();
		System.out.println(mini);

		// maximum
		Integer max = arrayList.stream().max((i1, i2) -> i2.compareTo(i1)).get();
		System.out.println(max);
	}

}
