//Smallest number >= target

//For example, let the input array be {1, 2, 8, 10, 10, 12, 19}
//For target = 0:    floor doesn't exist in array,  ceil  = 1
//For target = 1:    floor  = 1,  ceil  = 1
//For target = 5:    floor  = 2,  ceil  = 8
//For target = 20:   floor  = 19,  ceil doesn't exist in array
public class Ceiling {
    public int search(int[] nums, int target){
        //consider array is sorted in ascending order

        if(target > nums[nums.length - 1])
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
        return left;
    }

}
