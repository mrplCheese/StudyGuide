/*
*
* So many decisions. if, else if, else, switch, etc.
*
* Let's explore some nuances of the decision-making processes.
*
* Let's also explore 'this' and constructor overloading!
* */

public class Decisions {
    private int val1 = 0, val2 = 0, val3 = 0;
    private String strung = "", strungBackwards = "";


    public Decisions(int val1, int val2, int val3, String strung, String strungBackwards){
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
        this.strung = strung;
        this.strungBackwards = strungBackwards;
    }

    public Decisions(int val1, int val2, int val3){
        this();
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
    }

    public Decisions(String strung, String strungBackwards){
        this();
        this.strung = strung;
        this.strungBackwards = strungBackwards;
    }

    public Decisions(){
        val1 = 5;
        val2 = 3;
        val3 = 17;
        strung = "Hello";
        strungBackwards = "oleh";
    }

}
