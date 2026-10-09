class Solution {

    public boolean validPalindrome(String s) {

        char[] arr = s.toCharArray();

        int m = arr.length;
        int j = m - 1;

        for (int i = 0; i < m / 2; i++) {

            if (arr[i] != arr[j]) {

                // Skip left character
                int left = i + 1;
                int right = j;
                boolean checkLeft = true;

                while (left < right) {
                    if (arr[left] != arr[right]) {
                        checkLeft = false;
                        break;
                    }
                    left++;
                    right--;
                }

                if (checkLeft) {
                    return true;
                }

                // Skip right character
                left = i;
                right = j - 1;

                while (left < right) {
                    if (arr[left] != arr[right]) {
                        return false;
                    }
                    left++;
                    right--;
                }

                return true;
            }

            j--;
        }

        return true;
    }
}