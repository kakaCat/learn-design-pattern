package learn.bridge.app;

import learn.bridge.bridge.pattern.Circle;
import learn.bridge.bridge.pattern.color.Color;
import learn.bridge.bridge.pattern.color.impl.White;

public class ClientPattern {

    public static void main(String[] args) {
        //白色
        Color white = new White();
        //正方形
        Circle square = new Circle();
        //白色的正方形
        square.setColor(white);
        square.draw();
    }

}
