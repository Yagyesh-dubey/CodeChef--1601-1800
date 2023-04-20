/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i] = nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
		
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		FastScanner sc=new FastScanner();
		int n=sc.nextInt();
		int m[][]=new int[n][n];
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            m[i][j]=sc.nextInt();
	        }
	    }
	    
	    
	    for(int v=0;v<n;v++){
	      for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            if(i!=j&&v!=j)
	            m[i][j]=Math.min(m[i][j],m[i][v]+m[v][j]);
	        }
	    }  
	    }
	    
	    StringBuilder sb=new StringBuilder("");
	    
	    int x=sc.nextInt();
	    while(x-->0){
	        int s=sc.nextInt();
	        int g=sc.nextInt();
	        int d=sc.nextInt();
	        int c=m[s][g]+m[g][d];
	        int p=m[s][d];
	        sb.append(c+" "+(c-p));
	        sb.append("\n");
	    }
	    System.out.println(sb);
	}
}
