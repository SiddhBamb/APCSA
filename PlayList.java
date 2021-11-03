import java.util.Arrays;

public class PlayList
{
	/** Song[] array list instance variable*/
	private Song[] list;
	
	/** default constructor used to set the instance variables to default values*/
	public PlayList()
	{
		// I would recommend setting the length to 1
		list = new Song[1];
		// Then make sure you add 1 song to the list in index 0
		Song song = new Song();
		list[0] = song;
	}
	
	/** initialization constructor used to set the instance variables
		* @param x the length of the playlist */
	public PlayList(int x)
	{
		// this should set the length of the playlist
		list = new Song[x];
	}
	
	/** modifier method to set the instance variable list
		* @param x the length of the playlist*/
	public void setList(int x)
	{
		// this should set the length of the playlist
		list = new Song[x];
	}
	
	/** accessor method to get the entire playlist
		* @return return the entire playslist as a Song[] array*/
	public Song[] getList()
	{
		return list;
	}
	
	/** method to add a song to the playlist
		* @param x the position in the playlist to add the song
		* @param s the song to add to the playlist*/
	public void addSong(int x, Song s)
	{
		/* you need to check to make sure the array is big enough to add the song
		   if it is not big enough you will need to create a large enough array
			   and then transfer the songs to the new array before assigning the new
			   array back to the list array*/
			if(x > list.length - 1)
			{
				Song[] newList = new Song[x+1];
				for(int i = 0; i < list.length; i++)
				{
					newList[i] = list[i];
				}
				list = newList;
				list[x] = s;
			} else
			{
				list[x] = s;
			}
			
	}
	
	/** method to get a song from the playlist
		* @param x the position in the playlist to get the song from
		* @return return the song in the position specified*/
	public Song getSong(int x)
	{
		return list[x];
	}
	
	/** method to get the number of songs in the playlist
		* @return return the number of songs in the playlist*/
	public int numSongs()
	{
		return list.length;
	}
	
	/** method to get the total length of the playlist specified in seconds
		* @return return the length of the playlist in seconds*/
	public int totalLength()
	{
		/* before accessing the length of an individual song you should ensure that the 
				song reference is not null*/
		int sum = 0;
		for(int i = 0; i < list.length; i++)
		{
				if(list[i] != null)
				{
					sum += list[i].getLength();
				}
		}
		return sum;
	}
	
	/** method to remove any songs from the specified artist
		* @param ar the artist of the songs to remove from the playlist*/
	public void removeArtist(String ar)
	{
		/* to remove the songs with the specified artist you will first need to count the
				occurances of that artist. 
				Then you will need to create a new smaller array
				Then you can copy the songs to the new array excluding the ones from the artist*/
		int sum = 0;
		for(int i = 0; i < list.length; i++)
		{
			if(list[i] != null)
			{
				if(list[i].getArtist().equals(ar))
				{
					sum++;
				}
			}
		}
		//System.out.println(sum + " TESTING" );
		//int temp = list.length;
		/*Song[] tempList = new Song[temp];
		for(int i = 0; i < temp; i++)
		{
			tempList[i] = list[i];
		}*/
		
		Song[] newList = new Song[list.length - sum];
		int j = 0;
		for(int i = 0; i < list.length; i++)
		{
			if(list[i].getTitle() != null && (!(list[i].getArtist().equals(ar))))
			{
				newList[j] = list[i];
				//System.out.println("abcd");
				j++;
			}
			
		}
		
		/*
			for(int i = 0; i < list.length; i++)
		{
			if(list[i] != null)
			{
				if(!(list[i].getArtist().equals(ar)))
				{
					list[i] = tempList[i];
				}
			}
		} */
		
			list = newList;
	}
	
	/** method to remove any songs longer than the length specified
		* @param length length of songs to removed given in seconds*/
	public void removeLength(int length)
	{
		// same as method above with creating a smaller array
		int sum = 0;
		for(int i = 0; i < list.length; i++)
		{
			if(list[i] != null)
			{
				if(list[i].getLength() > length)
				{
					sum++;
				}
			}
		}
		
		//int temp = list.length;
		/*Song[] tempList = new Song[temp];
		for(int i = 0; i < temp; i++)
		{
			tempList[i] = list[i];
		}
		*/
		
		Song[] newList = new Song[list.length - sum];
		int j = 0;
		for(int i = 0; i < list.length/* && list[i] != null && (list[i].getLength() < length)*/; i++)
		{
			if(list[i] != null && (list[i].getLength() < length))
			{
				newList[j] = list[i];
				j++;
			}
		}
		
		/*
			for(int i = 0; i < list.length; i++)
		{
			if(list[i] != null)
			{
				if(!(list[i].getLength() > length))
				{
					list[i] = tempList[i];
				}
			}
		}*/
			list = newList;
	}
	
	/** method to shuffle the order of the playlist - use the card shuffling example from the arrays presentation to help*/
	public void shuffle()
	{
		// use the card shuffling example from the arrays presentation to help you with this
		int exchange = 0;
		Song temp = new Song();
		int n = list.length;
		for(int i = 0; i < n; i++)
		{
		  exchange = i+(int)(Math.random()*(n-i));
		  temp = list[i];
		  list[i] = list[exchange];
		  list[exchange] = temp;
		}
		
	}
	
	/** equals method to determine if two playlists are equal
	 * The base class for all classes instantiated into objects in Java is "Object"
		* @param obj the object to be compared
		* @return return true or false if the playlists are equal*/
	public boolean equals(Object obj)
	{
		PlayList pl = (PlayList)obj;
		if(!Arrays.equals(list, pl.getList()))
			return false;
		return true;
	}
	
	/** toString() method to get the instance variables
		* @return return a String containing the instance variablees*/
	public String toString()
	{
		return Arrays.toString(list);
	}
}