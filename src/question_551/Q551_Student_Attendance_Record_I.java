package question_551;

public class Q551_Student_Attendance_Record_I {
	public boolean checkRecord(String s) {
		if (s.length() < 2)
			return true;
		char[] arr = s.toCharArray();

		int a = arr[0] == 'A' ? 1 : 0;
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] == 'L' && arr[i - 1] == 'L' && arr[i + 1] == 'L')
				return false;

			if (arr[i] == 'A')
				a++;
			if (a > 1)
				return false;
		}
		a += arr[arr.length - 1] == 'A' ? 1 : 0;
		if (a > 1)
			return false;

		return true;
	}
}