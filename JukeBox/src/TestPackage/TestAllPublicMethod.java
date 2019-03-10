package TestPackage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

//test the song class
public class TestAllPublicMethod {
	@Test
	public void testSong() {
	Song s1 = new Song();
	s1.setName("Guoge");
	s1.setArtist("NieEr");
	s1.setAlbum("NieErAlbum");
	s1.setUrl("www.guogexiazaishiting.com");
	s1.setFormat("Normal");
	s1.setDuration(4);
	boolean testBooleanValue = s1.isLong();
	assertFalse(testBooleanValue);
	}
//test the database class
	@Test
    public void testDatabase() {
    Database d1 = new Database();
    Song s2 = new Song("Shediao","Wuming","Gangpiangequ","shediaoxiazai.com","Normal",5);
    Song s3 = new Song("Hushangxing","Weizhi","Wangle","hushanxingxiazai.com","Normal",6);
    boolean testBooleanValue = d1.isEmpty();
    assertTrue(testBooleanValue);
    d1.addSong(s2);
    d1.addSong(s3);
    boolean testBooleanValue2 = d1.isEmpty();
    assertFalse(testBooleanValue2);
    d1.removeSong(s2);
    d1.removeSong(s3);
    boolean testBooleanValue3 = d1.isEmpty();
    assertTrue(testBooleanValue3);
    }
//test the jukebox calss
	@Test
	public void testJukebox() {
		Jukebox j1 = new Jukebox();
	
	}
}
