package learn.visiter.pattern.visiter.impl;

import learn.visiter.pattern.visiter.IAccountBookViewer;
import learn.visiter.pattern.visiter.IBill;

public class IncomeBill implements IBill {

    private String item;
    private double amount;

    public IncomeBill(String item, double amount) {
        this.item = item;
        this.amount = amount;
    }

    public void accept(IAccountBookViewer viewer) {
        viewer.view(this);
    }

    public String getItem() {
        return item;
    }

    public double getAmount() {
        return amount;
    }
}


