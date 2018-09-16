package learn.builder.app;

import learn.builder.builder.square.Square;

/**
 * Created by JAVA on 2018/7/28.
 */
public class AppSquare {

    public static void main(String[] args) {

        Square square = new Square.Builder().setBorderSize(11).setColor(11).builder();




    }



}
