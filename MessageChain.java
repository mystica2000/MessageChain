public class MessageChain {
    public static void main(String args[]) {
        Chain1 chain1 = new Chain1();
        int result = chain1.callnext();
        System.out.println(result);
    }
}