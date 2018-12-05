package learn.visiter.pattern.visiter;

public interface IBill {

    void accept(IAccountBookViewer viewer);
}
