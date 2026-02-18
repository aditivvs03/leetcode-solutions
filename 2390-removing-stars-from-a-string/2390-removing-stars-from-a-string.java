class Solution {
    String fun(String s){
         Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch!='*') st.push(ch);
            else if(!st.empty()) st.pop();
        }
        char [] res=new char[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            res[i]=st.pop();
        }
        return new String(res);
    }
    public String removeStars(String s) {
        return fun(s);
    }
}