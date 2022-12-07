public class MountainPeak {

    public int FindPeakIndex (int[] arr){

        int max = arr[0];
        int i;
        for(i=1; i< arr.length;i++)
        {
            if(arr[i] >= max ) {
                max = arr[i];
            }else{
                break;
            }
        }
        return i-1;

    }
    public int FindPeakIndexViaBinary (int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int midIndex = 0;
        while (startIndex < endIndex) {
            midIndex = (startIndex + endIndex) / 2;
            if (startIndex == midIndex) {
                return endIndex;
            }
            if (arr[midIndex] < arr[midIndex + 1]) {
                startIndex = midIndex;
            } else {
                endIndex = midIndex;
            }
        }
        return midIndex;
    }

}
