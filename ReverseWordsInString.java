
// for optimal stuff use StringBuilder because String class always makes a new string while concat

class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        int i = n-1;
        String ans="";
        while(i >= 0){
            while(i >= 0 && s.charAt(i)==' ')i--;
            int j=i;
            if(i<0)break;
            
            while(i >= 0 && s.charAt(i) != ' ')i--;
            if(ans.isEmpty()){
             ans=ans.concat(s.substring(i+1, j+1));   
            }
            else{
                ans=ans.concat(" "+s.substring(i+1, j+1));
            }
        }
        
        return ans;
    }
}
