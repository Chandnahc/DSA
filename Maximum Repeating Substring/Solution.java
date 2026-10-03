class Solution {
    public int maxRepeating(String sequence, String word) {
        if(sequence.indexOf(word)==-1) return 0;
        // for(char c:sequence.toCharArray()){
        //     System.out.print(c+" ");
        // }
        // for(int i=0;i<sequence.length();i++){
        //     System.out.print(i+" -> "+sequence.charAt(i)+", ");
        // }
        // System.out.println();
        int max = 1;
        int i = sequence.indexOf(word);
        int currentMax = 1;
        while(true){
            int temp = sequence.indexOf(word,i+word.length());
            if(temp==i+word.length()){
                currentMax++;
                i+= word.length();
            }else{
                temp = sequence.indexOf(word,i+1);
                currentMax=1;
                i = temp;
            }
            // System.out.println("temp: "+temp+" i: "+i+" cmax: "+currentMax);
            if(temp==-1) break;
            max = Math.max(currentMax,max);
        }
        return max;
    }
}