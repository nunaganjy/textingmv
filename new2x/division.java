public static double division(double a, double b) {
    if (b != 0) {
        return a / b;
    } else {
        throw new IllegalArgumentException("Division by zero is not allowed.");
    }
}