 package Operations;

public class IncreaseDecreaseOperationExample {
	public static void main(String[] args) {
		int x=10;
		int y=10;
		int z;
		
		System.out.println("*************************");
		x++;
		++x;
		System.out.println("x="+x); //12
		
		y--;
		--y;
		System.out.println("y="+y); //8
		
		z = x++;
		System.out.println(z);//12
		System.out.println(x);//13
		
		z=++x;
		System.out.println(z);//14
		System.out.println(x);//14
	}
}
