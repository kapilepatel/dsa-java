import java.util.ArrayList;
import java.util.List;

public class RecursionFind {
    public void FindList(){
        int[] arr = {4, 2, 3, 4, 9, 2};
        int target = 4;
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        list = RecursiveFindList(arr, index, target, list);
        list.forEach(item -> System.out.println(item));
    }

    static ArrayList<Integer> RecursiveFindList(int[] arr, int index, int target,ArrayList<Integer> list){
        if(index > arr.length-1)
        {
            return list;
        }
        if(arr[index] == target)
        {
            list.add(arr[index]);
        }
        return RecursiveFindList(arr, index+1, target, list);
    }


}
