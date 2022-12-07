public class MissingNumber {


        public int missingNumber(int[] nums) {

            //use (n(n+1))/2 formula to get sum of naturan numbers
            //diff the sum of given array vs expected based on formulae
            int numsSum = 0;
            int len = nums.length;
            for(int i=0; i <len; i++)
            {
                numsSum = numsSum + nums[i];
            }

            int expected = ( len * (len +1) ) /2;
            return expected - numsSum;
        }

}
