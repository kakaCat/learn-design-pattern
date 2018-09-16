package learn.composite.pattern;

/**
 * Created by JAVA on 2018/7/23.
 */
/**
 * 这里是文件/文件夹 的统一抽象类 "组件类"
 */
public abstract class Component {
    /**
     * parent是父组件的指针, 也就是本例子中的"父级目录"
     */
    public Component parent;

    /**
     * 获取组件名字
     */
    public abstract String getName();

    /**
     * 获取组件的大小
     */
    public abstract int getSize();

    /**
     * @implNote 向一个组件中添加一个组件.
     * @implSpec 组合模式中的叶子(Leaf)节点不可以使用这个方法, 用例子说明的话:
     * 一个文件不可以添加一个文件或文件夹, 只能是文件夹来添加文件或文件夹
     */
    public Component add(Component entry) {
        throw new RuntimeException("不支持此类操作...");
    }

    public void printList() {
        printList("");
    }

    public abstract void printList(String prefix);

    /**
     * 获取绝对路径
     */
    public String getFullName() {
        StringBuilder fullName = new StringBuilder();
        Component entry = this;
        do {
            fullName.insert(0, "/" + entry.getName());
            entry = entry.parent;
        } while (entry != null);
        return fullName.toString();
    }

    /**
     * 其中的getSize() 会被子类重写, 因为文件大小可以很容易知道, 但是文件夹大小需要递归计算
     */
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}