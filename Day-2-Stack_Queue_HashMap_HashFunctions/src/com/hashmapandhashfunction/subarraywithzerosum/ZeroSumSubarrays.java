package com.hashmapandhashfunction.subarraywithzerosum;

import java.util.*;

public class ZeroSumSubarrays {
    public static void findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        int sum = 0;

        // Initialize map with sum 0 at index -1 to handle subarrays starting at index 0
        sumMap.put(0, new ArrayList<>(Arrays.asList(-1)));

        System.out.println("Zero-sum subarrays:");

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If sum exists in map, there are zero-sum subarrays
            if (sumMap.containsKey(sum)) {
                for (int startIndex : sumMap.get(sum)) {
                    System.out.println("Subarray: " + Arrays.toString(Arrays.copyOfRange(arr, startIndex + 1, i + 1)));
                }
            }

            // Add current index to the list of indices for this sum
            sumMap.putIfAbsent(sum, new ArrayList<>());
            sumMap.get(sum).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        findZeroSumSubarrays(arr);
    }
}