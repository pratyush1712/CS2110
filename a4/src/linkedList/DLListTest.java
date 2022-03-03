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
        assertEquals("2800", dl.value(dl.node(1)));
        assertEquals("2220", dl.value(dl.node(2)));
        assertEquals("3360", dl.value(dl.node(3)));
        assertEquals("4999", dl.value(dl.node(4)));
    }

    @Test
    public void testInsertAfter() {
        DLList<String> dl= new DLList<String>();
        dl.append("2110");
        dl.append("2800");
        dl.append("2220");
        dl.append("3360");
        dl.append("4999");
        dl.insertAfter(dl.node(4), "syam math homework ho gaya?");
        assertEquals("[2110, 2800, 2220, 3360, 4999, syam math homework ho gaya?]", dl.toString());
        assertEquals("[syam math homework ho gaya?, 4999, 3360, 2220, 2800, 2110]", dl.toStringRev());
        assertEquals(6, dl.size());
        DLList<String> dll= new DLList<String>();
        dll.append("3");
        dll.append("8");
        dll.append("2");
        dll.insertAfter(dll.node(0), "1");
        assertEquals("[3, 1, 8, 2]", dll.toString());
        assertEquals("[2, 8, 1, 3]", dll.toStringRev());
        assertEquals(4, dll.size());
    }
    
    @Test
    public void testDelete() {
        DLList<String> dl= new DLList<String>();
        dl.prepend("hello");
		DLList<String>.Node x = dl.node(0);
		dl.delete(x);
		assertEquals(0, dl.size());

		dl.append("hi");
		dl.append("howdy");
		dl.append("howzat");
		dl.append("wassup");
        dl.append("hey");

		assertEquals("[hi, howdy, howzat, wassup, hey]", dl.toStringRev());
		assertEquals(5, dl.size());

		DList<String>.Node x1 = dl.node(1);
		dl.delete(x1);
        
		DList<String>.Node x2 = dl.node(1);
		assertEquals("[hi, howzat, wassup, hey]", dl.toStringRev());
		assertEquals("howzat", x2.value());
        
		DList<String>.Node x3 = dl.node(0);
		dl.delete(x3);
		assertEquals("[howzat, wassup, hey]", dl.toStringRev());
		DList<String>.Node x4 = dl.node(0);
		assertEquals("howzat", x4.value());

		DList<String>.Node x5 = dl.node(dl.size()-1);
		dl.delete(x5);
		assertEquals("[howzat, wassup]", dl.toStringRev());
        DList<String>.Node x6 = dl.node(dl.size()-1);
		assertEquals("wassup", x6.value());
        
    }

}
