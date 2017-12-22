import java.io.File;

class FileRead {
    public static void main(String[] args) {
        File dir = new File(".");
        for (File var : dir.listFiles()) {
            System.out.println(var);
        }
    }
}