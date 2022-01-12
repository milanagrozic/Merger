public class Merger {

	public int[] doMerge(int[] arrayA, int[] arrayB) {

		int lengthA = arrayA != null ? arrayA.length : 0;
		int lengthB = arrayB != null ? arrayB.length : 0;

		int pointerA = 0;
		int pointerB = 0;
		int pointerC = 0;

		int[] mergedArray = new int[lengthA + lengthB];

		while (pointerA < lengthA && pointerB < lengthB) {
			if (arrayA[pointerA] <= arrayB[pointerB]) {
				mergedArray[pointerC] = arrayA[pointerA];
				pointerA++;
			} else {
				mergedArray[pointerC] = arrayB[pointerB];
				pointerB++;
			}
			pointerC = pointerC + 1;
		}

		while (pointerB < lengthB) {
			mergedArray[pointerC] = arrayB[pointerB];
			pointerB++;
			pointerC++;
		}

		while (pointerA < lengthA) {
			mergedArray[pointerC] = arrayA[pointerA];
			pointerA++;
			pointerC++;
		}

		return mergedArray;
	}

}
