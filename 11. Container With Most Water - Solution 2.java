// This is a much more efficient 2-pointer method. It keeps moving the pointer with shorter length towards the other pointer, and calculates and compares the area of each step. The underlying reason is: if we try to move the pointer at the longer line inwards, we won't gain any increase in area.

public class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }
}