/*
Aboubakar Arisar
DSA Lab 07
Leet code question 01
*/
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int returnArray[] = new int[nums.length]; // making an array of same length that we will return 
        for(int i = 0 ; i < nums.length; i++) {
            int count = 0; 
            for(int j = 0 ; j  < nums.length; j++) {
              //following condition will check the numbers less than the number at i index 
                if(nums[j] < nums[i] && i!=j) {  
                    count++;
                }
            }
          //saving number saved in count in returnArray
            returnArray[i] = count;
        }
        return returnArray;
    }
}
