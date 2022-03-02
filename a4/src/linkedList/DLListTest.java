package linkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DLListTest {

    @Test
    public void testConstructor() {
        DLList<Integer> d= new DLList<>();
        assertEquals("[]", d.toString());
        assertEquals("[]", d.toStringRev());
        assertEquals(0, d.size());
    }
    @Test
    public void testAppendAndToStringRev() {
        DLList<String> dl= new DLList<String>();
        dl.append("2110");
        assertEquals("[2110]", dl.toString());
        assertEquals("[2110]", dl.toStringRev());
        assertEquals(1, dl.size());  
   }

}
