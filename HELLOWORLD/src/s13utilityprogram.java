
import java.util.*;
import java.util.function.*;
import java.util.*;

class MyConsumer<T> implements Consumer<T>{
	public void accept(T ctask) {
		System.out.println("working on the number "+ ctask);
		System.out.println("result after adding 5 to given number is "+ ((int)ctask + 5));
	}
}
public class s13utilityprogram {
	public static void main(String[] args) {
		ArrayList myList;
		MyConsumer mcons;
		myList = new ArrayList<>(5);
		mcons = new MyConsumer();
		myList.add(100);
		myList.add(200);
		myList.add(300);
		myList.add(400);
		myList.add(500);
		System.out.println(myList);
		myList.forEach(mcons);
	}

}
