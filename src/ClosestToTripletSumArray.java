public class ClosestToTripletSumArray {
    public static int closestToTripletSumArray(int arr[], int target){
        //get three pointers and a max value to store the difference between their sums
        int n = arr.length;
        int i,j,k;
        int mi = Integer.MAX_VALUE;
        int ans_sum = 0;

        // loop, where first pointer stays still and an interior loop runs when they collide then again this loop
        for(i=0; i<n; i++){
            j= i+1;
            k= n-1;
        //until last and middle pointer meets
            while(j<k){
                //get sum and difference between sum and target
                int sum = arr[i] +arr[j]+ arr[k];
                int distance = Math.abs(sum-target);
                // if difference is smaller, then store the sum as and and update mi
                if(distance <mi){
                    mi = distance;
                    ans_sum = sum;

                }
                // and move the pointers according to the provided conditions
                if(sum<target){
                    j++;
                }else{
                    k--;
                }
            }
        }return ans_sum;
    }
    public static void main(String[] args) {

    }
}
