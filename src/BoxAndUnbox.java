/*
*
* Documentation is an excellent way to communicate clearly about your code.
*
* This class is going to be used to explore the relationships between ints and doubles.
*
* there are classes, Integer and Double, which allow doubles and ints to act like other types of data.
*
*/
public class BoxAndUnbox {
    public BoxAndUnbox(){
        int testInt = 5;
        double testDouble = testInt; //Auto boxing! int can be treated as a double w/o data loss.
        testDouble+=0.5;
        testInt = (int) testDouble;
        //Due to data loss, doubles cannot automatically be boxed into integers.
        // You have to fo manual boxing. testInt will still be equal to '5'

    }
}
