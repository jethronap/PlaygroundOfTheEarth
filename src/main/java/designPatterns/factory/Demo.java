package designPatterns.factory;

public class Demo {

    public static void main(String[] args) {
        /** a new polar point would be created like so
        Point polarPoint = Point.newPolarPoint(2, 3);
         */

        /**
         * implementation using the Factory class
         */
        Point polarPoint = Point.Factory.newPolarPoint(2, 3);
    }
}
