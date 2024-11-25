package CompositeDesignPattern;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file=new File("Hulchul");

        File file2=new File("Hulchul2");

        File file3=new File("bahubali");

        Directory fileSystem=new Directory("Comedymovies");
        fileSystem.add(file);
        fileSystem.add(file2);

        Directory fileSystem1=new Directory("Movie");
        fileSystem1.add(file3);
        fileSystem1.add(fileSystem);


        fileSystem1.list();


    }
}
