package exampl.utils;

public class Printer {

    private Printer() {}

    public static void printSuccessfulSaveMethodMessage(){
        System.out.println(" save successful ");
    }

    public static void printFindByParamExceptionMessage(){
        System.out.println("Please, check type of your entered value");
    }
}
