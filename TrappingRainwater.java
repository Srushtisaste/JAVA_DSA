public class TrappingRainwater{

    public static int trappedRainwater(int height[]){
        int n = height.length;
        //calculate left max boundry -array 
        int leftmax [] = new int[n];
        leftmax[0] = height[0];
        for(int i= 1 ; i<=n-1; i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }
        //calculate rigth max boundry -array
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i =n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }
        //loop
        int trappedRainwater = 0;
        for(int i= 0; i<=n-1; i++){
             //Calculate waterlavel = min(left max , rigth max)
            int waterLevel = Math.min(leftmax[i],rightmax[i]);

            //Calculate trapped water = waterlevel - heigth 
            trappedRainwater += waterLevel - height[i];
        }
        return trappedRainwater;
       
        
    }
    public static void main(String [] args){
        int height [] = {4,2,0,6,3,2,5};
        System.out.print(trappedRainwater(height)); 
    }
}