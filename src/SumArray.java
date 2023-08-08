import java.util.ArrayList;
public class SumArray {
    public static void main(String[] args) {
        double[] exampleArray = {3,3,3,3};

        double sum = 0;

        for (int i = 0; i < exampleArray.length; i++) {
            sum += exampleArray[i];
        }

        System.out.println("Sum of array elements: " + sum);


    }
}
