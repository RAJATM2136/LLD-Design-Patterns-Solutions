package CompositeDesignPattern;

import java.util.*;

public class Directory implements FileSystem{
    String name;
    List<FileSystem> fileSystemList;
     Directory(String name){
       this.name = name;
        this.fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystem ){
         fileSystemList.add(fileSystem);
    }
    @Override
    public void list() {
        System.out.println("Directory: " + name);
        for (FileSystem fileSystem : fileSystemList) {
            fileSystem.list();
        }
    }
}
