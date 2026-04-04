enum Status {
    RUNNING, Failed, Pending, Success;
}

public class Main {
    public static void main(String[] args) {
        Status s = Status.Success;

        // switch statement in enum
        switch (s) {
            case RUNNING:
                System.out.println("All Good");
                break;

            case Failed:
                System.out.println("Try again");
                break;

            case Pending:
                System.out.println("Please wait");
                break;

            default:
                System.out.println("Done");
                break;
        }

        // if-else statement in enum
        if (s == Status.RUNNING)
            System.out.println("All Good");
        else if (s == Status.Failed)
            System.out.println("Try again");
        else if (s == Status.Pending)
            System.out.println("Please wait");
        else
            System.out.println("Done");
    }
}