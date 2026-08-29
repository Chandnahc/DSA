class Solution {
    public String destCity(List<List<String>> paths) {
        // Map<String,List<String>> m = new HashMap<>();
        Set<String> s = new HashSet<>();
        for(List<String> l:paths){
            // m.put(l.get(0),m.getOrDefault(new ArrayList<String>()).add(l.get(1)));
            s.add(l.get(0));
        }
        for(List<String> l:paths){
            if(!s.contains(l.get(1))) return l.get(1);
        }
        return "";

    }
}