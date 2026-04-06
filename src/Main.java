class DiluException extends Exception {
    public DiluException(String string) {
        super(string);
    }
}
    public class Main {
        public static void main(String[] args) {
            int i = 20;
            int j = 0;

            try {
                j = 18/i;
                if (j==0) {
                    throw new DiluException("I don't want to print zero");
                }
            }
            catch (DiluException e) {
                j = 18/1;
                System.out.println("That the default output " + e);
            }
            catch (Exception e) {
                System.out.println("Something went wrong " + e);
            }
            System.out.println(j);
            System.out.println("bye");
    }
}