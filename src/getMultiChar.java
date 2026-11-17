public class getMultiChar {
    public String getMultiChar(char ch, int n){
        if (n ==-1){
            return "";
        }else{
            return ch + getMultiChar(ch,n-1);
        }
    }
}
