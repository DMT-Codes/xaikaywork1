package org.howard.edu.lsp.exam.question42;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SongsDatabaseTest {
	
	@Test
	@DisplayName("Test Case 1: Given by instructor")
	public void testGenreOfSong1() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		
		String songGenre = db.getGenreOfSong("Savage");
		assertTrue(songGenre.equals("Rap"));
	};
	
	@Test
	@DisplayName("Test Case 2: Given by instructor")
	public void testGenreOfSong2() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		
		String songGenre = db.getGenreOfSong("Always There");
		assertTrue(songGenre == "Jazz");
	};
	
	@Test
	@DisplayName("Test Case 3: Given by instructor")
	public void testGetSongs1() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		
		Set<String> songs = db.getSongs("Rap");
		Set<String> songsSet = new HashSet<String>();
		
		songsSet.add("Savage");
		songsSet.add("Gin and Juice");
		
		assertTrue(songs.containsAll(songsSet));
	};
	
}
