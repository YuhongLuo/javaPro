package recursiveOne;

public class AddOdd {
	public int addOdd(int num) {
		if (num == 1)
		return 1;
		else
		return num + addOdd(num - 2);
		}
}
