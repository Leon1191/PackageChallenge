package challenge.functions;

public class Series {

    public static int nSum(int n) {
        if (n == 0) return 0;
        return n + nSum(n - 1);

//        int answer = 0;
//        for (int j = 0; j <= n; j++) answer = answer + j;
//return answer;
    }

    public static int factorial(int n){
        if (n == 0) return 1;
        return (n + 1) * factorial(n - 1);

    }
//
//    public static int fibonacci(int n){
//
//    }


}
