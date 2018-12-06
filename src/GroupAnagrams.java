import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Given an array of strings, group anagrams together.
 * 
 * Example:
 * 
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [
 * ["ate","eat","tea"], ["nat","tan"], ["bat"] ] Note:
 * 
 * All inputs will be in lowercase. The order of your output does not matter.
 */
public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> ans = groupAnagrams(input);
		for (List<String> x : ans) {
			System.out.print("[");
			for (String y : x) {
				System.out.print(y);
				System.out.print(",");
			}
			System.out.println("],");
		}
	}

	public static List<List<String>> groupAnagrams(String[] strs) {

		HashMap<String, List<String>> map = new HashMap<>();

		for (String s : strs) {
			char temp[] = s.toCharArray();
			Arrays.sort(temp);
			String key = String.valueOf(temp);
			map.putIfAbsent(key, new ArrayList<String>());
			map.get(key).add(s);
		}

		return new ArrayList<>(map.values());

	}
}
