import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ListFirstSumRunner ();	        // test list sum first
		ListOddToEvenRunner ();         // test list odd to even
		ListDonwRunner();	        // test list down
	}

	public static void ListFirstSumRunner () {
		System.out.println("ListFirstSum Test:");
		List<Integer> ray = new ArrayList<Integer>();
		ray.add(10);
		ray.add(9);
		ray.add(11);
		ray.add(12);
		System.out.println(ray);
		System.out.println(ListSumFirst.go(ray));
		ray.set(0,-1);
		System.out.println(ray);
		System.out.println(ListSumFirst.go(ray));
		ray.add(13);
		ray.add(14);
		System.out.println(ray);
		System.out.println(ListSumFirst.go(ray));
		ray.remove(1);
		System.out.println(ray);
		System.out.println(ListSumFirst.go(ray));
	}
	
	public static void ListOddToEvenRunner () {
		System.out.println("ListOddToEven Test:");
		List<Integer> ray = new ArrayList<Integer>();
		ray.add(10);
		ray.add(9);
		ray.add(11);
		ray.add(12);
		System.out.println(ray);
		System.out.println(ListOddToEven.go(ray));
		ray.add(13);
		ray.add(14);
		System.out.println(ray);
		System.out.println(ListOddToEven.go(ray));
		ray.set(3, 15);
		ray.set(5, 17);
		System.out.println(ray);
		System.out.println(ListOddToEven.go(ray));		
	}
	
	public static void ListDonwRunner () {
		System.out.println("ListDown Test:");
		List<Integer> ray = new ArrayList<Integer>();
		ray.add(10);
		System.out.println(ray);
		System.out.println(ListDown.go(ray));		
		ray.add(9);
		ray.add(8);
		ray.add(7);
		System.out.println(ray);
		System.out.println(ListDown.go(ray));
		ray.add(13);
		ray.add(14);
		System.out.println(ray);
		System.out.println(ListDown.go(ray));
	}
}