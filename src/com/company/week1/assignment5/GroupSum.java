package com.company.week1.assignment5;

public class GroupSum {
    public GroupSum(){
        int[] arr = {8,1,1,1,1,6};
        int[] arr2 = {4};
        System.out.println(groupSum(0,arr,10));

    }

    public boolean groupSum(int start, int[] arr, int target) {

        if(start >= arr.length){
            return target == 0;
        }

        if(arr[start] == 6){
            if( groupSum(start + 1, arr, target - arr[start])) return true;
        } else {
            if( groupSum(start + 1, arr, target - arr[start])) return true;
            if( groupSum(start + 1, arr, target)) return true;
        }
        return false;
    }
}
