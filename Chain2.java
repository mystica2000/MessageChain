public class Chain2 {
    public Chain2() {
    }

    public int callnext() {
        Chain3 chain3 = new Chain3();
        int result = chain3.callnext();
        return result;
    }
}
