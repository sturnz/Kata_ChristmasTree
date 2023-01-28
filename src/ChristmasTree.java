public class ChristmasTree {
    String styleOfTree =  "X";
    String styleOfTrunk = "#";

    public String GetYourTree(int heightOfTree){

        if(heightOfTree <= 0) return "No tree for you :(";

        StringBuilder christmasTree = new StringBuilder();

        for (int treeRow = 1; treeRow <= heightOfTree; treeRow++) {

            christmasTree   .append( GetWhiteSpaces(heightOfTree, treeRow))
                            .append( GetGreenery(treeRow))
                            .append( "\n");
        }

        christmasTree.append(GetTreeTrunk(heightOfTree));

        return String.valueOf(christmasTree);
    }

    String GetWhiteSpaces(int heightOfTree, int treeRow){

        return " ".repeat(heightOfTree - treeRow);
    }

    String GetGreenery(int treeRow){

        return styleOfTree.repeat(2 * treeRow - 1);
    }

    String GetTreeTrunk(int heightOfTree){

        return GetWhiteSpaces(heightOfTree, 1) + styleOfTrunk;
    }
}
