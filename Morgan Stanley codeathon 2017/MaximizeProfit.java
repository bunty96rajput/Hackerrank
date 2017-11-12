import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaximizeProfit {

    static int maximizeProfit(int[] a, int[] b, int m, int k,int n) {
       
        int valueInDollars=m*k;
        int arr1[]=new int[a.length];
        int arr2[]=new int[b.length];
        int max=0;
		
		for(int i=0;i<n;i++){
            
            arr1[i]=a[i]*m;
        }
        
        for(int i=0;i<n;i++){
            
            arr2[i]=b[i]*arr1[i];
            
            
        }
        
        for(int i=0;i<arr2.length;i++){
            
            if(max<arr2[i]) max=arr2[i];
            
        }
        
        return  (max > valueInDollars ? max : valueInDollars);
    
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
		
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
		
        int[] b = new int[n];
        
		for(int b_i = 0; b_i < n; b_i++){
            b[b_i] = in.nextInt();
        }
		
        int result = maximizeProfit(a, b, m, k,n);
        System.out.println(result);
        in.close();
    }
}