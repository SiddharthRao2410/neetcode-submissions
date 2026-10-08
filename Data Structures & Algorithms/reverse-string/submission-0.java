class Solution {
    public void reverseString(char[] s) {

        int m = s.length;

        int j =m-1;

        for(int i=0;i<m/2;i++){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            j--;
        }
        

   
    }
}