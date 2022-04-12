import Opgave2dot7.DifferentBigO;

public class Main {
    public static void main(String[] args) {


        DifferentBigO differentBigO = new DifferentBigO();

        int inputSize = 1000;

        System.out.println("Input size: " + inputSize);

        String type = "N";
        long startTime = 0;
        startTime = System.nanoTime();

        differentBigO.incIntN(inputSize);

        endTimeForTypeAndInputSize(startTime, type);

        type = "Sq";
        startTime = System.nanoTime();

        differentBigO.incIntNSq(inputSize);

        endTimeForTypeAndInputSize(startTime, type);


        type = "Cubed";
        startTime = System.nanoTime();

        differentBigO.incIntNCubed(inputSize);

        endTimeForTypeAndInputSize(startTime, type);


        type = "SqButDifferentWay";
        startTime = System.nanoTime();

        differentBigO.incIntNSqNewWay(inputSize);

        endTimeForTypeAndInputSize(startTime, type);



    }

    private static void endTimeForTypeAndInputSize(long startTime, String type) {
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Time complex: " + type);
        System.out.println("Time in nanoseconds: " + duration);
        System.out.println("Time in milliseconds: " + duration/1000);
        System.out.println("\n");
    }


}
