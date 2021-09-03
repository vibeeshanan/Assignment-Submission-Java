import java.util.Scanner;
class Cab {
    int fare;
    int d;      //distance travelled by user

    public Cab() {
        fare = 30;
    }

    //parameterized constructor
    public Cab(int amt) {
        fare = amt;
    }

    void showFare() {
        System.out.println("Total Fare: Rs " + fare);
    }
}

class RideCab {
    public static void main(String[] args) {
        int cd;     //distance of cab from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cab distance from user: ");
        cd = sc.nextInt();
        if(cd > 5) {
            Cab ob = new Cab(30 + 10 * (cd - 5));
            System.out.print("Enter the distance travelled: ");
            ob.d = sc.nextInt();

            ob.fare = ob.fare + 10 * ob.d;
            
            ob.showFare();
        }
        else {
            Cab ob = new Cab();
            System.out.print("Enter the distance travelled: ");
            ob.d = sc.nextInt();

            ob.fare = ob.fare + 10 * ob.d;
            
            ob.showFare();

            
        }

        
    }
}
