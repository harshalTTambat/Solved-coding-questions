import java.util.*;

class IntersectionOfTwoArrays
{
    public static int[] intersection(int[] nums1, int[] nums2)
    {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int [] countarr=new int [1001];
        for (int i=0;i<n1;i++)
        {
            countarr[nums1[i]]++;
        }

        List <Integer> ans = new ArrayList<>();
        for (int i=0;i<n2;i++)
        {
            if (countarr[nums2[i]] > 0)
            {
                ans.add(nums2[i]);
                countarr[nums2[i]]=0;
            }
        }
        return listToArray(ans);
    }
    public static int [] listToArray(List<Integer> ans)
    {
        int n = ans.size();
        int []arr= new int [n];
        for (int i=0;i<n;i++)
        {
            arr[i]=ans.get(i);
        }
        return arr;
    }

    public static void main(String []args)
    {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [] nums1 = new int [n];
        int [] nums2 = new int [m];

        for (int i = 0;i<n;i++)
        {
            nums1[i]=sc.nextInt();
        }
        for (int i = 0;i<m;i++)
        {
            nums2[i]=sc.nextInt();
        }

        System.out.println(intersection( nums1, nums2));

    }
}

