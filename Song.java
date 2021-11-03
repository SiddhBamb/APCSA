public class Song
{
	/** title instance variable*/
	private String title;
	/** album instance variable*/
	private String album;
	/** artist instance variable*/
	private String artist;
	/** song length instance variable (in seconds) */
	private int songLength;
	
	/** default constructor used to set the instance variables to default values*/
	public Song()
	{
		title = "Title";
		album = "Album";
		artist = "Artist";
		songLength = 0;
	}
	
	/** initialization constructor used to set the instance variables
		* @param t the song title 
		* @param al the name of the album
		* @param ar the name of the artist
		* @param length the length of the song*/
	public Song(String t, String al, String ar, int length)
	{
		title = t;
		album = al;
		artist = ar;
		songLength = length;
	}
	
	/** modifier method to set the instance variable title
		* @param t the song title*/
	public void setTitle(String t)
	{
		title = t;
	}
	
	/** modifier method to set the instance variable album
		* @param al the name of the album*/
	public void setAlbum(String al)
	{
		album = al;
	}
	
	/** modifier method to set the instance variable artist
		* @param ar the name of the artist*/
	public void setArtist(String ar)
	{
		artist = ar;
	}
	
	/** modifier method to set the instance variable songLength
		* @param length the name of the album in length*/
	public void setLength(int length)
	{
		songLength = length;
	}
	
	/** accessor method to get the instance variable title
		* @return return the title of the song*/
	public String getTitle()
	{
		return title;
	}
	
	/** accessor method to get the instance variable album
		* @return return the name of the album*/
	public String getAlbum()
	{
		return album;
	}
	
	/** accessor method to get the instance variable artist
		* @return return the name of the artist*/
	public String getArtist()
	{
		return artist;
	}
	
	/** accessor method to get the instance variable songLength
		* @return return the length of the song*/
	public int getLength()
	{
		return songLength;
	}
	
	/** equals method to determine if two songs are equal
		* @param obj which is a reference to the song object to be compared
		* @return return true or false if the song is equal*/
	public boolean equals(Object obj)
	{
		// leave this here
		// check equality using the s reference
		Song s = (Song) obj;
		boolean sameTitle = (s.title.equals(title));
		boolean sameAlbum = (s.album.equals(album));
		boolean sameArtist = (s.artist.equals(artist));
		boolean sameLength = (s.songLength == songLength);
		return sameTitle && sameAlbum && sameArtist && sameLength;
	}
	
	/** toString() method to get the instance variables
		* @return return a String containing the instance variablees*/
	public String toString()
	{
		return "Title: " + title + ". Album: " + album + ". Artist: " + artist + ". Length: " + songLength + ".";
	}
}