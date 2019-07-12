package main;

public class math {
    /*
    1.
    Napisz program, który pomnoży liczbę razy 10
    */
    public int multiplyBy10(int no) {
        int result = no*10;
        return result;
    }
    /*
    2.
    Napisz metodę obliczającą pole kwadratu
    */
    public int squareField(int a) {
        int pole = a*a;
        return pole;
    }
    /*
    3.
    Napisz metodę obliczającą obwód kwadratu
    */
    public int perimeterOfTheSquare(int a) {
        int obwod = a*4;
        return obwod;
    }
    /*
    4.
    Napisz metodę obilczającą wynik dzialania ( x dodać 5 ) razy y odjąć ( y do kwadratu dodać 8).
    */
    public int equation(int x, float y) {
        int result = ((x+5)*(int)y )- (((int)y*(int)y) +8);
        return result;
    }
    /*
    5.
    Napisz metodę dzielącą dwie liczby + sprawdzenie podzielności przez 0
     */
    public double rest(int number1, int number2) {
        double result = 0.0;
        if (number2 == 0){
            throw new ArithmeticException("can't divide by zero!!");
        }
        else {
            result = number1 % number2;
        }return result;
    }
    /*
    6.
    Napisz program, który sprawdzi czy przekazana liczba jest parzysta
    */
    public boolean isNumberEven(int x) {
        boolean result = x%2 ==0;
        return result;
    }
    /*
    7.
    Napisz program, który zwróci wartość bezwzględna z liczby x, tj |x|
    */

    public int absoluteValue(int x) {
        if(x<0) {
            x = x * (-1);
        }

        return x;
    }
    /*
    8.
    Napisz program, który pomnoży wprowadzoną liczbę przez 8 i zwróci wartość true jesli wynik jest większy od 100.
    W przeciwnym wypadku zwróci wartość false
    */

    public boolean isTheResultGreaterThan100(int a) {

        boolean result = false;
        if(a*8>100){
            result=true;
        }
        return result;
    }

    /*
    9.
    Napisz program, który sprawdzi czy liczba x jest wielokrotnością liczby y
    */
    public boolean ifNumberOneIsMultipleNumberTwo(int x, int y) {
        boolean result = false;
        if(x%y==0);{
            result=true;
        }
        return result;
    }

    /*
    10.
    Napisz program, zwróci najmniejszą spośród wprowadzonych liczb
    */
    public int returnTheSmallestNumber(int a, int b, int c) {
        int result = 0;
        if(a<b && a<c){
            result = a;
        }else if(b<a && b<c){
            result = b;
        }else {
            result = c;
        }
        return result;

    }

    /*
    11.
    Napisz program, zwróci największą spośród wprowadzonych liczb
    */
    public int returnTheBiggestNumber(int a, int b, int c) {
        int result = 0;
        if(a>b && a>c){
            result = a;
        }else if(b>a && b>c){
            result = b;
        }else {
            result = c;
        }
        return result;
    }

    /*
    12.
    Napisz program, który sprawdzi czy podana w argumencie liczba nalezy do przedzialu <x,y>
    */
    public boolean isNumberInTheRange(int number, int x, int y) {
        boolean result = false;
        if (number>=x && number<=y){
            result = true;

        }

        return result;
    }

    /*
    13.
    Napisz program,który obliczy sumę n(wartosc podana w argumencie metody) pierwszych wyrazów ciągu arytmetycznego
    o wzorze ogólnym: a_n = 6n+3
    */
    public int countSumArithemticProgression(int n) {
        int result = (((6*1+3)+(6*n+3))/2)*n;
        return result;
    }

    /*
    14.
    Napisz program,który wyznaczy n-ty(podany w argumecie) wyraz ciągu arytmetycznego o którym wiesz, że a18=64 oraz r=2.
    */
    public int countNWordValueArithmeticProgression(int n) {
        int result = 64+(n-18)*2;
        return result;
    }
    //cos  tam
}
