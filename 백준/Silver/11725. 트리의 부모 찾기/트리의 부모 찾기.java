import java.util.*;
import java.io.*;

public class Main{
    public static List<ArrayList<Integer>> tree=new ArrayList<>();
    public static boolean visited[];
    public static int temp[];

    //public static int temp=0;
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        
        int n=Integer.parseInt(br.readLine());
        visited=new boolean[n+1];
        temp=new int[n+1];
        for(int i=0;i<=n;i++){
            tree.add(new ArrayList<>());
        }
        for(int i=1;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            tree.get(node1).add(node2);
            tree.get(node2).add(node1);
        }
        
            visited[1]=true;
            dfs(1);
        
        
        for(int i=2;i<n+1;i++){
            sb.append(temp[i]).append("\n");
        }
        System.out.println(sb);
    }
    public static void dfs(int start){
        if(tree.get(start).size()==0)return;
        for(int i=0;i<tree.get(start).size();i++){
            if(!visited[tree.get(start).get(i)]){
                visited[tree.get(start).get(i)]=true;
                temp[tree.get(start).get(i)]=start;
                dfs(tree.get(start).get(i));
                
            }
        }
    }
}