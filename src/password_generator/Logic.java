package password_generator;
import java.security.SecureRandom;

public class Logic {
	String chrs = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#<>$%&*(|)-_=+[]{};.,/?";
	SecureRandom sR = new SecureRandom();

	String gen = sR
		    .ints(20, 0, chrs.length()) //delimita 20, do começo ao fim
		    .mapToObj(i -> chrs.charAt(i)) //mapeia os 20
		    .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append) //pega os 20, ja mapeados
		    .toString(); //e passa pra string
}
