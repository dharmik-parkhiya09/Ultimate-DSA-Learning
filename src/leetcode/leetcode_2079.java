package leetcode;

public class leetcode_2079 {
    public int wateringPlants(int[] plants, int capacity) {
        int c = capacity;
        int start = 0;
        int step = 0;
        int end = plants.length - 1;

        int result = 0;
        while (start < end) {
            if (plants[start] <= c) {
                c = c - plants[start];
                step++;
                start++;

                if (c == 0 || plants[start] > c) {
                    c = capacity;
                    result += step * 2;
                }
                if (start == end) {
                    result += step;
                    break;
                }
            }
        }
        return result + 1;
    }
}

