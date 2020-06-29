package com.xwy.sourcecode.sort;

/**
 * Created by xuweiyu on 2020/6/9.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class SortTest {
    public static void main(String[] args) {
        int arr[] = Integers.getRandomList(100, 10, 1000);
        bubbleSort(arr);
        System.out.println(Integers.isArc(arr));
        Integers.printList(arr);
    }

    private static int[] bubbleSort(int arr[]) {
        if (arr != null) {
            for (int end = arr.length - 1; end > 0; end--) {
                for (int j = 0; j < end; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        return arr;
    }

    private static int[] bubbleSort1(int arr[]) {
        if (arr != null) {
            for (int end = arr.length - 1; end > 0; end--) {
                boolean isSorted = true;
                for (int j = 0; j < end; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        isSorted = false;
                    }
                }
                if (isSorted) break;
            }
        }
        return arr;
    }
    private static int[] bubbleSort2(int arr[]) {
        if (arr != null) {
            for (int end = arr.length - 1; end > 0; end--) {
                int exchangeIndex = 0;
                for (int j = 0; j < end; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        exchangeIndex = j;
                    }
                }
                end = exchangeIndex;
            }
        }
        return arr;
    }

}
