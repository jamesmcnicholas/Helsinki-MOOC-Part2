public class CD implements ToBeStored{
    private String artist;
    private String title;
    private int year;
    private final double weight;

    public CD(String artist, String title, int publishingYear){
        this.artist=artist;
        this.title=title;
        this.year=publishingYear;
        this.weight=.1;
    }
    public double weight(){
        return this.weight;
    }

    @Override
    public String toString(){
        return this.artist+": "+this.title+" ("+this.year+")";
    }
}
