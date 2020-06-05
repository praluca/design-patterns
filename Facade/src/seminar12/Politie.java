package seminar12;

public class Politie {
	
	public static boolean esteUrmarit(String CNP) {
		return Integer.parseInt(String.valueOf(CNP.charAt(CNP.length() -1)))%2==1; 
		
	}

}
