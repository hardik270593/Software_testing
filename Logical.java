package Software_testing;

public class Logical {
    public static void main(String[] args) {
        int A=25;
        float B=25.56f;
        System.out.println(A>B && A<B);//F
        System.out.println(A<B || A>B);//T
        System.out.println (!(!(A>B || A<B)));//F T
        System.out.println (!(!(A>B )));//F T
    }
}
