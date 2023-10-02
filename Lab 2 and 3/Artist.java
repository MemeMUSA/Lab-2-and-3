public class Artist {
    private String name;
    private String nationality;
    private String rating;
    Artist(String name, String nationality, String rating){
        this.name = name;
        this.nationality = nationality;
        this.rating = rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }
    public String toString(){
        String artistDetail = String.format("%-10s%-10s%-10s",name,nationality,rating);
        return artistDetail;
    }
}
