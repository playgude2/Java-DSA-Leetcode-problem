package org.example.Strings;

public class Stream {
    public static void main(String[] args) {
        skip("", "bAscdahsaA");
        System.out.println(skip("bAscdahsaApppp"));
        System.out.println(skipApple("bAscdahsaAzdApplesd Apple sadsae"));
        System.out.println(skipAppNotApple("baAppAscdahsaAzdApplesd AppApple sadsae"));


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

    public static String skip(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a' || ch == 'A'){
            return skip(up.substring(1));
        }else {
            return ch + skip(up.substring(1));
        }

    }

    public static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }


        if(up.startsWith("Apple") || up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else {
            return  up.charAt(0)+skipApple(up.substring(1));
        }

    }

    public static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }


        if(up.startsWith("App") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }else {
            return  up.charAt(0)+skipAppNotApple(up.substring(1));
        }

    }
}
