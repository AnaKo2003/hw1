//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class hw1 {
    
    public static void main(String[] args) {
    int result = 1;
    int b = 5;
    for(int i =1; i<=b;i++)
    {
        result*=i;
    }
    System.out.println(result);

    }
}