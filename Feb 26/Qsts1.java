public class Qsts1 {
    public static void main(String[] args){
        int[] arrOne = {2,7,11,15};
        int targetOne = 9;
        int[] rslt = twoSum(arrOne,targetOne);
        for(int i = 0; i < rslt.length; i++){
            System.out.print(rslt[i]+" ");
        }
        System.out.println();
        int[] arrTwo = {2,3,4};
        int targetTwo = 6;
        rslt = twoSum(arrTwo,targetTwo);
        for(int i = 0; i < rslt.length; i++){
            System.out.print(rslt[i]+" ");
        }
        System.out.println();
        int[] arrThree = {-1,0};
        int targetThree = -1;
        rslt = twoSum(arrThree,targetThree);
        for(int i = 0; i < rslt.length; i++){
            System.out.print(rslt[i]+" ");
        }
    }
    static int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        while(start<end){
            int sum=numbers[start]+numbers[end];
            if(sum==target){
                return new int[] {start+1,end+1};
            }else if(target>sum){
                start++;
            }else{
                end--;
            }
        }
        return new int[] {-1,-1};
    }
}