public class MusicList{
   String ReleaseType, Artist, MusicItemName, Genre;
   int YearofRelease;
   int Numberofsongs;
   String TotalPlayingTime;

   public String getReleaseType() {
       return ReleaseType;
   }

   public void setReleaseType(String releaseType) {
       ReleaseType = releaseType;
   }

   public String getArtist() {
       return Artist;
   }

   public void setArtist(String artist) {
       Artist = artist;
   }

   public String getMusicItemName() {
       return MusicItemName;
   }

   public void setMusicItemName(String musicItemName) {
       MusicItemName = musicItemName;
   }

   public String getGenre() {
       return Genre;
   }

   public void setGenre(String genre) {
       Genre = genre;
   }

 
   public String getTotalPlayingTime() {
       return TotalPlayingTime;
   }

   public void setTotalPlayingTime(String totalPlayingTime) {
       TotalPlayingTime = totalPlayingTime;
   }

   

   @Override
     public String toString() {
       return Artist + "  ,  "+ Genre+"  ,  "+ MusicItemName+"  ,  "+ Numberofsongs+"  ,   "+ReleaseType+"  ,   "+ TotalPlayingTime+"    ,   "+ YearofRelease;
   }


   public void setYearofRelease(int yearofRelease) {
       YearofRelease = yearofRelease;
   }

   public void setNumberofsongs(int numberofsongs) {
       Numberofsongs = numberofsongs;
   }

   public int getYearofRelease() {
       return YearofRelease;
   }

   public int getNumberofsongs() {
       return Numberofsongs;
   }


   
}