package learn.composite.pattern.model;

import learn.composite.pattern.Component;

/**
 * Created by JAVA on 2018/7/23.
 */
public class MyFile extends Component {
    private String name;
    private int size;

    public MyFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this.toString());
    }
}