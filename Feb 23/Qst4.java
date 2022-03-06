
public class Qst4 {
    public static void main(String[] args){
        int array[]={1,3,5,6};
        int index=binarySearch(array,2);
        System.out.println("Element to be inserted at index and the index is:  "+index);
        index=binarySearch(array,7);
        System.out.println("Element to be inserted at index and the index is:  "+index);
    }
    static int binarySearch(int[] array,int target){
        int start=0;
        int end=array.length-1;
        int indx=-1;

        while(start<=end){

            int mid=start+(end-start)/2;

            if(target>array[mid]){
                start=mid+1;
                indx=start;
            }
            else{
                end=mid-1;
                indx=end;
            }
        }
        return indx;
    }
}