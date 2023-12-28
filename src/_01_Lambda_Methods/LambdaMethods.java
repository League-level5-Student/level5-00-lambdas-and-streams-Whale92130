package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((s) -> {
			String weturn = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				weturn += s.charAt(i);
			}
			System.out.println(weturn);
		}, "reverse");
		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			String weturn = "";
			for (int i = 0; i < s.length(); i++) {
				if (i % 2 == 0) {
					weturn += Character.toUpperCase(s.charAt(i));
				} else {
					weturn += Character.toLowerCase(s.charAt(i));
				}
			}
			System.out.println(weturn);
		}, "this is upper and lower case");
		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((s) -> {
			String weturn = "";
			for (int i = 0; i < s.length(); i++) {
				weturn+=s.charAt(i);
				weturn+=".";
			}
			System.out.println(weturn);
		}, "this sentece has periods between each character");
		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.
		printCustomMessage((s) -> {
			String weturn = "";
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'o' && s.charAt(i) != 'u' && s.charAt(i) != 'y' && s.charAt(i) != 'i') {
					weturn+=s.charAt(i);
				}
			}
			System.out.println(weturn);
		}, "there are no vowels in this sentence");

	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
