import java.util.ArrayList;
import java.util.List;

/**
 * Given two integers n and k, return all possible combinations of k numbers out
 * of 1 ... n.
 * 
 * Example:
 * 
 * Input: n = 4, k = 2 Output: [ [2,4], [3,4], [2,3], [1,2], [1,3], [1,4], ]
 */
public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(combine(4, 2));
	}

	public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		int[] temp = new int[k];
		int i = 0;
		while (i >= 0) {
			temp[i]++;
			if (temp[i] > n) {
				i--;
			} else if (i == k - 1) {
				ArrayList<Integer> tempList = new ArrayList<Integer>();
				for (int x : temp) {
					tempList.add(x);
				}
				ans.add(tempList);
			} else {
				i++;
				temp[i] = temp[i - 1];
			}
		}
		return ans;
	}

}
