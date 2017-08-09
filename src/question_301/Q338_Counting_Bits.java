package question_301;

import java.util.Arrays;

public class Q338_Counting_Bits {
	public int[] countBits(int num) {
		int[] bits = new int[num + 1];

		Arrays.fill(bits, 1);
		bits[0] = 0;
		if (num <= 2)
			return bits;

		int curPowOf2 = 2;

		for (int cur = 3; cur <= num; cur++) {
			if (cur < curPowOf2 * 2) {
				bits[cur] = bits[cur % curPowOf2] + 1;
			} else {
				bits[cur] = 1;
				curPowOf2 = cur;
			}
		}
		return bits;
	}
}
