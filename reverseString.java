class Solution {
    public int reverse(int x) {
        StringBuilder s = new StringBuilder();
        if(x<0){
            s.append("-");
            
        }
        StringBuilder numberString = new StringBuilder(Integer.toString(x));
        if(x>=0){
              s = numberString.reverse(); 
        }
        else{
            String substr = numberString.substr(1,numberString.length());
              s = s.reverse();                   
        }
       
        
        String answer = s.toString();
        int result = Integer.parseInt(answer);	
        return result;
    }
}

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);
            
            int ret = new Solution().reverse(x);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}