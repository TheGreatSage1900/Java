package concepts;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.function.BiFunction;

public class Enums {

    @Getter
    @RequiredArgsConstructor
    public enum ArithmeticOperations{
        ADD("addition", Integer::sum),
        SUBTRACT("subtraction", (a,b) -> a-b),
        MULTIPLY("multiplication", (a,b) -> a*b),
        DIVIDE("division", (a,b) -> a/b);

        private final String fullName;
        private final BiFunction<Integer,Integer,Integer> operation;

        public Integer apply(Integer a, Integer b){
            return operation.apply(a,b);
        }
    }


    static void main() {

        // .values() returns an array of the Enums values
        Arrays.stream(ArithmeticOperations.values()).forEach(
                arithmeticOperations -> System.out.println(arithmeticOperations.getFullName())
        );

        // Accessing the functional interface attribute of the enum
        System.out.println(
                ArithmeticOperations.ADD.apply(5,10)
        );

    }
}
