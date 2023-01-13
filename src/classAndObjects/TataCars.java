package classAndObjects;

public class TataCars {
	
	static{
		
		System.out.println("I am in a static block");
		
	}
	
	
	
	void dimesion(int height, int width) {
		System.out.println("Height="+height+" width="+width);
	}
	
	void tailLights() {
		
	}
	
	static boolean ventialtedSeats(boolean flag) {
		return flag;
	}
	
	boolean rootTop(boolean flag) {
		
		return flag;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("I entred main metod");
		
		TataCars tiago = new TataCars();
		TataCars nexon = new TataCars();
		TataCars harrier = new TataCars();
		
		
		tiago.dimesion(10, 5);
		nexon.dimesion(12,7);
		harrier.dimesion(15, 10);		
		
		System.out.println(TataCars.ventialtedSeats(true));
	}
}
