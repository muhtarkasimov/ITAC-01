package Day37.CW37_1;

public class Multiple {

    private Integer a;
    private Integer b;

    public Multiple(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public Integer getProduct () {
        return a*b;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Multiple) {
            Multiple m = (Multiple)obj;
            return m.getProduct().equals(this.getProduct());
        }
        return false;
    }

    @Override
    public String toString() {
        return "[" + a + ", " + b + "]";
    }
}
