package question_501;

public class Q520_Detect_Capital {
	public boolean detectCapitalUse(String word) {

		if (word.length() <= 1)
			return true;

		char[] arr = word.toCharArray();

		if (isCapital(arr[0])) {
			// case 1: all capital
			if (isCapital(arr[1])) {
				for (int i = 2; i < arr.length; i++) {
					if (!isCapital(arr[i]))
						return false;
				}
			}

			// case 2: only first capital
			else {
				for (int i = 2; i < arr.length; i++) {
					if (isCapital(arr[i]))
						return false;
				}
			}
		} else {
			for (int i = 1; i < arr.length; i++) {
				if (isCapital(arr[i]))
					return false;
			}
		}
		return true;
	}

	public boolean isCapital(char c) {
		return (c - 'A') >= 0 && ('Z' - c) >= 0;
	}
}

/**
 * If 1st is Capital: 2nd to last should be all cap or all lower
 * If 1st is lower: 2nd to last should be all lower
 * */
