class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int minSum = Integer.MAX_VALUE;
        List<String> minSumStr = new ArrayList<>();
        int[] hashArr = new int[list1.length];
        for(int i=0;i<list1.length;i++){
            hashArr[i] = -1;
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    hashArr[i] = j;
                    break;
                }
            }
        }
        for(int i=0;i<list1.length;i++){
            int j = hashArr[i];
            if(j != -1){
                if(i+j < minSum){
                    minSum = i + j;
                    minSumStr = new ArrayList<String>();
                    minSumStr.add(list1[i]);
                }else if(i+j == minSum){
                    minSumStr.add(list1[i]);
                }
            }
        }
        return minSumStr.toArray(new String[0]);
    }
}