class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] arr = text.split(" ");
        List<String> s = new ArrayList<>();
        for(int i=1;i<arr.length-1;i++){
            if(arr[i].equals(second) && arr[i-1].equals(first)){
                s.add(arr[i+1]);
            }
        }
        return s.toArray(new String[0]);
    }
}