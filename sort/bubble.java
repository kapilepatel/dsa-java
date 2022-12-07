package sort;

public class bubble {
}


class Solution {
    public void sortColors(int[] nums) {


        //Insertion sort

        for(int i = 0; i < nums.length - 1; i++ )
        {
            for(int j = i + 1; j > 0; j--)
            {
                if(nums[j] < nums[j-1] )
                {
                    //swap
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }else{
                    break;
                }
                //to do else in case of already sorted part
            }
        }

        /*
        //Selection sort
        int n = nums.length;

        for(int i = 0; i <n;i++  )
        {
            //find lowest
            int lowest = nums[i];
            int index = 0;
            for(int j = i+1; j<n; j++){
                if(nums[j] < lowest )
                {
                    lowest = nums[j];
                    index = j;
                }
            }
            if(nums[i] > lowest )
            {
                //swap
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i]= temp;
            }
        }
        */

        /*


        //Bubble sort
        boolean swapped;
        for(int i = 0; i < nums.length; i++){
            swapped = false;
            for(int j = 0; j < nums.length-1 - i; j++)
            {
                if(nums[j] > nums[j+1] )
                {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }

            if(!swapped )
            {
                break;
            }
        }

        }

        */
    }
}