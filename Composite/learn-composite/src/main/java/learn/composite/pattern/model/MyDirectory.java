package learn.composite.pattern.model;

import learn.composite.pattern.Component;

import java.util.ArrayList;

/**
 * Created by JAVA on 2018/7/23.
 */
public class MyDirectory extends Component {

    private String name;
    private ArrayList<Component> substance = new ArrayList<>();

    public MyDirectory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    /**
     * 获取文件夹的大小:
     * 1. size一开始是0
     * 2. 如果是文件, 那么直接把文件的大小加到size上
     * 3. 如果是文件夹, 那么就递归地查出该文件夹的大小, 然后加到size上.
     */
    @Override
    public int getSize() {
        int size = 0;
        for (Component entry : substance) {
            size += entry.getSize();
        }
        return size;
    }

    /**
     * 像一个文件夹中添加一个文件或文件夹
     */
    @Override
    public Component add(Component entry) {
        substance.add(entry);
        entry.parent = this;
        return this;
    }

    /**
     * 1. 打印当前目录的路径
     * 2. 然后打印出子目录, 子文件的路径
     * 3. 子目录再打印子子目录/子子文件的路径...如此递归
     */
    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this.toString());
        for (Component entry : substance) {
            entry.printList(prefix + "/" + name);
        }
    }
}