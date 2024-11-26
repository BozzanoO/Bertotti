package composite;

class FileFolha implements FileSystemComponent {
    private String name;

    public FileFolha(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("File: " + name);
    }
}
