import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
public class Test_GetTree {
    int             heightOfTree;
    String          finalTree;
    ChristmasTree   christmasTree = new ChristmasTree();

    public Test_GetTree(int heightOfTree, String finalTree){
        this.heightOfTree   = heightOfTree;
        this.finalTree      = finalTree;
    }

    @Parameterized.Parameters(name = "Height of tree: {0}")
    public static Collection trees() {
        return Arrays.asList(new Object[][]{
            {2, " X\nXXX\n #"},
            {0, "No tree for you :("},
            {6, "     X\n    XXX\n   XXXXX\n  XXXXXXX\n XXXXXXXXX\nXXXXXXXXXXX\n     #"},
        });
    }

    @Test
    public void ShouldReturnCorrectTreeWithGivenHeight() {
        assertEquals(finalTree, christmasTree.GetYourTree(heightOfTree));
    }
}


