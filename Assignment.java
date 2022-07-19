package Operators;

public class Assignment {
    public static void main(String[] args) {
        int A=10;
        int B=30;
//        System.out.println(A=B);
        System.out.println(A+=B); //A=40 - A=10,B=30 , A=40
        System.out.println(A-=B); //A=-20, 20 - A=10,B=30, A=10
        System.out.println(A*=B); //A=300, A=10,B=30, A= 300
        System.out.println(A/=B); //A=0, A=10,B=30, A=10
        System.out.println(A%=B);//A=10, A=10,B=30, A=10
        System.out.println(A^=B);//A=300, A=10,B=30, A=20

    }
}
