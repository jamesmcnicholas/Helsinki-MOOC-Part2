public class Book implements ToBeStored{
    private String name;
    private String writer;
    private double weight;
    public Book(String writer, String name, double weight){
        this.name = name;
        this.weight = weight;
        this.writer = writer;
    }
    public double weight(){
        return this.weight;
    }
    @Override
    public String toString(){
        return this.writer+": "+this.name;
    }
}
