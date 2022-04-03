package march.week5.assignment20;


import java.util.*;

class uniqueNum {

    static boolean checkUniqueFrequency(int arr[],
                                        int n) {

        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            if (freq.containsKey(arr[i])) {
                freq.put(arr[i], freq.get(arr[i]) + 1);
            } else {
                freq.put(arr[i], 1);
            }
        }

        HashSet<Integer> uniqueFreq = new HashSet<Integer>();

        for (Map.Entry<Integer, Integer> i : freq.entrySet()) {
            if (uniqueFreq.contains(i.getValue()))
                return false;
            else
                uniqueFreq.add(i.getValue());
        }

        return true;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 2, 1, 1, 3 };
        int n = arr.length;

        boolean res = checkUniqueFrequency(arr, n);

        if (res)
            System.out.print("True" + "\n");
        else
            System.out.print("False" + "\n");
    }
}