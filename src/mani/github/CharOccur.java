package mani.github;

import java.util.HashMap;
import java.util.Map;

public class CharOccur {

	public static void main(String[] args) {
String st= "manikandan";

Map<Character, Integer> charcount= new HashMap<>();

for (Character ch : st.toCharArray()) {
	if (charcount.containsKey(ch)) {
		charcount.put(ch, charcount.get(ch)+1);
		
	}else {
		charcount.put(ch,1);
	}
	
}
System.out.println(charcount);
	}

}
