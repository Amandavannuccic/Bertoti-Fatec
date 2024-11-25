import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    String name;
    List<FileSystemComponent> fileSystemComponents = new ArrayList<>();

    public Directory(String name){
        this.name = name;
    }

    public void addComponent(FileSystemComponent component){
        fileSystemComponents.add(component);
        System.out.println("Component has been added.");
    }

    public void removeComponent(FileSystemComponent component){
        fileSystemComponents.remove(component);
        System.out.println("Component has been removed.");
    }

    @Override
    public void showDetails(){
        System.out.println("Directory name: "+name);
        for(FileSystemComponent component : fileSystemComponents){
            component.showDetails();
        }
    }
}
