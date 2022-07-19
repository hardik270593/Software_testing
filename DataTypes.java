package Software_testing;

public class DataTypes {


    public static void main(String[] args) {
//        Integer Family
//Byte Range is -128 to 127
//size: 1 byte = 8 bits
        byte a= 120;
        System.out.println("a="+a);

//Short Range is -32768 to 32767
//size: 2 bytes = 16 bits
        short b=-32768;
        System.out.println("b="+b);

//int Range is -2,147,483,648 to 2,147,483,647
//size: 4 bytes = 32 bits

        int c=-1000000000;
        System.out.println("c="+c);
//long Range is -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//size: 8 bytes = 64 bits

        long d = 9000000000000000000L;
        System.out.println("d="+d);

//        Float Family
//double rang is approximately 1.8 × (10)308
//size: 8 bytes = 64 bits
        double e=123.12345;
        System.out.println("e="+e);

//float rang is 3.4E-38 to 3.4E+38
//size: 4 bytes = 32 bits

        float f=231.0123f;
        System.out.println("f="+f);

//        Character Family
//Character Range is unicode value (single range value)
//size: 2 bytes = 16 bits
        char g = 'k';
        System.out.println("g="+g);

//        Boolean Family
//Boolean Range is
//size: less than 1 bit.
        boolean h= true;
        boolean i= false;
        System.out.println("h="+h +' ' + "\n" +  "i=" +i);
//        System.out.println("i=" + i);

//String rang is 0 to 2147483647

        String j="123456256564665";
        System.out.println("j="+j);
    }
}
