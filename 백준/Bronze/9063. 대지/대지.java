import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int x[]=new int[n];
        int y[]=new int[n];
        int max_x=-100000;
        int max_y=-100000;
        int min_x=100000;
        int min_y=100000;
        for(int i=0;i<n;i++){
            x[i]=s.nextInt();
            y[i]=s.nextInt();
            if(min_x>x[i]){
                min_x=x[i];
            }
            if(max_x<x[i]){
                max_x=x[i];
            }
            if(min_y>y[i]){
                min_y=y[i];
            }
            if(max_y<y[i]){
                max_y=y[i];
            }
            
        }
       
        if(n>1){
        	
        		System.out.print(Math.abs(max_x - min_x) * Math.abs(max_y - min_y));
        	
        	
            
        }
        else{
           System.out.print(0); 
        }
        
       
    }
}