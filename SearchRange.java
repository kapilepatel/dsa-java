//public class SearchRange {
//
//
//    public void search(int[] nums, int target){
//
//        int leftIndex = -1 ;
//        int rightIndex = -1;
//        //consider array is sorted in ascending order
//        int right = nums.length - 1;
//        System.out.println("right " + right);
//        int left = 0;
//        System.out.println("left " + left);
//        while (left <= right ){
//            System.out.println("in while");
//            int middle = (left + right)/2;
//            System.out.println("middle " + middle);
//            if(target == nums[middle]){
//
//                int right2 = middle - 1;
//                System.out.println("right " + right);
//                int left = 0;
//                System.out.println("left " + left);
//                while (left <= right ){
//                    System.out.println("in while");
//                    int middle = (left + right)/2;
//                    System.out.println("middle " + middle);
//                    if(target == nums[middle]){
//                        //return middle;
//
//
//                    }
//                    if(target < nums[middle] ){
//                        right = middle-1;
//                        System.out.println("item "+ target +" is less than "+ nums[middle]+" look in left part");
//                    }else{
//                        left = middle+1;
//                        System.out.println("item "+ target +" is more than "+ nums[middle]+" look in right part");
//                    }
//                }
//
//
//            }
//            if(target < nums[middle] ){
//                right = middle-1;
//                System.out.println("item "+ target +" is less than "+ nums[middle]+" look in left part");
//            }else{
//                left = middle+1;
//                System.out.println("item "+ target +" is more than "+ nums[middle]+" look in right part");
//            }
//        }
//        System.out.println(leftIndex + " ");
//        System.out.println(rightIndex);
//    }
//
//}
//
