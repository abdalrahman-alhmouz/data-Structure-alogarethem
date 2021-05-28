/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtable;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void one() throws Exception {
        HashTable nnn =new HashTable();
        nnn.Sizee(1);
        nnn.added(10,20);

        assertTrue( nnn.containKey(10));

    }
    @Test public void indexTest() throws Exception {
        HashTable nnn =new HashTable();
        nnn.Sizee(12);
        nnn.added(10,20);

        assertEquals( 2,nnn.getIndex(14));

    }

    @Test public void retrieveValueTest() throws Exception {
        HashTable nnn =new HashTable();
        nnn.Sizee(12);
        nnn.added(10,20);
        nnn.added(2,5);
        nnn.added(1,270);
        nnn.added(90,920);
        nnn.added(150,720);
        nnn.added(10,210);
        nnn.added(2,55);
        nnn.added(1,2750);
        assertTrue( nnn.contain(1,2750));
        assertTrue( nnn.contain(1,270));

    }

    @Test public void handleCollision () throws Exception {
        HashTable nnn =new HashTable();
        nnn.Sizee(12);
        nnn.added(1,20);
        nnn.added(1,5);
        nnn.added(1,270);
        nnn.added(1,920);
        nnn.added(1,720);
        nnn.added(1,210);
        nnn.added(1,55);
        nnn.added(1,2750);
        assertTrue( nnn.contain(1,2750));
        assertTrue( nnn.contain(1,270));
        assertTrue( nnn.contain(1,55));
        assertTrue( nnn.contain(1,920));

    }

    @Test public void test() throws Exception {
        HashTable nnn =new HashTable();
        nnn.Sizee(10);
        nnn.added(10,20);
        nnn.added(2,5);
        nnn.added(1,270);
        nnn.added(90,920);
        nnn.added(150,720);
        nnn.added(10,210);
        nnn.added(2,55);
        nnn.added(1,2750);


        System.out.println(nnn.contain(120,7280));
        assertEquals("270 2750 ", nnn.getValue(1));
        assertEquals("920 ", nnn.getValue(90));
        assertEquals("5 55 ", nnn.getValue(2));
        assertEquals(null, nnn.getValue(70));

    }
    @Test public void testAppHasAGreeting() throws Exception {
        HashTable nnn =new HashTable();
        nnn.Sizee(10);
        nnn.added(10,20);
        nnn.added(2,5);
        nnn.added(1,270);
        nnn.added(90,920);
        nnn.added(150,720);
        nnn.added(10,210);
        nnn.added(2,55);
        nnn.added(1,2750);


        System.out.println(nnn.contain(120,7280));
        assertTrue( nnn.containKey(1));
        assertTrue( nnn.containKey(150));
        assertTrue( nnn.containKey(90));

    }

    @Test public void testTow() throws Exception {
        HashTable nnn =new HashTable();
        nnn.Sizee(7);
        nnn.added(10,20);
        nnn.added(2,5);
        nnn.added(1,270);
        nnn.added(90,920);
        nnn.added(150,720);
        nnn.added(10,210);

        assertTrue( nnn.contain(90,920));
        assertFalse( nnn.contain(90,20));
    }

    @Test public void testThree() throws Exception {
        HashTable nnn =new HashTable();
        nnn.Sizee(7);
        nnn.added(10,20);
        nnn.added(2,5);
        nnn.added(1,270);
        nnn.added(90,920);
        nnn.added(150,720);
        nnn.added(10,210);
        assertEquals(3, nnn.getIndex(24));
        assertFalse( nnn.contain(90,20));
    }

}
