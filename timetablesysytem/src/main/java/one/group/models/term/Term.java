package one.group.models.term;

/** Class representing a term, a term is the basis for a timetable. */
public class Term{
    private static int currentTerm = 1;

    public static int getTerm(){
        int i = currentTerm;
        return i;
    }

    public static void setTerm(int n){
        if(n == 1 || n ==2){
            currentTerm = n;
        }
    }
}
