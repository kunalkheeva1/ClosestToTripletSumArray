public class ClosestToTripletSumArray {
    public static int closestToTripletSumArray(int arr[], int target){
        int n = arr.length;
        int i,j,k;
        int mi = Integer.MAX_VALUE;
        int ans_sum = 0;
        for(i=0; i<n; i++){
            j= i+1;
            k= n-1;

            while(j<k){
                int sum = arr[i] +arr[j]+ arr[k];
                int distance = Math.abs(sum-target);

                if(distance <mi){
                    mi = distance;
                    ans_sum = sum;

                }
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
