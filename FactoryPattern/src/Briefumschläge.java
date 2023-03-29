public abstract class Briefumschläge {

    protected String _size;
    protected String _weight;

    public Briefumschläge(String size, String weight){
        this._size = size;
        this._weight = weight;
    }


    public String toString(){
        return this._size + " " + this._weight + " ";
    };


}