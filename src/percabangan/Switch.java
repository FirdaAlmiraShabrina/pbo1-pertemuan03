package percabangan;

public class Switch {
    public static void main(String[] args) {
        int MenuKueBalok=3;
        switch (MenuKueBalok){
            case 1:
                System.out.println("kue balok original");
                break;
            case 2:
                System.out.println("kue balok brownis");
                break;
            case 3:
                System.out.println("kue balok greentea");
                break;
            case 4:
                System.out.println("kue balok chocobanana");
                break;
            default:
                System.out.println("kue balok tiramisu");
        }
    }
}
