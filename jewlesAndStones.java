package WEEK4.WEEK5;

import java.lang.*;

class jewlesandstone {
    public static int numJewelsInStones(String jewels, String stones) {
        int answer = 0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j))
                    answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws java.lang.Exception {
        String jewels = "aA";
        String stones = "aAAbcreaabbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }