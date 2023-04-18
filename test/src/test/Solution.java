package test;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

	
	public static void main(String[] args) {
		String a="hello";
		String b ="ehllo";
		
		if(a.length() == b.length()){
            int l = a.length();
            char[] letters = new char[l];
            int[] lettersA = new int[l];
            int[] lettersB = new int[l]; 
            int index;
            for(int i = 0; i < l; i++){System.out.println(i);
                index = check(letters, a.charAt(i));
                if(index == -1){
                    letters[i] = a.charAt(i);
                    lettersA[i] = 1;
                    lettersB[i] = 0;
                }
                else lettersA[index]++;
            }
            for(int i = 0; i < l; i++){
                index = check(letters, b.charAt(i));
                if(index == -1) System.out.println("false");
                else lettersB[index]++;
            }
            for(int i = 0; i< l;i++){
                if(lettersA[i] != lettersB[i]) System.out.println("false");
            }
            System.out.println("true");
            
        }else System.out.println("false");
    }
     static int check(char[] arr, char toCheckValue)
    {
        for (int i=0; i< arr.length; i++) {
            if (arr[i] == toCheckValue) 
                return i;
        }
        return -1;
		
    }

}

