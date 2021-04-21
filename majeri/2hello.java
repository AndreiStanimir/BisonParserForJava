public class Test{

    private static int number1234 = 1234;


    public static boolean isPrime(int n)
    {
        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        int number = 17;
        boolean x = isPrime(number);
        boolean y = isPrime(1234);
        String stringTest = "Test";

        if (x == true)
        {
            System.out.println("Prime");
        }

        if (number > 5)
        {
            number = number + 4;
            number1234 = number1234 + number;
            System.out.println(stringTest);
        }
    }

    public int getNumber() {
        return number1234;
    }
}
