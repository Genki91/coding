package initialization;

public class EX14 {
	static String a = "SonTung";
	static String b;
	static {
		b = "Genki";
	}
	
	public static void main(String[] args) {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}