package leetcode;

public class leetcode_2515 {
    public int closestTarget(String[] words, String target, int startIndex) {
           int n = words.length;
           int min = Integer.MAX_VALUE;

           for (int i = 0; i < n; i++) {
               if (words[i].equals(target)) {
                   int direct = Math.abs( i-startIndex);
                   int circuler = n-direct;
                   int dist = Math.min(direct, circuler);

                   min = Math.min(min, dist);
               }
           }
           return min == Integer.MAX_VALUE ? -1 : min;
    }
}
