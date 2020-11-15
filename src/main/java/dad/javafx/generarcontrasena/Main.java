package dad.javafx.generarcontrasena;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;

public class Main {
	
	public static void main(String[] ar) {
		String password;
		Scanner in = new Scanner(System.in);
		System.out.print("Introduce una contraseña. Se imprimirá cifrada: ");
		password = in.nextLine();
		in.close();
		
		String md5 = DigestUtils.md5Hex(password).toUpperCase();
		System.out.println("Password cifrado: " + md5);
	}
}

//Usuario: Daniel, Password: daniel96, PWCIFRADA: 36B0CFF83EFBA1422CE4CCE264086F7B
//Usuario: Ana, Password: ana94, PWCIFRADA: 7436DE76FFDC39769039900D90B04FD9