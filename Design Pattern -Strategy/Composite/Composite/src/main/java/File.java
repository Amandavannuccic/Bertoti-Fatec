public class File implements FileSystemComponent{
    private String name;
    private Double size;

    public File(String name, Double size){
        this.name = name;
        this.size = size;
    }
    @Override
    public void showDetails() {
        System.out.println(String.format("File name: %s.\nFile size: %s.\n", name, size));
    }
}
