import java.util.Arrays;
import java.util.Optional;

/*
 @Author Naseem Ahamed
 @Problem statement - Find the longest binary gap in the given string
*/
public class BinaryGap {

    static int findLongestBinaryGap(Integer N) {
        //Divide N by 2 till its binary representation does not have trailing zeros.
        while (N % 2 == 0) {
            N /= 2;
        }

        return Optional.ofNullable(
                N
        )
                //Split by 1 so that each array has a sequence of 0s
                .map(input -> Integer
                        .toBinaryString(input).split("1"))
                //To rule out conditions like 1111 where there are no 0s
                .filter(obj -> obj.length > 0)
                // Stream the array
                .flatMap(values -> Arrays.stream(values)
                        // Take the length of each value that has sequence of 0s
                        .map(String::length)
                        //Get the array element with maximum length
                        .max(Integer::compareTo))
                .orElse(0);
    }

//    public static void main(String[] args) {
//        int a = 36;
//        System.out.println("The longest binary gap length is " + findLongestBinaryGap(a));
//    }
}
