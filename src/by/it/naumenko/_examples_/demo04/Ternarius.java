package by.it.naumenko._examples_.demo04;

public class Ternarius {
    public static void main(String args[]){
        int a , b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println( "Значение b: " +  b );

        b = (a == 10) ? 20 : 30;
        System.out.println( "Значение b: " + b );
    }
}
