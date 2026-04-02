import java.io.File;

public class ListFiles {
    static void listDir(File dir, String indent) {
        System.out.println(indent + "+-- " + dir.getName() + "/");
        File[] files = dir.listFiles();
        if (files == null) return;
        for (File f : files) {
            if (f.isDirectory()) listDir(f, indent + "    ");
            else System.out.println(indent + "    |-- " + f.getName()
                + "  (" + f.length() + " bytes)");
        }
    }

    public static void main(String[] args) {
        String path = args.length > 0 ? args[0] : ".";
        File dir = new File(path);
        if (dir.exists() && dir.isDirectory()) listDir(dir, "");
        else System.out.println("Invalid directory: " + path);
    }
}
