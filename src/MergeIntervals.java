import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Given a collection of intervals, merge all overlapping intervals.
 * 
 * Example 1:
 * 
 * Input: [[1,3],[2,6],[8,10],[15,18]] Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 * Example 2:
 * 
 * Input: [[1,4],[4,5]] Output: [[1,5]] Explanation: Intervals [1,4] and [4,5]
 * are considered overlapping.
 */
/**
 * Definition for an interval. public class Interval { int start; int end;
 * Interval() { start = 0; end = 0; } Interval(int s, int e) { start = s; end =
 * e; } }
 */
public class MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Interval> merge(List<Interval> intervals) {

		if (intervals.size() == 0) {
			return new ArrayList<Interval>();
		}

		Collections.sort(intervals, new Comparator<Interval>() {
			public int compare(Interval a, Interval b) {
				if (a.start > b.start) {
					return 1;
				} else if (a.start < b.start) {
					return -1;
				} else {
					return 0;
				}
			}
		});

		List<Interval> ans = new ArrayList<Interval>();
		ans.add(intervals.get(0));

		for (int i = 1; i < intervals.size(); i++) {
			if (ans.get(ans.size() - 1).end < intervals.get(i).start) {
				ans.add(intervals.get(i));
			} else {
				ans.get(ans.size() - 1).end = Math.max(ans.get(ans.size() - 1).end, intervals.get(i).end);
			}
		}
		return ans;
	}
}
