class Solution {
    public String reformatDate(String date) {
        String[] s= date.split(" ");
        StringBuilder sb = new StringBuilder("");
        sb.append(s[2]+"-");
        Map<String, String> m = Map.ofEntries(
            Map.entry("Jan", "01"),
            Map.entry("Feb", "02"),
            Map.entry("Mar", "03"),
            Map.entry("Apr", "04"),
            Map.entry("May", "05"),
            Map.entry("Jun", "06"),
            Map.entry("Jul", "07"),
            Map.entry("Aug", "08"),
            Map.entry("Sep", "09"),
            Map.entry("Oct", "10"),
            Map.entry("Nov", "11"),
            Map.entry("Dec", "12")
        );
        sb.append(m.get(s[1])+"-");
        sb.append(s[0].length()==3 ? "0"+s[0].charAt(0) : s[0].substring(0,2));
        return sb.toString();
    }
}