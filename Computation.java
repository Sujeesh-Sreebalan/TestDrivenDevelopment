package TestDrivenDevelopment;

class Computation{
	
	/**
	 * Function to find a group of contiguous elements such that somewhere in the array, the same group appears in reverse order.
	 * 
	 * @param maxMirror The Input Array 
	 * @return The maximum length of Mirror element
	 * @throws AssertionError If size of array is zero then error is thrown
	 */
	public int calculateLongestMirrorSize(int[] maxMirror) throws AssertionError{
		int size = maxMirror.length;
		if(size == 0) {
			throw new AssertionError("Cannot Compute on empty array");
		}
		int count = 0;
		int maxLength = 0;
		
		for(int startIndex = 0; startIndex < size; startIndex++) {
			count = 0;
			for(int endIndex = size-1; startIndex + count < size && endIndex > -1; endIndex--) {
				if(maxMirror[startIndex + count] == maxMirror[endIndex]) {
					count++;
				}else {
					if(count > 0) {
						maxLength = Math.max(maxLength, count);
						count = 0;
					}
				}
			}
			maxLength = Math.max(maxLength, count);
		}
		return maxLength;
	}
	
	/**
	 * Function to find a series of 2 or more adjacent elements of the same value
	 * 
	 * @param countClumps The Input Array 
	 * @return Number of clumps in araay
	 * @throws AssertionError If size of array is zero then error is thrown
	 */
	public int calculateClumps(int[] countClumps) throws AssertionError{
		int size = countClumps.length;
		if (size == 0) {
			throw new AssertionError("Cannot Compute on empty array");
		}
		int clumps = 0;
		
		if(size > 1) {
			for(int index = 1; index < size-1; index++) {
				if(countClumps[index-1] == countClumps[index] && countClumps[index] != countClumps[index+1]) {
					clumps++;
				}
			}
			if(countClumps[size-1] == countClumps[size-2]) {
				clumps++;
			}
		}
		
		return clumps;
	}
	
	/**
	 * Function to find that every X is immediately followed by a Y.
	 * 
	 * @param fixXY The input Array
	 * @param X The input Integer
	 * @param Y The input Integer
	 * @return same input array but modified in such a way that X is immediately followed by a Y.
	 * @throws AssertionError If size of array is zero then error is thrown.
	 */
	public int[] fixArray(int[] fixXY, int X, int Y) throws AssertionError{
		int size = fixXY.length;
		if(size == 0) {
			throw new AssertionError("Cannot Compute on empty array");
		}
		// if last element is X throw error
		if(fixXY[size-1] == X) {
			throw new AssertionError("X cannot occurs at the last index of array");
		}
		
		// if two adjacent x is present throw error
		int countX = 0;
		int countY = 0;
		for(int i=0; i < size-1; i++) {
			if(fixXY[i] == X) { 
				countX++;
			}
			if(fixXY[i] == Y) {
				countY++;
			}
			
			if(fixXY[i] == X && fixXY[i+1] == X) {
				throw new AssertionError("Two adjacents X values are there");
			}
		}
		
		// If Count of X id greater than Count of Y then throw error
		if(fixXY[size - 1] == Y) {
			countY++;
		}
		if(countX > countY) {
			throw new AssertionError("There are unequal numbers of X and Y in input array");
		}

		
		for(int xIndex = 0; xIndex < size; xIndex++) {
			if(fixXY[xIndex] == X) {
				for(int yIndex = 0; yIndex < size; yIndex++) {
					if(fixXY[yIndex] == Y) {
						if( yIndex == 0 || fixXY[yIndex - 1] != X) {
							int temp = fixXY[xIndex+1];
							fixXY[xIndex + 1] = Y;
							fixXY[yIndex] = temp;
						}
					}
				}
			}
		}
		return fixXY;
	}
	
	
	/**
	 * Function to find an Index, where the sum of all element to its left is equal to sum of all element in its right including the index point.
	 * 
	 * @param splitArraym The Input Array
	 * @return returns the Index if equilibrium index found else -1 will be returned.
	 * @throws AssertionError If size of array is zero then error is thrown.
	 */
	public int calculateSum(int[] splitArray) throws AssertionError{
		int size = splitArray.length;
		if (size == 0) {
			throw new AssertionError("Cannot Compute on empty array");
		}
			
		int sum = 0;
		for(int index = 0; index < size; index++) {
			sum += splitArray[index];
		}
		
		int arrLeftSum = splitArray[0];
		int arrRightSum = sum - splitArray[0];
		
		for(int i=1; i<size; i++) {
			if(arrLeftSum == arrRightSum) {
				return i;
			}else {
				arrLeftSum += splitArray[i];
				arrRightSum -= splitArray[i];
			}
		}	
		return -1;
	}
	
}
