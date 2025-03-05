package Collection_Java;

interface MaxofTwoNumber<T> {
    T max(T x, T y);
}

public class Maxoftwo {
    public static void main(String[] args) {
        MaxofTwoNumber<Integer> maxFunction = (n1, n2) -> n1 > n2 ? n1 : n2;

        int result = maxFunction.max(10, 20);
        System.out.println("Max is: " + result);
    }
}