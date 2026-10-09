class Solution {
    public boolean isPalindrome(String s) {
        // convert into array 

        char [] sr= s.toLowerCase().toCharArray();
        int i =0;
        int n= sr.length;
        int j =n-1;

        while(i<j){

            // skipp all the other elem other than letter and digits 

            if(!Character.isLetterOrDigit(sr[i])){
                i++;
            }else if(!Character.isLetterOrDigit(sr[j])){
                j--;
            }else{
                if(sr[i]!=sr[j]){
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
}
