package feb.week3.assignment1;

public class Qst2 {
    public static void main(String[] args){
        char[] array={'a','b','d','e','f','g','h','i','x','z'};
        char target='z';
        int indx=binarySearch(array,target);
            if(indx!=-1){
                System.out.println("Target found and index of the target is "+indx);
            }
            else{
                System.out.println("Target not found so  default index of the target is "+indx);
            }
    }
        static int binarySearch(char[] array,char target){
            int start=0;
            int end=array.length-1;

            while(start<=end){

                int mid=start+(end-start)/2;

                if(target==array[mid]){
                    return mid;
                }
                else if(target>array[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            return -1;
        }
}