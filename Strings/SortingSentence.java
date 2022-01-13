class Solution {
    public String sortSentence(String s) {
         
        String[] str = s.split(" ");
        
        String[] str1= new String[str.length];
        for(int i=0;i<str.length;i++){
             String str2 = str[i];
            int index = Integer.parseInt(str2.substring(str2.length()-1));
            str2=str2.substring(0, str2.length() - 1);  
            str1[index-1]=str2;
            
        }
        
        return String.join(" ", str1);
        
    }
}
