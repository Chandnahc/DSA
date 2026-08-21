class Solution {
    public int[] resultArray(int[] nums) {
        int lastArr1 = nums[0];
        int lastArr2 = nums[1];
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(lastArr1);
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(lastArr2);
        for(int i=2;i<nums.length;i++){
            if(lastArr1 > lastArr2){
                arr1.add(nums[i]);
                lastArr1 = nums[i];
            }else{
                arr2.add(nums[i]);
                lastArr2 = nums[i];
            }
        }
        // System.out.println(arr1+" : "+arr2);
        int i = 0;
        for(int j=0;j<arr1.size();j++){
            nums[i++] = arr1.get(j);
        }

        for(int j=0;j<arr2.size();j++){
            nums[i++] = arr2.get(j);
        }
        return nums;

    }
}