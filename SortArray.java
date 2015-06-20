import java.util.Arrays;

/**
 * @author varunverma
 *
 */
public class SortArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = { 21, 23, 54, 67, 98, 10 };

		arr = InsertElement(arr, 53);
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

	}

	static int[] InsertElement(int[] a, int e) {
		a = Arrays.copyOf(a, a.length + 1);
		a[a.length - 1] = e;
		return a;
	}

}
