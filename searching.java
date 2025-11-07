package com.shivang;

public class searching {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 3, 8, -2, -11, 19};
        int target = 19;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

return -1;
    }
}

