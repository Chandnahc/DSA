class Solution {
    public boolean lemonadeChange(int[] bills) {
        if(bills[0]!=5) return false;
        int countFive = 1;
        int countTen = 0;
        for(int i=1;i<bills.length;i++){
            if(countFive == 0 && bills[i]!=5) return false;
            switch(bills[i]){
                case 5: 
                    countFive++;
                    break;
                case 10:
                    if(countFive>0){
                        countFive--;
                        countTen++;
                        break;
                    }else{
                        return false;
                    }
                case 20:
                    if(countTen>=1 && countFive>=1){
                        countTen--;
                        countFive--;
                        break;
                    }else if(countFive>=3){
                        countFive -= 3;
                        break;
                    }else{
                        return false;
                    }
            }
        }
        return true;
    }
}