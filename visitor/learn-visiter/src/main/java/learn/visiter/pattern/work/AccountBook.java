package learn.visiter.pattern.work;

import learn.visiter.pattern.visiter.IAccountBookViewer;
import learn.visiter.pattern.visiter.IBill;

import java.util.ArrayList;
import java.util.List;

public class AccountBook {

    //单子列表
    private List<IBill> billList = new ArrayList<IBill>();
    //添加单子
    public void addBill(IBill bill){
        billList.add(bill);
    }
    //供账本的查看者查看账本
    public void show(IAccountBookViewer viewer){
        for (IBill bill : billList) {
            bill.accept(viewer);
        }
    }
}
