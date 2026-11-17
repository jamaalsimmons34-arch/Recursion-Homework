public String displayString(String str, int n){
    if(n==0){
        return "";

    } else{
        return str + displayString(str, n -1);
    }
}


