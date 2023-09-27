package patterns.compositePattern.fileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    private final String directoryName;
    private final List<FileSystem> fileSystems;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.fileSystems = new ArrayList<>();
    }

    public void addFileSystem(FileSystem fileSystem) {
        this.fileSystems.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println(this.directoryName);
        for (FileSystem fileSystem : fileSystems) {
            fileSystem.ls();
        }
    }
}
