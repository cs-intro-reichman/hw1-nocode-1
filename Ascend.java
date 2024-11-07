// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {

		int a = (int)(Math.random() * 100);
		int b = (int)(Math.random() * 100);
		int c = (int)(Math.random() * 100);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("");


		int firstOrdertest = Math.min(a, b);
        int firstOrderfinal = Math.min(firstOrdertest, c);
        int lastOrdertest = Math.max(a, b);
        int lastOrderfinal = Math.max(lastOrdertest, c);

		int middle = a + b + c - firstOrderfinal - lastOrderfinal; 


		System.out.println(firstOrderfinal);
		System.out.println(middle);
		System.out.println(lastOrderfinal);
	

	}
}
