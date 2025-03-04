import java.util.ArrayList;
import java.util.List;

public class SubSets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer>  path=new ArrayList<>();
        helper(nums,0,path,result);
        return result;
    }
    /**
     not using recursion but still exaustive solution. Time 2^n space O(N)
     */
    private void helper(int[] nums,int pivot,List<Integer>  path,List<List<Integer>> result ){


        //logic
        result.add(new ArrayList<>(path));
        for(int i=pivot;i<nums.length;i++){
            //action
            path.add(nums[i]);
            helper(nums,i+1,path,result);
            path.remove(path.size()-1);

        }
    }
}

//recursive
/* public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer>  path=new ArrayList<>();
        helper(nums,0,path,result);
        return result;
    }*/
/**
 since at each number we have to choose or not choose Time complexity is 2 pow n  and space Complexity id O(N)
 */
   /* private void helper(int[] nums,int idx,List<Integer>  path,List<List<Integer>> result ){
        //base
       if(idx==nums.length){
        result.add(new ArrayList<>(path));
        return;
       }
        //logic
        helper(nums,idx+1,path,result);
        //action
        path.add(nums[idx]);
        helper(nums,idx+1,path,result);
        path.remove(path.size()-1);
    }*/




//using forloop
/**
 public List<List<Integer>> subsets(int[] nums) {
 List<List<Integer>> result=new ArrayList<>();
 List<Integer>  path=new ArrayList<>();
 helper(nums,0,path,result);
 return result;
 }

 //  since at each number we have to choose or not choose Time complexity is 2 pow n  and space Complexity id O(N)

 private void helper(int[] nums,int pivot,List<Integer>  path,List<List<Integer>> result ){
 //base
 //for loop takes care


 //logic
 result.add(new ArrayList<>(path));
 for(int i=pivot;i<nums.length;i++){
 //action
 path.add(nums[i]);
 helper(nums,i+1,path,result);
 path.remove(path.size()-1);

 }
 */



 /**
 not using recursion but still exaustive solution. Time 2^n space O(N)
 */
/*

public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>());
        for(int i=0;i<nums.length;i++){
            int size=result.size(); //to stop memory out of bounds
            for(int j=0;j<size;j++){
                //never run forloop over mutated ds
                List<Integer> li=new ArrayList<>(result.get(j));
                li.add(nums[i]);
                result.add(li);
            }
        }
        return result;
    }

      */