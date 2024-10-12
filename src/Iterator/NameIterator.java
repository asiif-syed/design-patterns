package Iterator;

public class NameIterator implements Iterator<String>{
    private String[] names;
    private int position = 0;

    public NameIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return this.position < names.length;
    }

    @Override
    public String next() {
        if(this.hasNext()){
            return names[position++];
        }
        return null;
    }
}
