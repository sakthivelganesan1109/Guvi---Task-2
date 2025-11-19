public class Voters {
    int voterId;
    String name;
    int age;

    public Voters() {

    }

    public Voters(int VoterId, String name, int age) throws InValidVotorsAge {
        this.voterId = voterId;
        this.name = name;
        this.age = age;

        if(age < 18) {
            throw new InValidVotorsAge("Invalid Age for Voter");
        }

    }

    public void display() {
        System.out.println("Voter ID is "+voterId);
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);

    }
    
}
