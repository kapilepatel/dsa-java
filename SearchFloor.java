/*
Input : arr[] = {1, 2, 8, 10, 10, 12, 19}, target = 5
Output : 2
2 is the largest element in
arr[] smaller than 5.

Input : arr[] = {1, 2, 8, 10, 10, 12, 19}, target = 20
Output : 19
19 is the largest element in
arr[] smaller than 20.

Input : arr[] = {1, 2, 8, 10, 10, 12, 19}, target = 0
Output : -1
Since floor doesn't exist,
output is -1.
*/
public class SearchFloor {

    public int search(int[] nums, int target){
        //consider array is sorted in ascending order
        if(target < nums[0])
        {
            return -1;
        }
        int right = nums.length - 1;
        System.out.println("right " + right);
        int left = 0;
        System.out.println("left " + left);
        while (left <= right ){
            System.out.println("in while");
            int middle = (left + right)/2;
            System.out.println("middle " + middle);
            if(target == nums[middle]){
                return middle;
            }
            if(target < nums[middle] ){
                right = middle-1;
                System.out.println("item "+ target +" is less than "+ nums[middle]+" look in left part");
            }else{
                left = middle+1;
                System.out.println("item "+ target +" is more than "+ nums[middle]+" look in right part");
            }
        }
        return right;
    }


}
