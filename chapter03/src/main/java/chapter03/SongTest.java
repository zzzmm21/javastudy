package chapter03;

public class SongTest {

	public static void main(String[] args) {
		Song song = new Song(); 
		
		song.setTitle("좋은날");
		song.setArtist("아이유");
		song.setAlbum ("REAL");
		song.setComposer("이민수");
		song.setYear(2010);
		song.setTrack(3);
		
		song.show();
		
	}

}
