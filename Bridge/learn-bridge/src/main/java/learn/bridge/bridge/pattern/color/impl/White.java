package learn.bridge.bridge.pattern.color.impl;

import learn.bridge.bridge.pattern.color.Color;

public class White implements Color {

    @Override
    public void bepaint(String shape) {
        System.out.println("白色的" + shape);
    }

}
