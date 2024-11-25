package CompositeDesignPattern;

public class File implements FileSystem{
    String name;
    File(String name){
        this.name=name;
    }
    @Override
    public void list() {
        System.out.println("File is"+name);
    }
}
