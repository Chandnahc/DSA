class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        s1 = s1 + " " + s2;
        String[] arr = s1.split(" ");
        Map<String, Integer> m = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }
        List<String> l = new ArrayList<>();
        for(Map.Entry<String,Integer> i:m.entrySet()){
            if(i.getValue() == 1){
                l.add(i.getKey());
            }
        }
        return l.toArray(new String[0]);

    }
}