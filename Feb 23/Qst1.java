
public class Qst1 {
    public static void main(String[]args){
    int[]arr={1,1,2,2,4,5,5,6,6,6,6,9,10,11};
    int target=6;
    int lastOcc=freq(arr,target,false);
    int firstOcc=freq(arr,target,true);
    int rslt=(lastOcc-firstOcc)+1;
    System.out.println("Frequence is "+rslt);
    }

    static int freq(int[] arr,int target,boolean flag){
        int start=0;
        int end=arr.length-1;
        int index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                index=mid;
                if(flag==true){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else if(target>arr[mid]){
                    start=mid+1;
            }
            else {
                end = mid - 1;
            }
        }
            return index;
    }
}
