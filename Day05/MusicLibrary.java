
import java.util.ArrayList;
import java.util.Random;

class MusicLibrary{
    static ArrayList<String> collections = new ArrayList<>();
    
    public static void addMusic(String music){
        collections.add(music);
    }

    public static void getMusic(){
        if (collections.size()==0) {
            System.out.println("Music collection is empty.");
        }else{
           Random random = new Random();
            int ran = random.nextInt(collections.size());
            for(int i=0;i<collections.size();i++){
                if(ran==i){
                    System.out.println("Music : "+collections.get(i));
                }
            }
        }
    }


    public static void removeMusic(String music){
        if(collections.remove(music)){}
        else{
            System.out.println("Music not Found !!");
        }
    }

    public static void main(String[] args) {
        addMusic("bhojpuri");
        addMusic("hindi");
        addMusic("90's song");
        removeMusic("hindi");
        getMusic();
    }
}