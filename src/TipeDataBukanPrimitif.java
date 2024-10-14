public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger =100;
        Long iniLong=10000L;


        int iniInt=100;

        Integer iniObject=iniInt;

        short iniShort=iniObject.shortValue();
        long iniLong2=iniObject.longValue();
    }
}
