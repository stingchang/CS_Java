package question_001;

public class Q011_Container_With_Most_Water {
    public int maxArea(int[] height) {
        int len = height.length;
        int a = 0, b = len-1, max = 0;

        while(a<b){
            int volumn = Math.min(height[a],height[b])*(b-a);
            max = Math.max(volumn, max);
            if(height[a]>height[b]){
                b--;
            } else {
                a++;
            }
        }
        return max;
    }
}
