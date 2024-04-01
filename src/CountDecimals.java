public class CountDecimals {
    public static int countDecimals(String str){
        String currentChar = "";
        if(str.length() > 0)
            currentChar = str.substring(0,1);
        else
            return 0;
        char c = currentChar.charAt(0);

        if(str.length() == 0)
            return 0;
        else if (c >= '0' && c <= '9')
            return countDecimals(str.substring(1,str.length())) +1 ;
        else if (!(c >= '0' && c <= '9'))
            return countDecimals(str.substring(1,str.length())) + 0 ;
        else
            return 0;
    }
}

