package Iterator;

public class NameCollection implements IterableCollection<String>{
    private String[] names;

    public NameCollection(String[] names){
        this.names = names;
    }


    @Override
    public Iterator<String> createIterator() {
        return new NameIterator(this.names);
    }
}
