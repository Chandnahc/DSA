class Solution {
    public int countLargestGroup(int n) {
        int[] freq = new int[37];
        for(int i=1;i<=n;i++){
            int count = 0;
            int temp = i;
            while(temp!=0){
                count += temp%10;
                temp/=10;
            }
            // System.out.println(i+" "+count);
            freq[count]++;
        }
        int count = 0;
        int max = -1;
        for(int i=1;i<37;i++){
            // System.out.print(freq[i]+" ");
            if(freq[i]>max){
                max = freq[i];
                count = 1;
            }else if(freq[i]==max){
                count++;
            }
        }
        return count;
    }
}