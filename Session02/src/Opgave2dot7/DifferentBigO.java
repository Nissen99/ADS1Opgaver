package Opgave2dot7;

public class DifferentBigO {



public int incIntN(int n){
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum++;
    }

    return sum;
}

public int incIntNSq(int n){
    int sum = 0;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            sum++;
        }
    }

    return sum;
}

public int incIntNSqAndMore(int n){
    int sum = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n * n; j++) {
            sum++;
        }
    }
    return sum;
}

public int incIntNLogN(int n){
    int sum = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < i; j++) {
            sum++;
        }
    }
    return sum;
}


}
