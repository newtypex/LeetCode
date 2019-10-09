// Runtime: 407 ms.
// Memory Usage: 38.2 MB.

class Solution {
    public int maxArea(int[] height) {
        int siz = height.length;
        if (siz<2) return 0;
        int max = 0;
        for (int i=0; i<siz-1;i++) {
            for (int j=i+1; j<siz;j++) {
                if (getArea(height[i],height[j],j-i)>max) max = getArea(height[i],height[j],j-i);
            }
        }
        return max;
    }
    
    int getArea(int y1, int y2, int x) {
        if (y1>y2)  return x*y2;
        else return x*y1;
    }
}