package Beispiel4;

public class RationalCalculator extends AbstractCalculator{
    public RationalCalculator() {
    }

    @Override
    public Number add(Number a, Number b) {
        if (a.getB() == b.getB()) {
            a.setA(a.getA() + b.getA());
            return a;
        }
        Number c = new Number();
        c.setB(a.getB() * b.getB());
        c.setA((a.getA() * b.getB()) + (b.getA() * a.getB()));

        return c;
    }

    @Override
    public Number subtract(Number a, Number b) {
        if (a.getB() == b.getB()) {
            a.setA(a.getA() - b.getA());
            return a;
        }
        Number c = new Number();
        c.setB(a.getB() * b.getB());
        c.setA((a.getA() * b.getB()) - (b.getA() * a.getB()));

        return c;
    }

    @Override
    public Number multiply(Number a, Number b) {
        Number c = new Number();
        c.setB(a.getB() * b.getB());
        c.setA(a.getA() * b.getA());

        return c;
    }

    @Override
    public Number divide(Number a, Number b) {
        Number c = new Number();
        c.setB(a.getB() * b.getA());
        c.setA(a.getA() * b.getB());

        return c;    }
}
