public class ExceptionsDemo {

	private static void f(String z) {
	    g(z);
	    System.out.println('y');
	}

	private static void g(String z) {
	    int[] arr = new int[5];
	    System.out.println(z.length()); // what if z is null?
	    System.out.println(arr[5]);     // outside array    
	}

	public static void main(String[] args) {
	    String n = null;
	    f(n);
	    System.out.println('x');
	}
}
