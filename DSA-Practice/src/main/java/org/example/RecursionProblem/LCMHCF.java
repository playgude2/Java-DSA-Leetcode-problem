package org.example;

public class LCMHCF {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 18;

        System.out.println(hcf(n1,n2));
        int resultHcf = hcf(n1,n2);
        int lcm = n1*n2/resultHcf;
        System.out.println(lcm);
    }


    public static int hcf(int n1, int n2){
        if(n2==0){
            return n1;
        }
        System.out.println("n1%n2"+n1%n2);
        return hcf(n2, n1%n2);
    }
}
