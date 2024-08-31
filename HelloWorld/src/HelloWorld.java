public class HelloWorld {

    public static void main(String[] args) {
        String costForPrint = "5$";
        System.out.println("Цена только для вас " +
                /*+costForPrint.charAt(0) +*/ getCurrencyName(costForPrint.charAt(1)));
    }

    public static String getCurrencyName(char symbol) {
        if (symbol == '$') {
            return " долларов";
        } else {
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }
}