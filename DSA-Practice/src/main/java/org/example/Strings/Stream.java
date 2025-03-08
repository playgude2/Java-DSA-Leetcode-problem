package org.example.Strings;

public class Stream {
    public static void main(String[] args) {
        skip("", "bAscdahsaA");
    }

    public static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a' || ch == 'A'){
            skip(p, up.substring(1));
        }else {
            skip(p+ch, up.substring(1));
        }

    }
}
