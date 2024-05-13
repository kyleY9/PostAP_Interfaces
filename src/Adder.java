public class Adder implements Megafun {
    private int num;

    public Adder(int n) {
        num = n;
    }

    public void add(int n) {
        num += n;
    }

    public void printInfo() {
        System.out.println("Num: " + num);
    }

    public void haveMegaFun() {

    }
}
