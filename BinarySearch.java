public class BinarySearch {


    public int search(int[] nums, int target){
        //consider array is sorted in ascending order
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
        return -1;
    }

    public int search2(int[] nums, int target){
        //considering ascending array (1, 3 , 5 , 10)
        int startIndex = 0;
        int endIndex = nums.length-1;
        while(startIndex <= endIndex){
            int midIndex = (startIndex+endIndex)/2;
            if(nums[midIndex] == target){
                return midIndex;
            }
            if(target <= nums[midIndex])
            {
                endIndex = midIndex-1;
            }else{
                startIndex = midIndex+1;
            }
        }
        return -1;
    }

    public int SearchInsertPosition(int[] nums, int target){
        //considering ascending array (1, 3 , 5 , 10)
        int startIndex = 0;
        int endIndex = nums.length-1;
        while(startIndex <= endIndex){
            int midIndex = (startIndex+endIndex)/2;
            if(nums[midIndex] == target){
                return midIndex;
            }
            if(target < nums[midIndex])
            {
                endIndex = midIndex-1;
            }else{
                startIndex = midIndex+1;
            }
        }
        return startIndex;
    }




}
