class Solution {
    public int maxArea(int[] height) {
          if (height.length <= 1) return 0;
        int l = 0;
        int r = height.length - 1;
        int area = 0 ;
        while(l<r){
            int temp = Math.min(height[r],height[l])*(r-l);
            
            if(area<temp){
                area = temp;
            }
            
            if(height[l]<height[r]){
                l++;
            }
            else if(height[l]>height[r]){
                r--;
            }
            else{
                l++;
                r--;
            }
        }
        
        return area;
    }
}
