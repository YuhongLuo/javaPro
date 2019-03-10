package TestPackage;
import java.util.ArrayList;
import java.util.List;
public class Database {

private List<Song> songList;
   
   Database(){
      this.songList=new ArrayList<Song>();
   }
   Database(List<Song> songList){
      this.songList=songList;
   }

   public List<Song> getSongList() {
      return songList;
   }
   public Song getSongList(int index) {
      if(songList.size()>=index)
         return songList.get(index);
      else
         return null;
   }
   public void setSongList(List<Song> songList) {
      this.songList = songList;
   }
   
   public boolean isEmpty(){
      return this.songList.isEmpty();
   }
   public void addSong(Song song){
      songList.add(song);
   }
   public void removeSong(Song song){
      if(songList.contains(song)){
         songList.remove(song);
      }
   }
   public void removeSong(int index){
         songList.remove(index);
   }
   private void trace(String s){
      System.out.println(s);
   }
   public String toString(){   
      System.out.println("Song List:\n================");
      for(int i=0;i<songList.size();i++){
         trace(i+":\t"+songList.get(i).toString());
      }
      return "";
   }

   public void play(int index){
      System.out.println("Playing Song : "+ songList.get(index).toString());
      songList.get(index).play();
   }
   public void play(){
      for(int index=0;index<songList.size();index++)
         play(index);
   }

}