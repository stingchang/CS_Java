package question_151;

public class Q191_Number_of_1_bits {
	// you need to treat n as an unsigned value
	public int hammingWeight(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n & 1;
			n >>>= 1;
		}
		return sum;
	}
}
