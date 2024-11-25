public class Main {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("file1.txt", 8.0);
        FileSystemComponent file2 = new File("file2.txt", 9.0);
        FileSystemComponent file3 = new File("file3.txt", 10.0);

        Directory directory1 = new Directory("Folder1");
        Directory directory2 = new Directory("Folder2");

        directory1.addComponent(file1);
        directory1.addComponent(file2);

        directory2.addComponent(file3);
        directory2.addComponent(directory1);

        directory2.showDetails();
    }
}
