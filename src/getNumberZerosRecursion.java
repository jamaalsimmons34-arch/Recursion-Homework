public int getNumberOfZerosRecursion(int n) {
    if (n == 0) {
        return 0;
    }

    int lastDigit = n % 10;
    if (lastDigit == 0) {
        return 1 + getNumberOfZerosRecursion(n / 10);
    } else {
        return getNumberOfZerosRecursion(n / 10);
    }
}
