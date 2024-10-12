package Iterator;

public class Client {
    public static void main(String[] args){
        String[] names = {"Alex", "Bob", "Cathy", "David", "Eva", "Zoyie"};
        IterableCollection<String> namesCollection = new NameCollection(names);
        Iterator<String> namesIterator = namesCollection.createIterator();

        while(namesIterator.hasNext()){
          String name =  namesIterator.next();
          System.out.println(name);
        }
    }
}
