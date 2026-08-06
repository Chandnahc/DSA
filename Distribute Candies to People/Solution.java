class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        // for(int i=0;i<2;i++){
        //     if(i==0){
        //         for(int j=0;j<num_people;j++){
        //             int temp = j+1;
        //             if(temp<candies){
        //                 res[j] = temp;
        //                 candies -= temp;
        //             }else{
        //                 res[j] = candies;
        //                 candies = 0;
        //                 break;
        //             }
        //             System.out.println(res[j]+" "+i+" "+candies);
        //         }
        //     }
        //     if(candies==0) break;
        //     if(i==1){
        //         for(int j=0;j<num_people;j++){
        //             int temp = num_people + j + 1;
        //             if(temp<candies){
        //                 res[j] += temp;
        //                 candies -= temp;
        //             }else{
        //                 res[j] += candies;
        //                 candies = 0;
        //                 break;
        //             }
        //             System.out.println(res[j]+" "+i+" "+candies);
        //         }
        //     }
        // }

        int n = 0;
        while(true){
            for(int i=0;i<num_people;i++){
                int temp = num_people*n + i + 1;
                if(temp<candies){
                    res[i] += temp;
                    candies -= temp;
                }else{
                    res[i] += candies;
                    return res;
                }
                // System.out.println(res[i]+" "+n);
            }
            n++;
        }
        // return res;
    }
}