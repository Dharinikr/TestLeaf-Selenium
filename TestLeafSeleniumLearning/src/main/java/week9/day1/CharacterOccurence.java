package week9.day1;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterOccurence {

	public static void main(String[] args) {
		String input ="HariPrasad";
		
		char[] charArray = input.toCharArray();
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
for (char ch : charArray) {
	if(map.containsKey(ch)) {
		
	}
	else {
		map.put(ch,1);
	}
}

System.out.println(map);
	}

}
