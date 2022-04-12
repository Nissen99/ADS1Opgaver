import Opgave2dot7.DifferentBigO;

public class Main {
    public static void main(String[] args) {


        DifferentBigO differentBigO = new DifferentBigO();

        int inputSize = Integer.MAX_VALUE;


        String type = "N";
        long startTime = System.nanoTime();

        differentBigO.incIntN(inputSize);

        endTimeForTypeAndInputSize(startTime, type, inputSize);

        type = "Sq";
        startTime = System.nanoTime();

        differentBigO.incIntNSq(inputSize);

        endTimeForTypeAndInputSize(startTime, type, inputSize);


        type = "SqAndMore";
        startTime = System.nanoTime();

        differentBigO.incIntNSqAndMore(inputSize);

        endTimeForTypeAndInputSize(startTime, type, inputSize);


        type = "NLogN";
        startTime = System.nanoTime();

        differentBigO.incIntNLogN(inputSize);

        endTimeForTypeAndInputSize(startTime, type, inputSize);



    }

    private static void endTimeForTypeAndInputSize(long startTime, String type, int inputSize) {
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println(type +"Time in nanoseconds for input Size " + inputSize + " : " + duration);
    }


}
