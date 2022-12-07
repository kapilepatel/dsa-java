public class BinarySearchChar {

    public int search(char[] charArr, char target){
        //consider array is sorted in ascending order
        int right = charArr.length - 1;
        System.out.println("right " + right);
        int left = 0;
        System.out.println("left " + left);
        while (left <= right ){
            System.out.println("in while");
            int middle = (left + right)/2;
            System.out.println("middle " + middle);
            if(target == charArr[middle]){
                return middle;
            }
            if(target < charArr[middle] ){
                right = middle-1;
                System.out.println("item "+ target +" is less than "+ charArr[middle]+" look in left part");
            }else{
                left = middle+1;
                System.out.println("item "+ target +" is more than "+ charArr[middle]+" look in right part");
            }
        }
        return -1;
    }

    //Find smallest letter greater than target
    //character array sorted in ascending order
    //target is a character
    //letters wrap around , means return first in case not found at end
    //c f j ...target =a -> answer->c

    public int smallestLetter(char[] charArr, char target){
        //consider array is sorted in ascending order
//        int right = charArr.length - 1;
//        System.out.println("right " + right);
//        int left = 0;
//        System.out.println("left " + left);
//        while (left <= right ){
//            System.out.println("in while");
//            int middle = (left + right)/2;
//            System.out.println("middle " + middle);
//            if(target == charArr[middle]){
//                return middle;
//            }
//            if(target < charArr[middle] ){
//                right = middle-1;
//                System.out.println("item "+ target +" is less than "+ charArr[middle]+" look in left part");
//            }else{
//                left = middle+1;
//                System.out.println("item "+ target +" is more than "+ charArr[middle]+" look in right part");
//            }
//        }
        return -1;
    }

}
