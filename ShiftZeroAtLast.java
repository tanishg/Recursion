
// Shift all the zero's at the end from an integer array without changing the sequence of other integers.

public class ShiftZero{

	/**
	 * Use recursion to shift all the zero's at the end from an integer type array.
	 *  eg: i/p: {1,0,0,3,0} o/p: {1,3,0,0,0}
	 */
	int[] arrMod(int[] arr, int index, int count) {
		if (arr.length == index) {
			return arr;
		}
		if (arr[index++] == 0) {
			count++;
			arrMod(arr, index, count);
		} else {
			if (count != 0) { // Here, we can also use swapping method.  
				--index;
				int temp = index - count;
				int a = arr[index];
				int b = arr[temp];
				arr[index] = b;
				arr[temp] = a;
				index = temp;
				count = 0;
			}
			arrMod(arr, index, count);
		}
		return arr;
	}

}
