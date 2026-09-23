class Solution {
    public String reorderSpaces(String text) {
        String[] words = text.split(" ");
        int countSpace = 0;
        for(char i:text.toCharArray()){
            if(i==' ') countSpace++;
        }
        int countWords = 0;
        for(String i:words){
            if(!i.equals("")){
                countWords++;
            }
        }
        StringBuilder sb = new StringBuilder("");
        int numOfSpaces = countWords>1 ? countSpace/(countWords-1) : countSpace;
        for(String i:words){
            if(!i.equals("")){
                countWords--;
                sb.append(i);
                if(numOfSpaces<=countSpace && countWords!=0){
                    for(int j=0;j<numOfSpaces;j++){
                        sb.append(" ");
                    }
                    countSpace -= numOfSpaces;
                }else{
                    for(int j=0;j<countSpace;j++){
                        sb.append(" ");
                    }
                }
            }
        }
        return sb.toString();


    }
}