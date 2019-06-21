package input.stream.util;

public class FindCommonCharacter {

/**
	 * Find the common character from the two arrays arr1 and arr2 and put into the
	 * arrComm. pass i and j value as zero(0) to initialize recursion
	 */
	public char[] findCommon2(char[] arr1, char[] arr2, int i, char[] arrComm, int j) {
		if (arr1.length > arr2.length) {
			if (i == arr2.length)
				return arrComm;
			char c = findEle(arr2[i++], arr1, 0);
			if (c != '-') {
				arrComm[j++] = c;
			}
			findCommon2(arr1, arr2, i, arrComm, j);
		} else {
			if (i == arr1.length)
				return arrComm;
			char c = findEle(arr1[i++], arr2, 0);
			if (c != '-') {
				arrComm[j++] = c;
			}
			findCommon2(arr1, arr2, i, arrComm, j);
		}
		return arrComm;
	}
  
/**
	 * Find a character c in the array arr1. pass i= 0 here to initialize the
	 * recursion
	 */
	public char findEle(char c, char[] arr1, int i) {
		if (i == arr1.length) {
			return '-';
		}
		if (c == arr1[i++]) {
			return c;
		}
		return findEle(c, arr1, i);
	}
}
