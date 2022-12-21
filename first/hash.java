package first;
import java.util.*;
public class hash {
	public static void main(String args[]) {
		String s = "rohith";
		HashMap<Character,Integer> charc = new HashMap<>();
		for (int i = s.length()-1;i >= 0;i--) {
			if(charc.containsKey(s.charAt(i))) {
				int count = charc.get(s.charAt(i));
				charc.put(s.charAt(i), ++count);
			}
			else {
				charc.put(s.charAt(i), 1);
			}
		}
		System.out.println("Result: "+charc);
	}

}
