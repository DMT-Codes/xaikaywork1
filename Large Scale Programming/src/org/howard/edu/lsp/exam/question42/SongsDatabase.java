package org.howard.edu.lsp.exam.question42;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {
	private Map<String, Set<String>> database = new HashMap<String, Set<String>>();			
	/**
	 * 
	 * @param genre is the genre for the song
	 * @param songTitle is the title of the song
	 */
	public void addSong(String genre, String songTitle) {
		if (database.containsKey(genre)) {
			Set<String> songs = database.get(genre);
			songs.add(songTitle);
		} else {
			Set<String> songs = new HashSet<String>();
			songs.add(songTitle);
			database.put(genre, songs);
		}
	};
	
    /**
     * 
     * @param genre is the genre for the song
     * @return
     */
    public Set<String> getSongs(String genre) {
		Set<String> songs = database.get(genre);
		return songs;
    	};
	
	/**
	 * 
	 * @param songTitle 
	 * @return
	 */
    public String getGenreOfSong(String songTitle){
        for(Map.Entry<String,Set<String>> genre : database.entrySet()){
            if(genre.getValue().contains(songTitle)){
                return genre.getKey();
            }
		}
		return null;
	};
};