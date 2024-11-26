package composite;
public class Main {
    public static void main(String[] args) {
        FileFolha file1 = new FileFolha("file1.txt");
        FileFolha file2 = new FileFolha("file2.txt");

        FolderComposto folder1 = new FolderComposto("Documents");
        folder1.add(file1);
        folder1.add(file2);

        FolderComposto root = new FolderComposto("Root");
        root.add(folder1);

        root.display();
    }
}
