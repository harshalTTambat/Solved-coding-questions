import java.util.*;

public class firstUniqueCharacterInAString
{
    public static int firstUniqChar(String s)
    {
        int n = s.length();
        HashMap <Character, Integer> hm = new HashMap<>();
        for (int i=0;i<n;i++)
        {
            char x = s.charAt(i);

            if (hm.containsKey(x))
            {
                hm.put(x,hm.get(x)+1);
            }
            else
            {
                hm.put(x,1);
            }
        }
        for (int i=0;i<n;i++)
        {
            if (hm.get(s.charAt(i))==1)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        System.out.println(firstUniqChar(s));
    }
}
