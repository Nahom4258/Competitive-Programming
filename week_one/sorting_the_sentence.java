class Solution {
    public String sortSentence(String s) {
        String[] string = s.split(" ");

        String original = "";

        for(int i = 0; i < string.length; i++){ //for index iteration
            for(int j = 0; j<string.length; j++){   //for string iteration
                int index = Integer.parseInt(String.valueOf(string[j].charAt(string[j].length() - 1)));
                if(index == (i + 1)){
                    if(i != string.length - 1){
                        original += string[j].replace(String.valueOf(index), " ");
                    }
                    else{
                        
                        original += string[j].replace(String.valueOf(index), "");
                    }
                }
            }
        }

        return original;
    }
}
