class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int i1 = 0;
        int i2 = 0;
        int i=0;
        int j=0;
        while(i1!=word1.length && i2!=word2.length){
            System.out.println(i1+" "+i+" | "+i2+" "+j);
            if(word1[i1].charAt(i)!=word2[i2].charAt(j)) return false;
            i++;
            j++;
            if(i==word1[i1].length()){
                i1++;
                i=0;
            }
            if(j==word2[i2].length()){
                i2++;
                j=0;
            }
        }
        // if(i1==word1.length && i2==word2.length){

        // }
        return i1==word1.length && i2==word2.length;
    }
}