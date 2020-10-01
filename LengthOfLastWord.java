class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0,i=0,n=s.length();
        while(i<n){
            if(s.charAt(i) != ' '){
                count++;
                i++;
            }
            else{
                // count = 0;
                while(i<n && s.charAt(i)==' ')i++;
                if(i==n)
                    return count;
                else
                    count = 0;
            }
            
        }
        return count;
    }
}
