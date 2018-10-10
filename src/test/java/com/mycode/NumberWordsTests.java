package com.mycode;

import org.junit.*;

import com.mycode.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
		
	}
	@Test
	public void exitZero() {
		Assert.assertEquals( "Error", "Exit Program", numberWords.toWords( 0 ) ) ;
		
	}
	@Test
	public void lengthExceed() {
		Assert.assertEquals( "Error", "Length more than 4 is not supported", numberWords.toWords( 22222 ) ) ;
		
	}
	@Test
	public void oneDigitCheck() {
		Assert.assertEquals( "Error", "five", numberWords.toWords( 5 ));
	
	}@Test
	public void twoDigitCheck() {
		Assert.assertEquals( "Error", "twenty", numberWords.toWords( 20 ) ) ;
		Assert.assertEquals( "Error", "fifteen", numberWords.toWords( 15 ) ) ;
		Assert.assertEquals( "Error", "thirty one", numberWords.toWords( 31 ) ) ;
		Assert.assertEquals( "Error", "sixty", numberWords.toWords( 60 ) ) ;
		
	}
	
	@Test
	public void threeDigitCheck() {
		Assert.assertEquals( "Error", "one hundred", numberWords.toWords( 100 ) ) ;
		Assert.assertEquals( "Error", "one hundred ninety nine", numberWords.toWords( 199 ) ) ;
		Assert.assertEquals( "Error", "nine hundred ninety nine", numberWords.toWords( 999 ) ) ;
	}
	
	@Test
	public void FourDigitCheck() {
		Assert.assertEquals( "Error", "one thousand one hundred ninety nine", numberWords.toWords( 1199 ) ) ;
		Assert.assertEquals( "Error", "nine thousand nine hundred ninety nine", numberWords.toWords( 9999 ) ) ;
	}
	
	



}
