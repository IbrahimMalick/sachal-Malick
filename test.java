package test;

public class test {

public static boolean isVowel (char x) {
	int pos = 0;
	String vowels = "aeiouy";
	
	while (pos < vowels.length()) {
		if (vowels.charAt(pos) == x) {
			return true;
		}
		else {
			pos++;
		}
	}
	return false;
			
}

public static String pigTrans(String phr) {
	int f = 0;
	while (isVowel (phr.charAt(f)) == false) {
		f++;
	}
	
	String front = phr.substring(0, f);
	String body = phr.substring(f, phr.length());
	
	
	if (f == 0) {
		return (phr + "way");
	}
	else {
		return (body + front + "ay");
		
	}

	
}
public static boolean isAlpha (char ch) {
	String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXZ";
	int pos = 0;
	while (pos < alpha.length()) {
		if (alpha.charAt(pos) == ch) {
			return true;
		}
		else {
			pos++;
		}
	}
	
	return false;
}

public static String pigLatin(String phrase) {
	int pos;
	String trans;
	pos = 0;
	trans = "";
	while (phrase.length() > 0) {
		while (isAlpha(phrase.charAt(pos))) {
			pos++;
		}
		trans = trans + pigTrans(phrase.substring(0, pos));
		phrase = phrase.substring(pos);
		pos = 0;
		
	}
	return trans;
	
}

public static void main (String [] args) {
	System.out.println(pigTrans ("hello"));
	System.out.println(pigTrans ("apple"));
	System.out.println(pigTrans ("sachal"));


	System.out.println(pigLatin("Sachal is awesome"));
}

}
