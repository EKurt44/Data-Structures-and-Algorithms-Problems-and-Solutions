
# Data-Structures-and-Algorithms-Problems-and-Solutions

This repository is a comprehensive collection of programming problems and solutions related to data structures and algorithms.

# Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

# Valid Subsequence
Given two non-empty arrays of integers, our goal is to write a function that establishes whether the second array is a valid subsequence of the first array


### Approach
        public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {


This method is defined as a static method, which means it can be called on the class itself rather than an instance of the class. It takes two parameters: array, which is a list of integers, and sequence, which is also a list of integers. It returns a boolean value (true if sequence is a valid subsequence of array, otherwise false).

            int arrLength = 0;
            int seqLength = 0;


Two integer variables, arrLength and seqLength, are initialized to zero. These variables will be used to keep track of the current positions in the array and sequence lists, respectively.


    while (arrLength < array.size() && seqLength < sequence.size()) {

This starts a while loop that continues as long as two conditions are met:

arrLength is less than the size of the array, indicating that there are still elements in the array to be checked.
seqLength is less than the size of the sequence, indicating that there are still elements in the sequence to be checked.

        if (array.get(arrLength) == sequence.get(seqLength)) {
            seqLength++;
        }

Inside the loop, it checks whether the current elements in the array and sequence at positions arrLength and seqLength are equal. If they are equal, it means that the current element in sequence matches an element in array, so it increments seqLength. This step is essential for checking if sequence is a subsequence of array. It means that the current element in sequence is found in array, so we move forward in both lists.


        arrLength++;
    }

Regardless of whether there was a match or not, arrLength is always incremented in each iteration of the loop. This ensures that we move through the elements in the array one by one.


    return seqLength == sequence.size();

Finally, outside the loop, the code checks whether seqLength is equal to the size of the sequence. If they are equal, it means that all elements in sequence have been matched in the same order within array, and therefore, sequence is a valid subsequence of array, so it returns true. Otherwise, it returns false.

In summary, this code efficiently checks if one list of integers sequence is a valid subsequence of another list of integers array by iterating through both lists and comparing their elements. If all elements in sequence are found in the same order within array, it returns true; otherwise, it returns false.

### Complexity
- Time complexity: O(n)

- Space complexity: O(1)





# Is Subsequence
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 
 

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
 

Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.

### Approach
The input strings s and t are converted into character arrays s1 and t1. This is done to make it easier to iterate over the characters in the strings.

        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();


Two variables sLength and tLength are initialized to zero. These will be used to keep track of the current positions in the character arrays s1 and t1.

        int sLength=0;
        int tLength=0;

This starts a while loop that continues as long as sLength is less than the length of s1 (indicating that there are still characters in s to be checked) and tLength is less than the length of t1 (indicating that there are still characters in t to be checked).

        while(sLength<s1.length && tLength < t1.length){


Inside the loop, it checks whether the current characters in s1 and t1 at positions sLength and tLength are equal. If they are equal, it increments sLength. This step is crucial for checking if s is a subsequence of t. It means that the current character in s matches a character in t, so we move forward in both strings.

            if(s1[sLength]==t1[tLength]){
            sLength++;
            }

Regardless of whether there was a match or not, tLength is always incremented in each iteration of the loop. This ensures that we move through the characters in t one by one.

        tLength++;


Finally, outside the loop, the code checks whether sLength is equal to the length of s1. If they are equal, it means that all characters in s have been matched in t, and therefore, s is a subsequence of t, so it returns true. Otherwise, it returns false.

        return sLength==s1.length;

In summary, this code efficiently checks if one string s is a subsequence of another string t by iterating through both strings and comparing their characters. If all characters in s are found in the same order within t, it returns true; otherwise, it returns false.






### Complexity
- Time complexity: O(n)

- Space complexity: O(1)
