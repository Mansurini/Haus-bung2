package Beispiel4;

public class VectorCalculator extends AbstractCalculator{
    public VectorCalculator() {
    }

    @Override
    public Number add(Number a, Number b) {
        a.setB(a.getB() + b.getB());
        a.setA(a.getA() + b.getA());

        return a;
    }

    @Override
    public Number subtract(Number a, Number b) {
        a.setB(a.getB() - b.getB());
        a.setA(a.getA() - b.getA());

        return a;
    }

    @Override
    public Number multiply(Number a, Number b) {
        a.setB(a.getB() * b.getB());
        a.setA(a.getA() * b.getA());

        return a;    }

    @Override
    public Number divide(Number a, Number b) {
        return null;
    }
}
