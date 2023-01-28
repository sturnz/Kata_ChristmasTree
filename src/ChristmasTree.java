public class ChristmasTree {
    public String GetYourTree(int heightOfTree){

        if(heightOfTree <= 0) return "No tree for you :(";

        StringBuilder christmasTree = new StringBuilder();

        for (int i = 1; i <= heightOfTree; i++) {

            christmasTree   .append( GetWhiteSpaces(heightOfTree, i))
                            .append( GetGreenery(i))
                            .append( "\n");
        }

        christmasTree.append(GetTreeTrunk(heightOfTree));

        return String.valueOf(christmasTree);
    }

    String GetWhiteSpaces(int heightOfTree, int i){

        return " ".repeat(heightOfTree - i);
    }

    String GetGreenery(int i){

        return "X".repeat(2*i-1);
    }

    String GetTreeTrunk(int heightOfTree){

        return GetWhiteSpaces(heightOfTree, 1) + "#";
    }
}
