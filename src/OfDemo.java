import java.util.stream.Stream;

public class OfDemo {

	public static void main(String[] args) {
		
		Stream.of(1,10,20,30).forEach(x-> System.out.println(x));
		
		String[] names= {"Hari","Narendra","Swamy","Shubashish"};
		Stream.of(names).filter(x-> x.length() >4).forEach(x->System.out.println(x));

}
}