public class Music {
    private String title;
    private Artist artist;
    private String duration;
    private String genre;
    private String albumName;
    private Date releaseDate;
    Music(String title, Artist artist, String duration, String genre, String albumName, Date releaseDate){
        this.title = title;
        this.artist = artist;
        this.albumName = albumName;
        this.duration = duration;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }
    public String toString(){
        String musicDetail = String.format("%-10s%-15s%-15s%-10s%-10s%-10s",artist,title,duration,genre,albumName,releaseDate);
        return musicDetail;
    }
    public boolean equals(Object o) {
        Music song = (Music) o;
        if (song.getArtist().getName().equals(this.artist.getName()) && song.getTitle().equals(this.title))
        {
            return true;
        }
        else
            return false;
    }


}
