public class Main {
    public static void main(String[] args) {
        int costTicket = 5;
        int oneMile = 20;

        if (costTicket >= 0) {
            int bonusMile = costTicket / oneMile;
            System.out.println("You have been awarded " + bonusMile + " bonus miles");
        } else if (costTicket < 0) {
            System.out.println("Warning! You have entered a negative value!");
        }
    }
}