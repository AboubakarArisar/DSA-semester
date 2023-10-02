
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        String[] returnArray = new String[n];
        boolean[] processed = new boolean[n];  // Keep track of processed heights
        
        for (int i = 0; i < n; i++) {
            int maxIndex = getMaxIndex(heights, processed);
            returnArray[maxIndex] = names[i];
        }

        return returnArray;
    }

    public int getMaxIndex(int[] heights, boolean[] processed) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 0; i < heights.length; i++) {
            if (!processed[i] && heights[i] > max) {
                max = heights[i];
                maxIndex = i;
            }
        }

        processed[maxIndex] = true;
        return maxIndex;
    }
}
