// Problem statement
// Write as you speak is a special sequence of strings that starts with string “1” and after one iteration you rewrite the sequence as whatever you speak.

// Example :
// The first few iterations of the sequence are :
// First iteration: “1”
//     As we are starting with one.

// Second iteration: “11”
//     We speak “1” as   “one 1” then we write it as “11”

// Third iteration: “21”
//     We speak “11” as “Two 1” then we write it as “21”

// Fourth iteration: “1211”
//     We speak “21” as “one 2, one 1”  then we write it as “1211”

// Fifth iteration: “111221”
//     We speak “1211” as “one 1, one 2, two 1” then we write it as “111221”

// Sixth iteration: “312211”
//     We speak “111221” as “three 1, two 2, one 1” then we write it as “312211”
// You will be given a single positive integer N, Your task is to write the sequence after N iterations.

// Detailed explanation ( Input/output format, Notes, Images )
// Constraints:
// 1 <= T <= 10
// 1 <= N <= 30

// Time Limit: 1 sec
// Sample Input 1 :
// 2
// 1
// 2
// Sample Output 1:
// 1
// 11
// Explanation For Sample Input 2:
// First iteration: “1”
//     As we are starting with one.

// Second iteration: “11”
//     We speak “1” as   “one 1” then we write it as “11”
// Sample Input 2 :
// 2
// 3
// 4
// Sample Output 2:
// 21
// 1211
import java.util.ArrayList;

public class Solution 
{

    public static String writeAsYouSpeak(int n) 
    {

        // We initialize our starting string s with "1".
        String s = "1";
        
        // We initialize the iterations with n-1.
        int iterations = n - 1;
        while (iterations-- > 0) 
        {
            // We will initialize temp with an empty string and we initialize count.
            String temp = "";
            ArrayList<Integer> count = new ArrayList<Integer>();
            
            // currentIndex will store the current position in string s, currentChar will store the current character that we will match with consecutive characters.
            // And currentCount will store the count of that character.
            int currentIndex = 0;
            
            // Now we will iterate through s and we will try to make temp and count.
            while (currentIndex < s.length()) 
            {
                char currentChar = s.charAt(currentIndex);
                int currentCount = 0;
                while ((currentIndex < s.length()) && (s.charAt(currentIndex) == currentChar)) 
                {
                    currentCount++;
                    currentIndex++;
                }

                temp += currentChar;
                count.add(currentCount);
            }

            // Now we will make string s for the next iteration.
            // We will add count[i] and temp[i] to s for each position of count.
            s = "";
            for (int i = 0; i < count.size(); i++) 
            {
                s += (char)('0' + count.get(i));
                s += temp.charAt(i);
            }
        }
        return s;
    }

}