package Exercicio5;

public class Reverte {

	public static void main(String[] args) {
		
		String s = "Alavanca"; 
		String invertida = ""; 
		
		for (int i = s.length()-1; i >= 0; i--) { 
			invertida += s.charAt(i); 
		} 
		System.out.println(invertida);
	}
}
