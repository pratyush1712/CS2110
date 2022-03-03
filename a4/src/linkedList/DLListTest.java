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
        dl.append("2800");
        assertEquals("[2800, 2110]", dl.toStringRev());
        assertEquals("[2110, 2800]", dl.toString());
        assertEquals(2, dl.size());
    }

    @Test
    public void testPrepend() {
        DLList<String> dl= new DLList<String>();
        dl.prepend("2110");
        assertEquals("[2110]", dl.toString());
        assertEquals("[2110]", dl.toStringRev());
        assertEquals(1, dl.size());
        dl.prepend("2800");
        assertEquals("[2800, 2110]", dl.toString());
        assertEquals("[2110, 2800]", dl.toStringRev());
        assertEquals(2, dl.size());
    }

    @Test
    public void testNode() {
        DLList<String> dl= new DLList<String>();
        dl.append("2110");
        dl.append("2800");
        dl.append("2220");
        dl.append("3360");
        dl.append("4999");
        assertEquals("2110", dl.value(dl.node(0)));
        assertEquals("4999", dl.value(dl.node(5)));
        assertEquals("3360", dl.value(dl.node(4)));
    }

    @Test
    public void testInsertBefore() {
        DLList<String> dl= new DLList<String>();
        dl.append("2110");
        dl.append("2800");
        dl.append("2220");
        dl.append("3360");
        dl.append("4999");
        DLList<String> dll= new DLList<String>();
        dl.insertBefore(dl.node(5), "syam math homework ho gaya?");
        assertEquals("[2110, 2800, 2220, 3360, syam math homework ho gaya?, 4999]", dl.toString());
        assertEquals("[4999, syam math homework ho gaya?, 3360, 2220, 2800, 2110]", dl.toStringRev());
        assertEquals(6, dl.size());
        dl.insertBefore(dl.node(1), "syam math homework bhej de");
        assertEquals("[syam math homework bhej de, 2110, 2800, 2220, 3360, syam math homework ho gaya?, 4999]", dl.toString());
        assertEquals("[4999, syam math homework ho gaya?, 3360, 2220, 2800, 2110, syam math homework bhej de]", dl.toStringRev());
        assertEquals(7, dl.size());
        dll.append("3");
        dll.append("8");
        dll.append("2");
        dll.insertBefore(dll.node(2), "1");
        assertEquals("[3, 8, 1, 2]", dll.toString());
        
    
    }

}
