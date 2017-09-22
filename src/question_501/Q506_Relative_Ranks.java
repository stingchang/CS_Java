package question_501;

import java.util.Arrays;
import java.util.Comparator;

public class Q506_Relative_Ranks {
	public String[] findRelativeRanks(int[] nums) {
		int len = nums.length;
		Pair[] pair = new Pair[len];
		for (int i = 0; i < len; i++) {
			pair[i] = new Pair(nums[i], i+1);
		}
//for(Pair p: pair)	System.out.print("("+p.val+","+p.rank+")");
//System.out.println();
		Arrays.sort(pair, new Comparator<Pair>() {
			@Override
			public int compare(Pair o1, Pair o2) {
				return o2.val - o1.val;
			}
		});
//
//for(Pair p: pair)	System.out.print("("+p.val+","+p.rank+")");
//System.out.println();
		String[] metals = {"Gold Medal", "Silver Medal", "Bronze Medal"};
		String[] rank = new String[len];
		for(int i =0; i< len; i++){
			if(pair[i].rank>3)
				rank[i] = String.valueOf(pair[i].rank);
			else
				rank[i] = metals[pair[i].rank-1];
		}

		return rank;
	}

	public static void main(String[] args) {
		Q506_Relative_Ranks q = new Q506_Relative_Ranks();
		int[] arr = { 10,3,8,9,4 };
		String[] result = q.findRelativeRanks(arr);
		System.out.println(Arrays.toString(result));
	}

	class Pair {
		int val;
		int rank;

		public Pair(int v, int r) {
			val = v;
			rank = r;
		}
	}

}
/*
		Map<Integer, Integer> order = new TreeMap<>(
				Comparator.<Integer>naturalOrder().reversed()
		);
		for(int i =0; i<nums.length; i++)
			order.put(nums[i], i);

		String[] arr = new String[order.size()];
		Iterator<Integer> it = order.keySet().iterator();
		arr[order.get(it.next())] = "Gold Medal";
		arr[order.get(it.next())] = "Silver Medal";
		arr[order.get(it.next())] = "Bronze Medal";
		//"Gold Medal", "Silver Medal", "Bronze Medal"
		int number = 4;
		while(it.hasNext()) arr[order.get(it.next())] = String.valueOf(number++);

		return arr;
 */