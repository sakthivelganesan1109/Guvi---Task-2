import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Voter ID:");
        int voterId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        System.out.println("Enter you Age:");
        int age = sc.nextInt();

        Voters voter = null;
        try {
            voter = new Voters(voterId, name, age);
        } catch (InValidVotorsAge e) {
            throw new RuntimeException(e);
        }
        voter.display();
    }
    
}
