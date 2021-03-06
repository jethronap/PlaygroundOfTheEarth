package designPatterns.prototype;

import java.io.Serializable;

public class Foo implements Serializable {

    public int something;
    public String whatever;

    public Foo(int something, String whatever) {
        this.something = something;
        this.whatever = whatever;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "something=" + something +
                ", whatever='" + whatever + '\'' +
                '}';
    }
}
