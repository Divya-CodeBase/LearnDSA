package Grind75;

public class MaxNoOfVowelinSubstringofGivenLength {
    public static void main(String args[]) {
        //System.out.println(maxVowels("aeiou", 2));
        System.out.println(maxVowels_Optimized("aeiou", 2));
    }

    //More time consuming solution
    public static int maxVowels(String s, int k) {

        int Currcount = Integer.MIN_VALUE;
        String vowels = "aeiouAEIOU";
        int i = 0;
        int j = k;
        char[] c = s.toCharArray();
        while (j <= c.length) {
            int count = 0;
            for (int a = i; a < j; a++) {
                if (!(vowels.indexOf(c[a]) == -1)) {
                    count++;
                }
            }
            Currcount = Math.max(Currcount, count);
            i++;
            j++;
        }
        return Currcount == Integer.MIN_VALUE ? 0 : Currcount;
    }

    public static int maxVowels_Optimized(String s, int k) {
        int maxCount = Integer.MIN_VALUE;
        String vowels = "aeiouAEIOU";
        int Currcount = 0;
        int i = 0;

        for (i = 0; i < k; i++) {
            if (!(vowels.indexOf(s.charAt(i)) == -1)) {
                Currcount++;
            }
        }
        maxCount = Math.max(Currcount, maxCount);

        for (; i < s.length(); i++) {
            if (!(vowels.indexOf(s.charAt(i)) == -1)) {
                Currcount++;
            }
            if (!(vowels.indexOf(s.charAt(i - k)) == -1)) {
                Currcount--;
            }
            maxCount = Math.max(Currcount, maxCount);
        }
        return maxCount;
    }
}
