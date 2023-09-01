import java.util.*;

class Main {
    static class ThreeDayTrip {
        String[][] events = new String[3][3];

        void addEvent(int day, String event) throws MyEr {
            if (day > 3) {
                throw new MyEr("nie ma takiego dnia!");
            }
            events[--day][--day] = event;
        }
        String[] getEvent(int day) throws MyEr {
            if (day > 3) {
                throw new MyEr("nie ma takiego dnia, zakres do 3!");
            }
            return events[--day];
        }
    }

    public static class MyEr extends Exception {
        public MyEr(String err) {
            super(err);
        }
    }

    public static void execute() throws MyEr {
        System.out.println("exec");
        ThreeDayTrip trip = new ThreeDayTrip();
        trip.addEvent(3, "piknik");
        String[] myTrip = trip.getEvent(2);
        for (int i = 0 ; i < myTrip.length; i++) {
            System.out.println(myTrip[i]);
        }

    }

    public static void main(String args[]) throws MyEr {
        C c = new C();
        System.out.println();
        execute();
        System.out.println(03);
    }
    
    public static int operation (int a, int b) {
        int tmp = 0;
        int wartosc = 0;
        
        while (a >= tmp) {
            tmp = b;
            
            while(a >= tmp << 1) {
                
            }
        }
    }
}

class A {
    String a = "";
    public A() {
        System.out.print("A");
    }
}
class B extends A {
    public B() {
        System.out.print("B");
    }
}
class C extends B {
    public C() {
        System.out.print("C");
    }
}




