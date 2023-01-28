public class Main {
    public static void main(String[] args) {
        ChristmasTree   christmasTree   = new ChristmasTree();
        int             heightOfTree    = 20;
        String          finalTree       = String.valueOf(christmasTree.GetYourTree(heightOfTree));

        System.out.println(finalTree);
    }
}