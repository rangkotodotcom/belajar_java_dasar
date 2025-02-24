public class MethodVariableArgument {
    public static void main(String[] args) {
        sayCongrats("bambang",80,40,30);
    }

    static void sayCongrats(String name, int... values){
        int total = 0;

        for (var value: values){
            total += value;
        }

        var finalValue = total /values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat "+ name+ ", Anda Lulus");
        }else {
            System.out.println("Maaf,");
        }
    }
}
