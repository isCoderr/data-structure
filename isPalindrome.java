class Solution{
    public boolean isPalindrome(String s){
        Sting s1 = s.toLowerCase();
        char[] chars = s1.toCharArray();
        StringBuffer s2 = new StringBuffer();
        for(char c:chars){
            if((c>64 && c<91) || (c>96 && c<123) || (c>47 && c<58)){
                s2.append(c);
            }
        }
        String temp = s2.toString();
        StringBuffer s3 = s2.reverse();
        return(temp.equals(s3.toString()));
    }
}
