/*
Aboubakar Arisar
DSA Lab 07
Leetcode Question 2
*/

class Solution {
    public String sortSentence(String s) {
        String array[] = s.split(" "); //spliting string to array
        String save[] = new String[array.length]; //saving sorted array
        for(int i = 0 ; i < save.length; i++) {
            int size = array[i].length(); // size of each word
            char num = array[i].charAt(array[i].length() - 1); //getting last character which is number
            int ind = num - '0'; // for index we are subtracting num - 0 to get actual number
            save[ind - 1] = array[i].substring(0,size-1); // saving sorted word as per index in save array
        }
        String ret = "";
        for(int i = 0; i < save.length;  i++) {
            if(i == save.length -1){
            ret += save[i]; // at last word we dont need any space
            }
            else{
                 ret += save[i] + " ";
            }
        }
        return ret;
        
    } 
}
