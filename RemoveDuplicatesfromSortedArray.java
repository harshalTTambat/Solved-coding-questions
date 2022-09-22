import java.util.*;

class RemoveDuplicatesfromSortedArray
{
    public static int removeDuplicates(int[] nums)
    {
        int j = 1;
        int len = 0;

        for (int i = 0; i < nums.length; i++) {

            while (j < nums.length) {

                if (nums[i] == nums[j]) {
                    j++;
                } else {
                    i++;
                    len++;
                    nums[i] = nums[j];
                }
            }
        }
        return len + 1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int nums[]= new int [n];
        for (int i =0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println(removeDuplicates(nums));
    }

}