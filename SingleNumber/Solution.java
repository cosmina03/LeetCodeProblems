import java.util.Scanner;
class Solution {
    public int singleNumber(int[] nums) {
        int numbers=0;
        while(numbers<nums.length){
        int count=0; // pt fiecare element reiau contorizarea
        int value=nums[numbers];
        for(int i=0;i<nums.length;i++){
            if(value==nums[i]){
                count++;
            }
        }
        if(count==1){
            return nums[numbers];
        }
        numbers++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu numărul de elemente: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Introdu elementele array-ului:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution sol = new Solution();
        int rezultat = sol.singleNumber(nums);

        if (rezultat != -1) {
            System.out.println("Numărul care apare o singură dată este: " + rezultat);
        } else {
            System.out.println("Nu există un număr care să apară o singură dată.");
        }

        scanner.close();
    } 

}