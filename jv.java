class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder("");
        int i=s.length()-1;
        while(i>=0){
            if(s.charAt(i)==' '){
                sb.append(' ');
                i--;
            }else{
                while(i>=0 && s.charAt(i)!=' '){
                    i--;
                }
                int a=i+1;
                for(;a<s.length() && s.charAt(a)!=' ';a++){
                    sb.append(s.charAt(a));
                }
            }
        }
        return sb.toString();
    }
}
