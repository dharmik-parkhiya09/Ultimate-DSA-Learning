package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class leetcode_350 {
        public int[] intersect(int[] nums1, int[] nums2) {
            List<Integer> list1=new ArrayList<>();
            List<Integer> resultList=new ArrayList<>();

            int n =  nums1.length;
            int m =   nums2.length;

            if (n>m) {
                for (int num : nums1) {
                    list1.add(num);
                }

                for (int num : nums2 ) {
                    if (list1.contains(num)) {
                        resultList.add(num);
                        list1.remove(Integer.valueOf(num));
                    }
                }
            }
            else{
                for (int num : nums2) {
                    list1.add(num);
                }

                for (int num : nums1 ) {
                    if (list1.contains(num)) {
                        resultList.add(num);
                        list1.remove(Integer.valueOf(num));
                    }
                }
            }

            int[] res = new int[resultList.size()];
            int index = 0;
            for (int num : resultList) {
                res[index] = num;
                index++;
            }

            return res;
        }
}
