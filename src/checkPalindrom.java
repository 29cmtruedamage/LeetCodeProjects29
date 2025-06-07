public class checkPalindrom {
    public static void main(String[] args){
        int p1 = 1001; //True
        int p2 = 1234321; //True
        int p3 = -123; //False
        int p4 = 987779; //Flase
        System.out.println(isPalindrome(p1));
        System.out.println(isPalindrome(p2));
        System.out.println(isPalindrome(p3));
        System.out.println(isPalindrome(p4));
    }
    //Leetcode #9 -> Palindrome Numbers
    public static boolean isPalindrome(int x) {
        String y = Integer.toString(x);
        int i = 0;
        int j = y.length() - 1;

        if(x >= 0) {
            while (i <= j) {
                if (y.charAt(i) != y.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
        return false;
    }
}
