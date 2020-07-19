package designPatterns.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

    // initialise vector rectangles inside a list of vector objects
    private final static List<VectorObject> vectorObjects
            = new ArrayList<>(Arrays.asList(
                    new VectorRectangle(1,1,10,10),
                    new VectorRectangle(2,2,20,20)
    ));

    // the api for drawing points
    // (i.e no way to build vectors through points,
    // here is where the adapter pattern comes to play)
    public static void drawPoint(Point p) {
        System.out.println(".");
    }

    public static void main(String[] args) {

    }
}