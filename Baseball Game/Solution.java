class Solution {
    public int calPoints(String[] operations) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int size = l.size();
                int sum = l.get(size-1) + l.get(size-2);
                l.add(sum);
            }else if(operations[i].equals("C")){
                l.remove(l.size()-1);
            }else if(operations[i].equals("D")){
                int lastElement = l.get(l.size()-1);
                l.add(lastElement*2);
            }else{
                l.add(Integer.valueOf(operations[i]));
            }
        }
        int result = 0;
        for(int i:l){
            result += i;
        }
        return result;
    }
}