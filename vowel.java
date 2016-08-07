import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class vowel {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		char n;
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enetr the number");
		n=(char)b.read();
		switch(n){
		case 'a':
			System.out.println("is vowel");
			break;
		case 'e':
			System.out.println("vowel");
			break;
		case 'i':
			System.out.println("vowel");
			break;
		case 'o':
			System.out.println("vowel");
			break;
		case 'u':
			System.out.println("vowel");
			break;
			default:
				System.out.println("not vowel");
		}

	}

}
