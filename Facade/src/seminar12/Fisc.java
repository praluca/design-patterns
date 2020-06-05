package seminar12;

public class Fisc {
	public static boolean areCreante(String CNP) {
		return Integer.parseInt(String.valueOf(CNP.charAt(CNP.length() -1)))%2==1; 
	}
}
