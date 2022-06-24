class Solution {
    public boolean isArithmetic(int[] arr){
        boolean isArithmetic = true;
        Arrays.sort(arr);
        if(arr.length>1){
            int diff = java.lang.Math.abs(arr[0]-arr[1]);
            for(int i = 0; i<arr.length-1; i++){
                if(java.lang.Math.abs(arr[i]-arr[i+1]) != diff)
                {
                    isArithmetic = false;
                    break;
                }
            }
        } else isArithmetic = false;
        return isArithmetic;
    }
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        Boolean[] answer = new Boolean[l.length];
        for(int i = 0; i<l.length; i++){
            int[] arr = Arrays.copyOfRange(nums, l[i], r[i]+1);
            answer[i] = isArithmetic(arr);
        }
        return Arrays.asList(answer);
    }
}
