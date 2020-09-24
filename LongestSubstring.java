/*Given an integer k and a string s,
 find the length of the longest substring that contains
  at most k distinct characters.

For example, given s = "abcba" and k = 2, 
the longest substring with k distinct characters is "bcb".*/

import java.util.*;

public class LongestSubstring {
    private static String findLongestSubstring(String s, int k) {
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        int[] counter = new int[26];
        int maxDistinct = 0;

        for (int i = 0; i < s.length(); i++) {
            if (counter[s.charAt(i) - 'a'] != 0) {
                counter[s.charAt(i) - 'a']++;
                sb.append(s.charAt(i));
            } else {
                if (maxDistinct == k) {
                    if (ans.length() < sb.length()) {
                        ans = sb.toString();
                    }
                    sb.append(s.charAt(i));
                    counter[s.charAt(i) - 'a']++;
                    maxDistinct++;

                    while (maxDistinct > k) {
                        counter[sb.charAt(0) - 'a']--;
                        if (counter[sb.charAt(0) - 'a'] == 0) {
                            maxDistinct--;
                        }
                        sb.deleteCharAt(0);
                    }
                } else {
                    counter[s.charAt(i) - 'a']++;
                    sb.append(s.charAt(i));
                    maxDistinct++;
                }
            }
        }

        if (maxDistinct == 2 && sb.length() > ans.length()) {
            ans = sb.toString();
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        String result = findLongestSubstring(str, k);
        System.out.println(result);

    }
}
