package classAndObjects;

public class Sample {
	public static void increment(int x, int y)
{
		x++;
		y=y+1;
		System.out.println(x + " : " + y);
}

}

class Main1{
	
	public static void main(String[] args) {
		int a=10;
		int b=40;
		Sample.increment(a,b);

	}
}
