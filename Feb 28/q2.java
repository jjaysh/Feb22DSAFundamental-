public class q2 {
    public static void main(String[] args){
        int[] arrOne = {2,0,2,1,1,0};
        int[] rslt = sortColors(arrOne);
        for(int i = 0; i < rslt.length; i++){
            System.out.print(rslt[i]+" ");
        }
        System.out.println();
        int[] arrTwo = {2,0,1};
        rslt = sortColors(arrTwo);
        for(int i = 0; i < rslt.length; i++){
            System.out.print(rslt[i]+" ");
        }
    }
    static  int[] sortColors(int[] nums) {
        int leng = nums.length;

        for (int i = 1; i < leng; i++) {
            int j = i;
            int a = nums[i];

            while ((j > 0) && (nums[j - 1] > a)) {
                nums[j] = nums[j - 1];
                j--;
            }

            nums[j] = a;
        }
        return nums;
    }
}