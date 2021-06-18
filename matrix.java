public class Main{
    public static final String Reset = "\033[0m";//resets the color
    public static final String Blue = "\033[0;34m";//blue color
    public static final String Green = "\033[0;32m";//green color
    public static void main(String[] args){
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j < 10; j++){
                int mul = i * j;
                String Blue_reset = Blue + mul + Reset;
                String Green_reset = Green + mul + Reset;
                System.out.print("\t" + ((mul%2 == 0)? Blue_reset :         Green_reset));
            }
            System.out.println();
        }
    }
}

