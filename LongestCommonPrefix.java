class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs.length == 0){
            return ""; 
        }
        
        // String common = "";
        StringBuilder sb = new StringBuilder();
        String s = strs[0];
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j=1;j<strs.length;j++){
                if (i>=strs[j].length() || strs[j].charAt(i) != s.charAt(i)){
                    return sb.toString();
                }
            }
            
            // common.concat((String)s.charAt(i));
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}