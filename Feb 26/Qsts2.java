import java.util.*;

public class Qsts2 {
    public static void main(String[] args){
        int[] numsOne = {9,4,9,8,4};
        int[] numsTwo = {4,9,5};
        int lengthOne = numsOne.length;
        int lengthTwo = numsTwo.length;
        int i = 0,j = 0,k = 0;
        Arrays.sort(numsOne);//sorting array in ascending
        Arrays.sort(numsTwo);

        while(i < lengthOne  && j < lengthTwo){
            if(numsOne[i] < numsTwo[j]){
                i++;
            }else if(numsOne[i] > numsTwo[j]){
                j++;
            }else {
                numsOne[k+1]=numsOne[i++];//in k value of intersection b/w two number will be save
                j++;
                System.out.println("intersection of array is "+numsOne[i]+" "+numsTwo[k]);
            }

        }
    }
}