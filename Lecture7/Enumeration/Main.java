package Lecture7.Enumeration;

/**
 * Main
 */
public class Main {
    enum Week implements A{//extend java.lang.enum hence cant extend anthing else
        Mon,Tue,Wed,Thu,Fri,Sat,Sun;//Public Static & Final
        //Final->no child Enum
        Week(){//is not public or protected
            System.out.println("Constructor called for "+this);
        }
        @Override
        public void hello() {
            // TODO Auto-generated method stub
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
        Week week;
        week= Week.Mon;
        week.hello();
        // for(week day: Week.values()){
        //     System.out.println(day);
        // }
        System.out.println(week.ordinal());
    }
}