package study;

public class Method {
    public static void main(String[] args) {
        num2(2,3);
        num();
        int result = num2(2,3);
        System.out.println("2 + 3 = "+ result);
    }

    public static void num (){
        System.out.println("x");
    }
    public static int num2(int a, int b){
        System.out.println("O");
        return a+b;
    }
}
