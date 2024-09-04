package phanSo;

public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Mẫu số không thể bằng 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    // Tối giản phân số
    public void reduce() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // Tìm ước chung lớn nhất
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Nghịch đảo phân số
    public Rational reciprocal() {
        return new Rational(denominator, numerator);
    }

    // Cộng hai phân số
    public Rational add(Rational other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    // Trừ hai phân số
    public Rational subtract(Rational other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    // Nhân hai phân số
    public Rational multiply(Rational other) {
        return new Rational(this.numerator * other.numerator, this.denominator * other.denominator);
    }

    // Chia hai phân số
    public Rational divide(Rational other) {
        return this.multiply(other.reciprocal());
    }

    // So sánh hai phân số
    public boolean equals(Rational other, double tolerance) {
        double diff = Math.abs(this.toDouble() - other.toDouble());
        return diff < tolerance;
    }

    // Chuyển đổi phân số thành số thực
    public double toDouble() {
        return (double) numerator / denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Getters và setters
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        reduce();
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Mẫu số không thể bằng 0");
        }
        this.denominator = denominator;
        reduce();
    }
}
