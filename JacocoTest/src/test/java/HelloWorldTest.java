import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void helloWorld()
    {
        HelloWorld hw = new HelloWorld();
        hw.helloWorld();
    }

    @Test
   public void toDo()
    {
        List<Integer> expectedNumbers = Arrays.asList(1,2,3,4,5);
        List<Integer> actualNumbers=HelloWorld.toDo();
        assertEquals(expectedNumbers,actualNumbers);
    }
    @Test
    public void doName()
    {
        List<String> expectedNames=Arrays.asList("akash","kajol","maya","aditya","suresh","ramesh");
        List<String> actualNames=HelloWorld.doName();
        assertEquals(expectedNames,actualNames);
    }



}
