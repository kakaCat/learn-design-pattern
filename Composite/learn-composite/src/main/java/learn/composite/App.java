package learn.composite;

import learn.composite.pattern.model.MyDirectory;
import learn.composite.pattern.model.MyFile;

/**
 * Created by JAVA on 2018/7/23.
 */
public class App {

    public static void main(String[] args) {

        /* 本例子目录结构如下:
          一级目录   二级目录   三级目录
            a1
            |-------b1
            |-------b2
            |
            a2
            |-------c1
                    |-------Composite.java
                    |-------king.python

            |-------c2
         */

        MyDirectory a1 = new MyDirectory("a1");
        MyDirectory a2 = new MyDirectory("a2");

        MyDirectory b1 = new MyDirectory("b1");
        MyDirectory b2 = new MyDirectory("b2");
        a1.add(b1).add(b2);

        MyDirectory c1 = new MyDirectory("c1");
        MyDirectory c2 = new MyDirectory("c2");
        a2.add(c1).add(c2);

        MyFile java = new MyFile("Composite.java", 100);
        MyFile python = new MyFile("king.python", 214);
        c1.add(java).add(python);

        /*-****** getFullName() ************-*/
        System.out.println(java.getFullName());
        System.out.println(python.getFullName());
        System.out.println("");
        /*-****** getFullName() ************-*/
        a1.printList();
        System.out.println("-----");
        a2.printList();
    }

}
