package Coding_Challenges.August22ToAugust26;

import java.util.ArrayList;
import java.util.LinkedList;

public class main {
//    1) Median of Two Sorted Arrays
//    Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//    The overall run time complexity should be O(log (m+n)).
//
//    Example1:
//    Input:nums1 = [1,3], nums2 = [2]
//    Output:2.00000
//    Explanation: merged array = [1,2,3] and median is 2.
//
//    Example2:
//    Input:nums1 = [1,2], nums2 = [3,4]
//    Output:2.50000
//    Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
//
//    Constraints:
//
//
//    nums1.length == m
//
//    nums2.length == n
//
//0 <= m <= 1000
//
//            0 <= n <= 1000
//
//            1 <= m + n <= 2000
//
//            -106 <= nums1[i], nums2[i] <= 106

    public static void getMedian(int[] a, int[] b){
        int mergedArrayLength = a.length + b.length;
        if(mergedArrayLength % 2 == 0){
            System.out.println(getEvenMedian(mergeArrays(a, b)));
        }
        else{
            System.out.println(getOddMedian(mergeArrays(a, b)));
        }
    }

    // function to get median if merged array length is even
    public static double getEvenMedian(int[] a){
        int firstMedianIndex = a.length / 2;
        int secondMedianIndex = a.length / 2 - 1;
        return (a[firstMedianIndex] + a[secondMedianIndex]) / 2.0;
    }

    // function to get median if merged array length is odd
    public static double getOddMedian(int[] a){
        return a[a.length / 2] / 2.0;
    }

    public static int[] mergeArrays(int[] a, int[] b){
        int pointerA = 0;
        int pointerB = 0;
        int pointerMerged = 0;
        int[] mergedArray = new int[a.length + b.length];
        while(pointerA < a.length && pointerB < b.length){
            if(a[pointerA] < b[pointerB]){
                mergedArray[pointerMerged] = a[pointerA];
                pointerA += 1;
                pointerMerged += 1;
            }
            else if(a[pointerA] > b[pointerB]){
                mergedArray[pointerMerged] = b[pointerB];
                pointerB += 1;
                pointerMerged += 1;
            }
            else{
                mergedArray[pointerMerged] = a[pointerA];
                pointerA += 1;
                pointerMerged += 1;

                mergedArray[pointerMerged] = b[pointerB];
                pointerB += 1;
                pointerMerged += 1;
            }
        }

        if(pointerA < a.length){
            for(int i = pointerA; i < a.length; i++){
                mergedArray[pointerMerged] = a[i];
                pointerMerged += 1;
            }
        }

        if(pointerB < b.length){
            for(int i = pointerB; i < b.length; i++){
                mergedArray[pointerMerged] = b[i];
                pointerMerged += 1;
            }
        }
        return mergedArray;
    }

/*    2) Mergek Sorted Lists
    You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
    Merge all the linked-lists into one sorted linked-list and return it.

            Example1:
    Input: lists = [[1,4,5],[1,3,4],[2,6]]
    Output:[1,1,2,3,4,4,5,6]
    Explanation: The linked-lists are:
            [
            1->4->5,
            1->3->4,
            2->6
            ]
    merging them into one sorted list:
            1->1->2->3->4->4->5->6

    Example2:
    Input: lists= []
    Output: []

    Example3:
    Input: lists = [[]]
    Output: []

    Constraints:



    k == lists.length

0 <= k <= 104

            0 <= lists[i].length <= 500

            -104 <= lists[i][j] <= 104

    lists[i] is sorted in ascending order.

    The sum of lists[i].length will not exceed 104.*/

    public static void mergeAll(ArrayList<LinkedList<Integer>> lists){
        LinkedList<Integer> finalList = new LinkedList(lists.get(0));
        for(int i = 1; i < lists.size(); i++){
            finalList = mergeLinkedLists(finalList, lists.get(i));
        }

        for(Integer number: finalList){
            System.out.print(number + " ");
        }
    }

    public static LinkedList<Integer> mergeLinkedLists(LinkedList<Integer> a, LinkedList<Integer> b){
        LinkedList<Integer> mergedList = new LinkedList<>();
        int pointerA = 0;
        int pointerB = 0;

        while(pointerA < a.size() && pointerB < b.size()) {
            if(a.get(pointerA).compareTo(b.get(pointerB)) < 0){
                mergedList.add(a.get(pointerA));
                pointerA += 1;
            }
            else if(b.get(pointerB).compareTo(a.get(pointerA)) < 0){
                mergedList.add(b.get(pointerB));
                pointerB += 1;
            }
            else{
                mergedList.add(a.get(pointerA));
                mergedList.add(b.get(pointerB));
                pointerA += 1;
                pointerB += 1;
            }
        }

        if(pointerA < a.size()){
            for(int i = pointerA; i < a.size(); i++){
                mergedList.add(a.get(pointerA));
            }
        }

        if(pointerB < b.size()){
            for(int i = pointerB; i < b.size(); i++){
                mergedList.add(b.get(pointerB));
            }
        }

        return mergedList;
    }

    public static void main(String[] args){
        int[] a = {1, 2};
        int[] b = {3, 4};
        int[] c = {1, 3};
        int[] d = {2};

        System.out.println("Problem 1 Outputs:");
        getMedian(a, b);
        getMedian(c, d);

        LinkedList<Integer> listA = new LinkedList<>();
        listA.add(1);
        listA.add(4);
        listA.add(5);
        LinkedList<Integer> listB = new LinkedList<>();
        listB.add(1);
        listB.add(3);
        listB.add(4);
        LinkedList<Integer> listC = new LinkedList<>();
        listC.add(2);
        listC.add(6);
        ArrayList<LinkedList<Integer>> lists = new ArrayList<>();
        lists.add(listA);
        lists.add(listB);
        lists.add(listC);
        System.out.println("Problem 2 Outputs:");
        mergeAll(lists);
    }
}
