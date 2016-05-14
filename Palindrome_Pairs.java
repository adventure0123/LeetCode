import java.time.temporal.Temporal;
import java.util.*;

/**
 * Created by adventure on 16/5/15.
 */
public class Palindrome_Pairs {

    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result=new LinkedList<>();
        if(words==null||words.length<2){
            return result;
        }
        Map<String,Integer> map=new HashMap<>();
        int length=words.length;
        int index=-1;
        for(int i=0;i<length;i++){
            if(words[i].equals("")){
                index=i;
            }
            map.put(words[i],i);
        }
        if(index!=-1){
            for(int i=0;i<length;i++){
                if(i!=index&&isPalindrome(words[i])){
                    List<Integer> temp=new LinkedList<>();
                    temp.add(index);
                    temp.add(i);
                    result.add(temp);
                    List<Integer> temp2=new LinkedList<>();
                    temp2.add(i);
                    temp2.add(index);
                    result.add(temp2);
                }
            }
        }
        for(int i=0;i<length;i++){
            String reverse=reverseStr(words[i]);
            if(reverse.length()>1&&map.containsKey(reverse)&&i!=map.get(reverse)){
                List<Integer> temp=new LinkedList<>();
                temp.add(i);
                temp.add(map.get(reverse));
                result.add(temp);
            }
        }

        for(int i=0;i<length;i++){
            String word=words[i];
            int wordLength=word.length();
            for(int j=1;j<wordLength;j++){
                if(isPalindrome(word.substring(0,j))){
                    String strTemp=reverseStr(word.substring(j));
                    if(map.containsKey(strTemp)){
                        List<Integer> temp=new LinkedList<>();
                        temp.add(map.get(strTemp));
                        temp.add(i);
                        result.add(temp);
                    }
                }
                if(isPalindrome(word.substring(j))){
                    String strTemp=reverseStr(word.substring(0,j));
                    if(map.containsKey(strTemp)){
                        List<Integer> temp=new LinkedList<>();
                        temp.add(i);
                        temp.add(map.get(strTemp));
                        result.add(temp);
                    }
                }
            }
        }
        return result;
    }
    private  String reverseStr(String str){
        StringBuilder temp=new StringBuilder(str);
        temp.reverse();
        return temp.toString();
    }
    private boolean isPalindrome(String str){
        int length=str.length();
        int i=0;
        int j=length-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

    public static void main(String[] args) {
        Palindrome_Pairs test=new Palindrome_Pairs();
        String[] words={"a","abc","aba",""};
        System.out.println(test.palindromePairs(words));
    }
}
