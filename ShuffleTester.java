import java.util.ArrayList;

public class ShuffleTester {

    public static void main(String[] args){
        String[] music = {"Monkey Dance", "They Don't really care about us", "Believer", "Broken", "Jailer", "Fire On the Mountain", "Radioactive", "Time", "Fall", "Photograph"};
        ArrayList<String> music_array = new ArrayList<String>();

        for (int i = 0; i < music.length; i++){
            music_array.add(music[i]);
        }

        Shuffle shuffle = new  Shuffle(music_array);
        System.out.println(shuffle.Songs(12));
    }
}
