public class Test{
	public static void main (String args[]){
	int a = 10;
	int b = 100;
	
	while (a < b){
		System.out.println(b);
		//System.pause(7);
		Thread.sleep(400);
		b--;
	
	}
	
	System.out.println("Ende des Programms mit Wert: "+b);
	}
}