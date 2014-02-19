package com.palindrome;

/**
 * Created with IntelliJ IDEA.
 * User: jdahlke
 * Date: 05.02.14
 * Time: 17:08
 * To change this template use File | Settings | File Templates.
 */
public class IsPalindrome {

    public  boolean isPalindromic(int i) {
        int len = (int) Math.ceil(Math.log10(i+1));
        for (int n = 0; n < len / 2; n++)
            if ((i / (int) Math.pow(10, n)) % 10 !=
                    (i / (int) Math.pow(10, len - n - 1)) % 10)
                return false;
        return true;
    }

    public void runtime(){
        for(int j=0; j<=(999*999);j++){
            if (isPalindromic(j)==true){
                System.out.println(j);
            }
            else{}

        }
    }

}
