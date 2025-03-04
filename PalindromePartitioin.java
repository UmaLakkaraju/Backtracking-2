import java.util.ArrayList;
import java.util.List;


/*
 Time complexity N(palindrome check) * 2^N , spaceCpmplexity O(N)
* */
public class PalindromePartitioin {
    List<List<String>> result;
    public List<List<String>> partition(String s) {
        if(s==null ||s.length()==0){
            return new ArrayList<>();
        }
        result=new ArrayList<>();
        helper(s,0,new ArrayList<>());
        return result;
    }
    private void helper(String s,int pivot,List<String> path){
        //base
        if(pivot==s.length()){
            result.add(new ArrayList<>(path));
            return;
        }

        //logic
        for(int i=pivot;i<s.length();i++){
            String currPart=s.substring(pivot,i+1);
            if(isPalindrome(currPart,0,currPart.length()-1)){
                //action
                path.add(currPart);
                //recurse
                helper(s,i+1,path);
                //backtrack
                path.remove(path.size()-1);
            }
        }

    }
//funtion to check if a partition string is a palindrome.
    private boolean isPalindrome(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
/*
"aab"
 i -0pivot -0 path-  a
added a
 i -1pivot -1 path-  a
added a
 i -2pivot -2 path-  b
added b
 i -2pivot -1 path-  ab
 i -1pivot -0 path-  aa
added aa
 i -2pivot -2 path-  b
added b
 i -2pivot -0 path-  aab
* */