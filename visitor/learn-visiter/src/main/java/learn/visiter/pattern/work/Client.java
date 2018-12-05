package learn.visiter.pattern.work;

import learn.visiter.pattern.visiter.IAccountBookViewer;
import learn.visiter.pattern.visiter.impl.Boss;
import learn.visiter.pattern.visiter.impl.CPA;
import learn.visiter.pattern.visiter.impl.ConsumerBill;
import learn.visiter.pattern.visiter.impl.IncomeBill;

public class Client {

    public static void main(String[] args) {
        AccountBook accountBook = new AccountBook();


        //添加两条收入
        accountBook.addBill(new IncomeBill("卖商品", 10000));
        accountBook.addBill(new IncomeBill("卖广告位", 12000));
        //添加两条支出
        accountBook.addBill(new ConsumerBill("工资", 1000));
        accountBook.addBill(new ConsumerBill("材料费", 2000));

        IAccountBookViewer boss = new Boss();
        IAccountBookViewer cpa = new CPA();

        //两个访问者分别访问账本
        accountBook.show(cpa);
        accountBook.show(boss);

        ((Boss) boss).getTotalConsume();
        ((Boss) boss).getTotalIncome();


    }

}
