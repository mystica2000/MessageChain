public class Chain5 {
    public Chain5() {
    }

    public int callnext() {
        int result = new Chain6().call();
        return result;
    }
}
