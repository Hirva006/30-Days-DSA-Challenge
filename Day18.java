//Activity Selection

class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        
        if(start.length == 0) return 0;
        
        int activities[][] = new int[start.length][2];
        
        for(int i=0; i<start.length; i++){
            // activities[i][0] = i;
            activities[i][0] = start[i];
            activities[i][1] = finish[i];
        }
        
        Arrays.sort(activities, Comparator.comparingDouble(O -> O[1]));
        
        int maxact = 1;
        
        int lastend = activities[0][1];
        
        for(int i=1; i<finish.length; i++){
            if(activities[i][0] > lastend){
                maxact++;
                lastend = activities[i][1];
            }
        }
        return maxact;
        
    }
}
