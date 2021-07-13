public class Chain1 {
    public Chain1() {
    }

    public int callnext() {
        Chain2 chain2 = new Chain2();
        int result = chain2.callnext();
        return result;
    }
}
