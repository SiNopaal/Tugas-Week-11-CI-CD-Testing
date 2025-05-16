import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Curent Count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Curent Count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Curent Count:" + counter.getCount());
		
	}

}
