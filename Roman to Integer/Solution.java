class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> symbolMap = Map.of('I', 1, 'V', 5, 'X', 10,'L',50,'C',100,'D',500,'M',1000);
        int result = 0;
        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            if(i!=s.length()-1){
                Character nextc = s.charAt(i+1);
                if(c == 'I'){
                    if(nextc == 'V'){
                        result += 4;
                        i++;
                        continue;
                    }
                    if(nextc == 'X'){
                        result += 9;
                        i++;
                        continue;
                    }
                }else if(c == 'X'){
                    if(nextc == 'L'){
                        result += 40;
                        i++;
                        continue;
                    }
                    if(nextc == 'C'){
                        result += 90;
                        i++;
                        continue;
                    }
                }else if(c == 'C'){
                    if(nextc == 'D'){
                        result += 400;
                        i++;
                        continue;
                    }
                    if(nextc == 'M'){
                        result += 900;
                        i++;
                        continue;
                    }
                }
            }
            result += symbolMap.get(c);
        }
        return result;
    }
}