package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class leetcode_229 {
    public  static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        int n = nums.length;
        int count = n/3;

        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }

        list = map.entrySet().stream()
                .filter(entry -> entry.getValue() > count)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        return list;

    }

    public static void main(String[] args) {
        int[] arr = {3,2,3};
        majorityElement(arr);
    }
}
