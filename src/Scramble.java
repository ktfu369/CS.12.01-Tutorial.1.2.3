import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Scramble {
    public static String scrambleWord(String word){
        String ans = "";
        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == 'A'){
                if(i != word.length()-1 && word.charAt(i+1) != 'A'){
                    ans += word.charAt(i+1);
                    ans += 'A';
                    i++;
                }else{
                    ans += 'A';
                }
            }else{
                ans += word.charAt(i);
            }
        }
        return ans;
    }

    public static List<String> scrambleOrRemove(List<String> words){
        List<String> ans = new LinkedList();
        for(String word : words){
            String newAns = scrambleWord(word);
            if(word.equals(newAns)){
//                words.remove(word);
            }else{
//                int index = words.indexOf(word);
//                words.set(index,newAns);
                ans.add(newAns);
            }
        }
        return ans;
    }
}