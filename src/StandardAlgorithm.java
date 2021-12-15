/*
*
* There are some things that we just... need to know when it comes to java.
* These are the standard algorithms.
*
* They use one or more of the ideas explored in the other classes, and perform many important tasks
* with high efficiency, and in ways that make sense.
*
* */

public class StandardAlgorithm {
private double avg;
private int intAvg;


    public static int countCharacters(String str){
        int count = 0;
        String temp = "";
        for (int i = 0; i<str.length(); i++){
            temp = str.substring(i, i+1);
            if (temp.equals("(") || temp.equals(")")){
                count ++;
            }
        }
        return count;
    }

    public static String reverse(String str){
        String rev = "";
        for (int i = 0; i<str.length();i++){
            rev = str.substring(i,i+1) + rev;
        }

        return rev;
    }

    private void avgCalculator(double [] pieces){
        avg = 0;
        for (int i = 0; i<pieces.length;i++){
            avg+=pieces[i];
        }
        avg/=pieces.length;
        intAvg = (int)avg;
    }

    public double getAvg (){ //Accessor
        return avg;
    }

    public int getIntAvg(){ //Accessor
        return intAvg;
    }

    public void avgFromInts (int val1, int val2, int val3){
        //box into a double array!
        double[] boxer = {val1, val2, val3};
        avgCalculator(boxer);
    }

    public void avgFromDoubles(double val1, double val2, double val3){
        double[] organizer = {val1, val2, val3};
        avgCalculator(organizer);
    }

    public void avgFromArray(double [] valueHolder){
        avgCalculator(valueHolder);
    }

}
