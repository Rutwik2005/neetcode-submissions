class Solution {
    public int trap(int[] height) {
         if (height.length == 0) {
            return 0;
        }
       Stack<Integer> st = new Stack<>();
       int res = 0;
       for(int i =0;i<height.length;i++){
       while(!st.isEmpty() && height[i]>height[st.peek()]){
          int bottom = st.pop();
          if(!st.isEmpty()){
            int left = st.peek();
            int width = i-left-1;

            int h = Math.min(height[left],height[i])-height[bottom];

            res+=width*h;
          }
       }
       st.push(i);
       }
       return res;
    }
}
