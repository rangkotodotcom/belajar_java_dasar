public class Array {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Satu";
        arrayString[1] = "Dua";
        arrayString[2] = "Tiga";

        System.out.println(arrayString[0]);



        int[] arrayInt = {
                10,20,30,40
        };


        String[][] members={
                {"Item 0 0", "Item 0 1", "Item 0 2"},
                {"Item 1 0", "Item 1 1", "Item 1 2"},
                {"Item 2 0", "Item 2 1", "Item 2 2"},
        };

        System.out.println(members[0][2]);
    }
}
