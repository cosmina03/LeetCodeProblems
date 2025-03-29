class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR
        }
        return result;
    }
}

/*Folosim operatorul XOR (^), care are două reguli importante:

x ^ x = 0 → orice număr XOR cu el însuși dispare.
0 ^ x = x → orice număr XOR cu zero rămâne același.

0 ^ 0 = 0

1 ^ 0 = 1

0 ^ 1 = 1

1 ^ 1 = 0

0 ^ 0 = 0  
1 ^ 0 = 1  
0 ^ 0 = 0  
0 ^ 1 = 1  

=> 0101 = 5
*/

