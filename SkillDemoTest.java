import static org.junit.Assert.*;
 
import org.junit.*;
public class SkillDemoTest {
    @Test
    public void test1(){
        assertEquals(8, SkillDemo.subtract(10, 2));
    }
}
