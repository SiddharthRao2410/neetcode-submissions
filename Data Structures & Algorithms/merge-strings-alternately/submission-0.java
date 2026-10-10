class Solution {
    public String mergeAlternately(String word1, String word2) {

        char[] n1=word1.toCharArray();
        char[] n2=word2.toCharArray();
        
        int m1=n1.length;
        int m2=n2.length;

        char[] arr=new char[m1+m2];

        int k=0;

        for(int i=0;i<Math.min(m1,m2);i++){
            // for thr same elem , mix and write 

            arr[k]=n1[i];
            k++;
            arr[k]=n2[i];
            k++;
        }

        // for remaining elements;

        for(int i=Math.min(m1,m2);i<m1;i++){
            arr[k]=n1[i];
            k++;
        }


        for(int i=Math.min(m1,m2);i<m2;i++){
            arr[k]=n2[i];
            k++;
        }

        return new String(arr);
    }
}