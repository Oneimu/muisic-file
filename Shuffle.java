import java.util.ArrayList;
import java.util.Random;

public class Shuffle {
    private static ArrayList<String> music;

    public Shuffle(ArrayList<String> music_array){

        music = music_array;

    }

    public ArrayList<String> Songs(int time){
        String random_song = "";
        int len_song = music.size();
        // initialize the random method
        Random rand = new Random();
        int index;

        ArrayList<String> song = new ArrayList<String>();
        int len = 4;
        while (len <= time){
            index = rand.nextInt(len_song);
            random_song = music.get(index);
            song.add(random_song);

            // update the constraint
            len += 4;

        }

        return song;
    }
}

