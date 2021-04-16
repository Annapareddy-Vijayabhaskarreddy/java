public class MusicCatalog {
    Node head;
    public void insertAtEnd(MusicList data){
        Node newNode = new Node(data);
        Node temp = null;
        if(head==null)
        {
            head = newNode;
            head.previous = null;
        }
        else{
            temp = head;
            
            while(temp.next!=null)
            {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.previous = temp;
            newNode.next = null;
        }
    }
    void sort(){
        Node current=head;
        Node index=null;
        String temp;
        String temp1;
        String temp2;
        String temp3;
        String temp4;
        int temp5;
        int temp6;

        while(current!=null){
            index=current.next;
            while(index!=null){
            if(current.music.getArtist().compareTo(index.music.getArtist())>0){
               
             temp=current.music.getArtist();
             current.music.setArtist(index.music.getArtist());
             index.music.setArtist(temp);

             temp1=current.music.getGenre();
             current.music.setGenre(index.music.getGenre());
             index.music.setGenre(temp1);

             temp2=current.music.getMusicItemName();
             current.music.setMusicItemName(index.music.getMusicItemName());
             index.music.setMusicItemName(temp2);

             temp3=current.music.getReleaseType();
             current.music.setReleaseType(index.music.getReleaseType());
             index.music.setReleaseType(temp3);

             temp4=current.music.getTotalPlayingTime();
             current.music.setTotalPlayingTime(index.music.getTotalPlayingTime());
             index.music.setTotalPlayingTime(temp4);

             temp5=current.music.getYearofRelease();
             current.music.setYearofRelease(index.music.getYearofRelease());
             index.music.setYearofRelease(temp5);

             temp6=current.music.getNumberofsongs();
             current.music.setNumberofsongs(index.music.getNumberofsongs());
             index.music.setNumberofsongs(temp6);
            }
            else if(current.music.getArtist().equals(index.music.getArtist())){
            if(current.music.getYearofRelease()>(index.music.getYearofRelease())){
                temp=current.music.getArtist();
             current.music.setArtist(index.music.getArtist());
             index.music.setArtist(temp);

             temp1=current.music.getGenre();
             current.music.setGenre(index.music.getGenre());
             index.music.setGenre(temp1);

             temp2=current.music.getMusicItemName();
             current.music.setMusicItemName(index.music.getMusicItemName());
             index.music.setMusicItemName(temp2);

             temp3=current.music.getReleaseType();
             current.music.setReleaseType(index.music.getReleaseType());
             index.music.setReleaseType(temp3);

             temp4=current.music.getTotalPlayingTime();
             current.music.setTotalPlayingTime(index.music.getTotalPlayingTime());
             index.music.setTotalPlayingTime(temp4);

             temp5=current.music.getYearofRelease();
             current.music.setYearofRelease(index.music.getYearofRelease());
             index.music.setYearofRelease(temp5);

             temp6=current.music.getNumberofsongs();
             current.music.setNumberofsongs(index.music.getNumberofsongs());
             index.music.setNumberofsongs(temp6);
            }
        }
            index=index.next;
            }
            current=current.next;
        }
    }
    
    public void ShowMusicCatalog(direction direction)
    {
        Node current = head;
        if(current == null)
            return;
        while(current!=null)
        {
            System.out.println(current.music+" ");
            System.out.println();
            current = current.next;
        }
    }
    public void ShowMusicCatalog1(direction direction)
    {
        Node current = head;
        if(current == null)
            return;
        while(current.next!=null)
        {
            current = current.next;
        }
        while(current!=null)
        {
            System.out.println(current.music+" ");
            System.out.println();
            current = current.previous;
        }
    }
	public void findartistalbum(String name) {
        Node current =head;    
        while(current!=null){    
            if(current.music.getArtist().equals(name)||current.music.getMusicItemName().equals(name)||current.music.getGenre().equals(name)){
                System.out.println(current.music.getArtist()+"  songname  "+current.music.getMusicItemName());  
    } 
           current=current.next; 
          
        } 
    }
}