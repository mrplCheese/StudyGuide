/*
*
* In many ways, logical operators are fundamental to computer programs.
*
* They return booleans, which can then be used to "open gates" per say.
*  Let's take a look at the ins and outs!
*
*
* */

public class LogicalOperator {
    boolean b;
    boolean a;
    boolean r;
    boolean d;
//This one will rely on the default constructor, which essentially looks like this:
    /*
    *  public LogicalOperator(){
    *  b = false;
    *  a = false;
    *  r = false;
    *  d = false;
    * }
    *
    * */

    public int greaterInt(int a, int b, int c){
        int x = 0;
        if (a>=b && a>=c){ // Condensed version of: if ((a>b || a = b) && (a > c || a = c))
            //Above statement can be 'true' or 'false,' if it's true. it returns 'a.'
            return (a);
        }
        else if(b>c && b>a){
            return (b);
        }
        else{
            return (c);
        }
    }

    public static boolean weirdFunction (boolean a, boolean b, boolean c, boolean d){
        //This belongs to the class, not objects within the class.
        return !((a&&b)||!(b||d &&c)&&(c&&!a));
        //It can still be called via objects of the class, however.
    }

}
