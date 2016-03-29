package it.unimi.di.sweng.lab01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.junit.Test;


public class Lab1Tests {

	private LinkedList l;
	private static final double EPSILON = 0.001;

	@Test
	public void test1() {
		l = new LinkedList();
		assertEquals("[]", l.toString());
	}

	@Test
	public void test2() {
		l = new LinkedList();
		l.addLast(1);
		assertEquals("[1.0]", l.toString());
	}

	@Test
	public void test2b() {
		l = new LinkedList();
		l.addLast(1);
		l.addLast(3.75);
		assertEquals("[1.0 3.75]", l.toString());
	}

	@Test
	public void test3() {
		l = new LinkedList("");
		assertEquals("[]", l.toString());
		l = new LinkedList("1");
		assertEquals("[1.0]", l.toString());
	}

	@Test
	public void test3b() {
		l = new LinkedList("1 2 3");
		assertEquals("[1.0 2.0 3.0]", l.toString());
	}

	@Test
	public void test3c() {
		l = new LinkedList("1.23 2.001 3.75");
		assertEquals("[1.23 2.001 3.75]", l.toString());
	}

	@Test(expected = IllegalArgumentException.class)
	public void test3d() {
		l = new LinkedList("1 2 abb");
	}

	@Test
	public void test4() {
		l = new LinkedList("1");
		l.addFirst(3.75);
		assertEquals("[3.75 1.0]", l.toString());
		l.addFirst(1.25);
		assertEquals("[1.25 3.75 1.0]", l.toString());
	}

	@Test
	public void test5() {
		l = new LinkedList("1 2");
		assertTrue(l.removeFirst());
		assertEquals("[2.0]", l.toString());
		assertTrue(l.removeFirst());
		assertEquals("[]", l.toString());
		assertFalse(l.removeFirst());
		assertEquals("[]", l.toString());
	}

	@Test
	public void test6() {
		l = new LinkedList("1 2");
		assertTrue(l.removeLast());
		assertEquals("[1.0]", l.toString());
		assertTrue(l.removeFirst());
		assertEquals("[]", l.toString());
		assertFalse(l.removeFirst());
		assertEquals("[]", l.toString());
	}

/*	@Test
	public void test7() {
		l = new LinkedList("1 2.5 3 3 4 5 4");
		assertEquals("[1.0 2.5 3.0 3.0 4.0 5.0 4.0]", l.toString());
		assertTrue(l.remove(2.5));
		assertEquals("[1.0 3.0 3.0 4.0 5.0 4.0]", l.toString());
		assertTrue(l.remove(1));
		assertEquals("[3.0 3.0 4.0 5.0 4.0]", l.toString());
		assertTrue(l.remove(4));
		assertEquals("[3.0 3.0 5.0 4.0]", l.toString());
		assertFalse(l.remove(25));
		assertEquals("[3.0 3.0 5.0 4.0]", l.toString());
	}

/*	@Test
	public void test8() {
		l = new LinkedList();
		assertEquals(0, l.mean(), EPSILON);
		l = new LinkedList("1 2");
		assertEquals(1.5, l.mean(), EPSILON);
		l = new LinkedList("160 591 114 229 230 270 128 1657 624 1503");
		assertEquals(550.6, l.mean(), EPSILON);
		l = new LinkedList("15.0 69.9 6.5 22.4 28.4 65.9 19.4 198.7 38.8 138.2");
		assertEquals(60.32, l.mean(), EPSILON);
	}

/*	@Test
	public void test9() {
		l = new LinkedList();
        //la funzione stdDev calcola la deviazione standard (https://it.wikipedia.org/wiki/Scarto_tipo#Deviazione_standard_corretta)
		assertEquals(0, l.stdDev(), EPSILON);
		l.addLast(1);
		assertEquals(0, l.stdDev(), EPSILON);
		l = new LinkedList("160 591 114 229 230 270 128 1657 624 1503");
		assertEquals(572.026, l.stdDev(), EPSILON);
		l = new LinkedList("15.0 69.9 6.5 22.4 28.4 65.9 19.4 198.7 38.8 138.2");
		assertEquals(62.255, l.stdDev(), EPSILON);
	}

/*	@Test
	public void test10() {
		LinkedList l = new LinkedList("1 2 3");
		assertEquals(1, l.next(), EPSILON);
		assertEquals(2, l.next(), EPSILON);
		assertEquals(3, l.next(), EPSILON);
		assertEquals(3, l.next(), EPSILON);
		assertEquals(3, l.prev(), EPSILON);
		assertEquals(2, l.prev(), EPSILON);
		assertEquals(1, l.prev(), EPSILON);
		assertEquals(1, l.prev(), EPSILON);
	}

/*	@Test
	public void test11() {
		try {
			FileInputStream f = new FileInputStream("src/test/resources/input.txt");
			LinkedList l = new LinkedList(new InputStreamReader(f,"UTF-8"));
			assertEquals("[7.5 10.3 8.95 6.72 7.0 4.35 10.02]", l.toString());
			assertEquals(7.834, l.mean(), EPSILON);
			assertEquals(2.093, l.stdDev(), EPSILON);
		} catch (FileNotFoundException e) {
			fail("File does not exist");
		} catch (UnsupportedEncodingException e) {
			fail("Encoding does not exist");
		}
	}
*/
}
