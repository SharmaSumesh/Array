package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Quick {
    static void remove(int arr[],int n)
    {
        HashMap<Integer,
                Boolean> mp = new HashMap<>();
        for(int i=0;i< arr.length;i++)
        {
            if(mp.get(arr[i])==null)
            {
                System.out.println(arr[i]);
            }
            mp.put(arr[i],true);
        }

    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 5, 5};
        int n = arr.length;
        remove(arr,n);

    }
}
