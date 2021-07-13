public class Chain4 {
    public Chain4() {
    }

    public int callnext() {
        int result = new Chain5().callnext();
        return result;
    }
}
