class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<String>();
        
        for (int i = 1; i <= n; i++){
            if (i % 3 == 0 && i % 5 != 0)   //divisible by 3
                answer.add("Fizz");
            else if (i % 5 == 0 && i % 3 != 0)  //divisible by 5
                answer.add("Buzz");
            else if (i % 3 == 0 && i % 5 == 0)  //divisible by both 3 and 5
                answer.add("FizzBuzz");
            else
                answer.add(String.valueOf(i));
        }
        
        return answer;
    }
}
