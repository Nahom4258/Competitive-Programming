class Solution {
    public boolean isValid(String value) {
        Stack<Character> left = new Stack<Character>();

        HashMap<Character, Character> pair = new HashMap<Character,Character>();
        pair.put('(', ')');
        pair.put('{', '}');
        pair.put('[', ']');

        boolean isCorrect = true;
        
        if(value.length()%2 != 0)
            return false;

        for(int i = 0; i<value.length(); i++){
            if(value.charAt(i) == '(' || value.charAt(i) == '{' ||value.charAt(i) == '[')
                left.push(value.charAt(i));

            if (left.size() > 0) {
                if (value.charAt(i) == ')' || value.charAt(i) == '}' || value.charAt(i) == ']') {
                    char leftSide = left.pop();
                    if (value.charAt(i) != pair.get(leftSide))
                        isCorrect = false;
                }
            }

            else isCorrect = false;
        }
        
        if(left.size() != 0)
            return false;

        return isCorrect;
    }
}
