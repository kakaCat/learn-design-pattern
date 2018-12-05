package learn.visiter.pattern.visiter;

import learn.visiter.pattern.visiter.impl.ConsumerBill;
import learn.visiter.pattern.visiter.impl.IncomeBill;

public interface IAccountBookViewer {


    // 查看消费的单子
    void view(ConsumerBill consumerBill);

    // 查看收入单子
    void view(IncomeBill incomeBill);

}
