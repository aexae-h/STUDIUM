package ws20.aufgabe13_Graph;

interface Function {
    double f(double x);
}

class xhoch2 implements Function {
    @Override
    public double f(double x) {
        return x * x;
    }
}

class xhoch3 implements Function {
    @Override
    public double f(double x) {
        return x * x * x;
    }
}

class sinx implements Function {
    @Override
    public double f(double x) {
        return Math.sin(x);
    }
}
