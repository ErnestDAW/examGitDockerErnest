public class Minimum {

	int[] list;

	Minimum(int[] list) {
		if (list == null || list.length == 0)
			throw new IllegalArgumentException("Empty list");
		this.list = list;
	}
	
	public static int GetMin(int[] list) {
		int i, min;

		min = list[0];
		for (i = 1; i < list.length; i++) {
			if (list[i] < min) {
				min = list[i];
			}
		}
		return min;
	}
}
