import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomStringTest {

	//declare custom string for testing
	CustomString myCustomString;

	@BeforeEach
	public void setUp() throws Exception {
		//initialize custom string for testing
		this.myCustomString = new CustomString();
	}

@Test
	void testGetString() {
		
		//string should be null to start, before setting it
		assertNull(this.myCustomString.getString());
		
		this.myCustomString.setString("hello");
		assertEquals("hello", this.myCustomString.getString());
		
		// TODO write at least 3 additional test cases
		this.myCustomString.setString("test123");
		assertEquals("test123", this.myCustomString.getString());

		this.myCustomString.setString(" ");
		assertEquals(" ", this.myCustomString.getString());

		this.myCustomString.setString(null);
		assertNull(this.myCustomString.getString());
	}
	
	@Test
	void testSetString() {
		
		//string should be null to start, before setting it
		assertNull(this.myCustomString.getString());
		
		this.myCustomString.setString("Good-bye!");
		assertEquals("Good-bye!", this.myCustomString.getString());
		
		// TODO write at least 3 additional test cases
		this.myCustomString.setString("New String");
		assertEquals("New String", this.myCustomString.getString());

		this.myCustomString.setString("");
		assertEquals("", this.myCustomString.getString());

		this.myCustomString.setString(null);
		assertNull(this.myCustomString.getString());
	}
	
	@Test
	void testRemove() {
		assertEquals("", this.myCustomString.remove(""));
		
		this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.remove(""));
		
		this.myCustomString.setString("my lucky numbers are 6, 8, and 19.");
		assertEquals("my lucky numbes e 6, 8, nd 19.", this.myCustomString.remove("ra6"));
		
		// TODO write at least 3 additional test cases
		assertEquals("my ucky numbers are 6, 8, and 19.", this.myCustomString.remove("l"));

		assertEquals("my lucky numbers are 6, 8, and 19.", this.myCustomString.remove("6819"));

		assertEquals("y cky nbrs r 6, 8, nd 19.", this.myCustomString.remove("mleau"));
	}

	@Test
	void testReverse() {
		assertEquals("", this.myCustomString.reverse(""));
		
		this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.reverse(""));
		
		this.myCustomString.setString("abc, XYZ; 123.");
		assertEquals("aBC, xyz; 123.", this.myCustomString.reverse("bcdxyz@3210."));
		
		// TODO write at least 3 additional test cases
		this.myCustomString.setString("Hello World!");
		assertEquals("hELLO wOrLd!", this.myCustomString.reverse("heLOW"));

		this.myCustomString.setString("Java Programming");
		assertEquals("jAvA pRogRAmming", this.myCustomString.reverse("jArp"));

		this.myCustomString.setString("123 ABC abc");
		assertEquals("123 abc ABC", this.myCustomString.reverse("abc"));

	}

	@Test
	void testFilterLetters() {
		assertEquals("", this.myCustomString.filterLetters('E', false));
		
		this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.filterLetters('E', false));
		
		// TODO write at least 3 additional test cases
		this.myCustomString.setString("abcdef");
		assertEquals("ef", this.myCustomString.filterLetters('d', false));

		this.myCustomString.setString("XYZxyz");
		assertEquals("", this.myCustomString.filterLetters('Z', false));

		this.myCustomString.setString("Hello World");
		assertEquals("e d", this.myCustomString.filterLetters('H', true));
	}

}