import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LeastSongPlayedRemove {

	public static void main(String[] args) {
		
		int totalSongSize = 0;
		List<Integer> song = new LinkedList<Integer>();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter array size on the songs");
		totalSongSize = scn.nextInt();

		while(true) {
			if(totalSongSize == 0) {
				break;
			}
			
			if(totalSongSize != song.size()) {
				System.out.println("Enetr song");
				song.add(scn.nextInt());
				System.out.println("Song list");
				System.out.println(song);
			}
			else {
				song.remove(0);
				System.out.println("Playlist is full so least played song will be removed");
				System.out.println("Enetr song");
				song.add(scn.nextInt());
				System.out.println(song);
				
			}
			
			
		}


	}

}
