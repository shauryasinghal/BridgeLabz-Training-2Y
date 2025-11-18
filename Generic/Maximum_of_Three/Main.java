package Generic.Maximum_of_Three;

public class Main {
	public static <T extends Number & Comparable> void maximum(T x, T y, T z) {
		
		if(x.compareTo(y)>=x.compareTo(z) || x.compareTo(y)<=x.compareTo(z)) {
			System.out.println("Largest number is: "+x);
		}
		else if(y.compareTo(x)>=x.compareTo(z) || y.compareTo(x)<=x.compareTo(z)) {
			System.out.println("Largest number is: "+y);
		}
		else {
			System.out.println("Largest number is: "+z);
		}
	}
	public static void main(String[] args) {
		maximum(1,2,3);
		maximum(3,4,2);
		maximum(4,2,3);
	}
}
