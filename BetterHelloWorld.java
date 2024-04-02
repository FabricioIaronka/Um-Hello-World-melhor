public class BetterHelloWorld {
    public static void main(String[] args) {
        try {

            //Usa as funções predefinidas
            printHello1('a', 'z');
            Thread.sleep(35);

            printHello1('A', 'H');
            Thread.sleep(35);

            printHello2('a', 'z');
            printHello2('a', 'e');
            Thread.sleep(35);

            printHello3('a', 'z');
            printHello3('a', 'l');
            Thread.sleep(35);

            printHello4('a', 'z');
            printHello4('a', 'l');
            Thread.sleep(35);

            printHello5('a', 'z');
            printHello5('a','o');
            Thread.sleep(35);

            printWorld1('a', 'z');
            printWorld1('A', 'W');
            Thread.sleep(35);

            printWorld2('a', 'z');
            printWorld2('a', 'o');
            Thread.sleep(35);

            printWorld3('a', 'z');
            printWorld3('a', 'r');
            Thread.sleep(35);

            printWorld4('a', 'z');
            printWorld4('a', 'l');
            Thread.sleep(35);

            printWorld5('a', 'z');
            printWorld5('a', 'd');
            Thread.sleep(35);
        } 
        
        //Resolve o problema do Thread.sleep
        catch (InterruptedException e) {
            
            e.printStackTrace();
        }
    }

    //Cada um cria funções para definir um "for" que define inicio e final mais o tempo entre os caracteres
    private static void printHello1(char start, char end) {
        try{
            for (char c = start; c <= end; c++) {
               System.out.println(c + " ");
               Thread.sleep(35);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private static void printHello2(char start, char end) {
        try{
            for (char c = start; c <= end; c++) {
               System.out.println("H"+c + " ");
               Thread.sleep(35);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private static void printHello3(char start, char end) {
        try{
            for (char c = start; c <= end; c++) {
               System.out.println("He"+c + " ");
               Thread.sleep(35);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private static void printHello4(char start, char end) {
        try{
            for (char c = start; c <= end; c++) {
               System.out.println("Hel"+c + " ");
               Thread.sleep(35);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private static void printHello5(char start, char end) {
        try{
            for (char c = start; c <= end; c++) {
               System.out.println("Hell"+c + " ");
               Thread.sleep(35);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private static void printWorld1(char start, char end) {
        try{
            for (char c = start; c <= end; c++) {
               System.out.println("Hello "+c + " ");
               Thread.sleep(35);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private static void printWorld2(char start, char end) {
        try{
            for (char c = start; c <= end; c++) {
               System.out.println("Hello W"+c + " ");
               Thread.sleep(35);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private static void printWorld3(char start, char end) {
        try{
            for (char c = start; c <= end; c++) {
               System.out.println("Hello Wo"+c + " ");
               Thread.sleep(35);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private static void printWorld4(char start, char end) {
        try{
            for (char c = start; c <= end; c++) {
               System.out.println("Hello Wor"+c + " ");
               Thread.sleep(35);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private static void printWorld5(char start, char end) {
        try{
            for (char c = start; c <= end; c++) {
               System.out.println("Hello Worl"+c + " ");
               Thread.sleep(35);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}