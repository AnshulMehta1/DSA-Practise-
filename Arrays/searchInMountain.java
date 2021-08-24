public class searchInMountain {
    public static void main(String[] args) {

    }
    public static int SearcMountain(int[] arr, int target){
        int peak=FindPeak(arr);
        int attempt1=orderAgnosticBS(arr,target,0,peak);
        if(attempt1!=-1){
            return attempt1;
        }
        else{
            return orderAgnosticBS(arr,target,peak+1,arr.length-1);
        }
    
    }
    public static int FindPeak(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid-+1]){
                //  This means we are in the decreasing array part of the mountain
                //  So now we will only check the left hand remaining
                //  This is because there is no guarantee that there will be an element bigger so we inlude the end in the remainder part yet and cannot discard it 
                end=mid;
            }
            else if(arr[mid]<arr[mid+1]){
                // This means we are in the ascending part of mountain
                //  This means we can do start = mid +1 and wen can discard the curr mid as there is    / definitely going to be a peak element that is bigger than the current middle element 
                start=mid+1;
            }
            
        }
        // Now start and ennd are pointing at the same position
        //  So nothing is left to be compared and we can return start and end 
        return start;
    }
    public static int binarySearch(int[] arr,int target){
        int start=0; //  0th Index
        int end = arr.length-1; // Last Index
        while (start<=end){
            int mid=(start+end)/2;
            if (target<arr[mid]){
                end=mid-1;
                // Remember that mid is an index itself 
            }
            else if (target>arr[mid]){
                start=mid+1;

            }
            else{
                return mid;
            }
        }
        //  In case none of  that works than -1 
        return -1;
    } 
    static int orderAgnosticBS(int[] arr, int target,int start,int end) {
        // int start = 0;
        // int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
