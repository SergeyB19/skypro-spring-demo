package pro.sky.skyprospringdemo.example;

public class RuntimeException {
    public static void main(String[] args) {
        int number = 3;
        if (number != 2) {
            throw new java.lang.RuntimeException("Number is not 2");
        }
    }
}
