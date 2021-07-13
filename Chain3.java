public class Chain3 {
    public Chain3() {
    }

    public int callnext() {
        int result = new Chain4().callnext();
        return result;
    }
}
