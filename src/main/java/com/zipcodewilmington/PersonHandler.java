package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        String stringRepresentation = "";
        Person currentPerson = new Person(null, null);
        Integer iCount = 0;

        while (iCount < personArray.length) {

            currentPerson = personArray[iCount];

            stringRepresentation = currentPerson.toString();

            result = result + (stringRepresentation);

            iCount++;
        }


        // create a `counter`
        // while `counter` is less than length of array
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        String stringRepresentation = "";
        Person currentPerson = new Person(null, null);
        Integer iCount = 0;

        for (iCount = 0; iCount < personArray.length; iCount++) {

            currentPerson = personArray[iCount];

            stringRepresentation = currentPerson.toString();

            result = result + (stringRepresentation);

        }


        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        String stringRepresentation = "";
        Person currentPerson = new Person(null, null);
        Integer iCount = 0;


        for (Person iPerson : personArray) {

            currentPerson = iPerson;

            stringRepresentation = currentPerson.toString();

            result = result + (stringRepresentation);

        }



        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
