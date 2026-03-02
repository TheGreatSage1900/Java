package concepts;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;

public class DataTypes {

    /***** Integer related data types ******/


    // Size : 1 bytes
    byte bytePrimitive = 10;
    Byte byteWrapper = 20;

    // Size : 2 bytes
    short shortPrimitive = 1000;
    Short shortWrapper = 2000;

    // Size : 4 bytes
    int primitiveInt = 10;
    Integer WrapperInt = 20;

    // Size : 8 bytes
    long primitiveLong = 4242424242L;
    Long wrapperLong = 42252525L;


    /***** Float related data types ******/


    // Size : 4 bytes
    float primitiveFloat = 1242.42F;
    Float WrapperFloat = 12424.F;

    // double doesn't require the suffix , in java decimal value is double
    // Size : 8 bytes
    double primitiveDouble = 424242424.24242;
    Double WrapperDouble = 424242424242.424242;

    // gives correct decimal positions in arithmetic operations
    BigDecimal bigDecimal = BigDecimal.valueOf(42424.23232);


    /***** String related data types ******/
    // Immutable
    String name = "The Great Sage";

    // Mutable types

    // Old, slow, synchronized, thread safe
    StringBuffer buffer = new StringBuffer("String buffer");

    //  Recommended , fast , not thread safe
    StringBuilder builder = new StringBuilder("String builder");

    // defining JSON ( JAVA 17 feature )
    String json = """
            {
            "name":"jake",
            "number":4242424
            }
            """;

    char primitiveCharacter = 'a';
    Character wrapperCharacter = 'a';

    boolean primitiveBoolean = true;
    Boolean wrapperBoolean = true;



    /***** Time/Date related data types ******/

    // For timestamps Recommended
    Instant instant = Instant.now();

    // For Date
    LocalDate localDate = LocalDate.now();

    // for time with offset
    OffsetDateTime offsetDateTime = OffsetDateTime.now();




    void tryOut() {
        System.out.println("Instant " + instant);
        System.out.println("Local date " + localDate);
        System.out.println("Offset " + offsetDateTime);

    }


    static void main() {
        DataTypes dataTypes = new DataTypes();

        dataTypes.tryOut();
    }
}
