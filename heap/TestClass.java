import java.io.*;
import java.util.*;


public class TestClass {
   
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] command = new String[N];
         for(int i_command = 0; i_command < N; i_command++)
         {
         	command[i_command] = br.readLine();
         }

         int[] out_ = solve(N, command);
         System.out.print(out_[0]);
         for(int i_out_ = 1; i_out_ < out_.length; i_out_++)
         {
         	System.out.print("\n" + out_[i_out_]);
         }

         wr.close();
         br.close();
    }
    static int[] solve(int N, String[] command){
       // Your code goes here
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<String,Stack<String>> map=new HashMap<>();
        HashMap<Integer,HashSet<String>> lv=new HashMap<>();
        int l=0;
        lv.put(l,new HashSet<String>());
        for(String s:command)
        {
            switch(s.charAt(0)){
                case 'a':
                    String c[]=s.split(" ");
                    if(!lv.get(l).contains(c[1]))
                    {
                        if(!map.containsKey(c[1]))
                        {
                          map.put(c[1],new Stack<String>());
                        }
                          map.get(c[1]).push(c[2]);

                        lv.get(l).add(c[1]);
                     
                    }else
                    {
                       map.get(c[1]).pop();
                       map.get(c[1]).push(c[2]);
                       
                    }
                    break;
                case 'p':
                    String x[]=s.split(" ");
                    if(!map.containsKey(x[1]))
                    {
                        res.add(Integer.parseInt(map.get(x[1]).peek()));
                    }else
                    {
                        res.add(-1);
                    }
                    break;
                case '{':
                       l++;
                        lv.put(l,new HashSet<String>());
                       break;
                case  '}':
                       for(String y:lv.get(l))
                       {
                           map.get(y).pop();
                       }
                       l--;
                       break;
                    
            }
        }
        
        int r[]=new int[res.size()];
        for(int i=0;i<res.size();i++)
        {
            r[i]=res.get(i);
        }
        return r;
    
    }
}