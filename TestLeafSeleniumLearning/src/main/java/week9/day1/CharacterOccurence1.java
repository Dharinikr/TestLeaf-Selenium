package week9.day1;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterOccurence1 {

	public static void main(String[] args) {
		
			String input ="HariPrasad";
			String newInput = input.toUpperCase();
			char[] charArray = newInput.toCharArray();
						
			Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
			
	for (char ch : charArray) {
		if(ch!=' ') {
			if(map.containsKey(ch)) {
				int oldValue = map.get(ch);
				map.put(ch,oldValue+1);
			
		}
		else {
			map.put(ch,1);
		}
	}

	
		}

	System.out.println(map);
	}

}
