package Beispiel4;

public class ComplexCalculator extends AbstractCalculator{
    public ComplexCalculator() {}

    @Override
    public Number add(Number a, Number b) {
        a.setB(a.getB() + b.getB());
        a.setA(a.getA() + b.getA());

        return a;    }

    @Override
    public Number subtract(Number a, Number b) {
        a.setB(a.getB() - b.getB());
        a.setA(a.getA() - b.getA());

        return a;    }

    @Override
    public Number multiply(Number a, Number b) {
        Number c = new Number();
        c.setA((a.getA() * b.getA()) - (a.getB() * b.getB()));
        c.setB((a.getA() * b.getB()) - (a.getB() * b.getA()));

        return c;
    }

    @Override
    public Number divide(Number a, Number b) {
        Number c = new Number();
        c.setA(((a.getA() * b.getA()) + (a.getB() * b.getB())) / ((b.getA()*b.getA()) + (b.getB()*b.getB())));
        c.setB(((a.getB() * b.getA()) - (a.getA() * b.getB())) / ((b.getA()*b.getA()) + (b.getB()*b.getB())));

        return c;
    }
}
