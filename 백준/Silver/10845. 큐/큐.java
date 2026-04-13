import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        int index=0;

        
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            String str=st.nextToken();
            switch(str){
                case "push":
                    int num=Integer.parseInt(st.nextToken());
                    arr[index]=num;
                    index++;
                    break;
                case "pop":
                    if(index==0){sb.append("-1\n");}
                    else{
                        sb.append(arr[0]+"\n");
                        index--;
                        for(int j=0;j<index;j++){
                            arr[j]=arr[j+1];
                        }
                    }
                    break;
                case "size":
                    sb.append(index+"\n");
                    break;
                case "empty":
                    if(index==0){sb.append("1\n");}
                    else{sb.append("0\n");}
                    break;
                case "front":
                    if(index==0){sb.append("-1\n");}
                    else{sb.append(arr[0]+"\n");}
                    break;
                case "back":
                    if(index==0){sb.append("-1\n");}
                    else{sb.append(arr[index-1]+"\n");}
                    break;
            }
            
        }System.out.print(sb);
    }
}