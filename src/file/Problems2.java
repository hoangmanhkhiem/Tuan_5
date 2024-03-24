package file;
import java.io.File;
import java.io.FileNotFoundException;
public class Problems2 {
    private int count= 0;
    public Problems2(){
        String str = "K:\\";
        startScanning(str);
        System.out.println("Ban co "+count+ " virus");
    }

    public void startScanning(String dir){
        File f = new File(dir);
        System.out.println(f.getAbsolutePath());
        if(!f.isDirectory()){
            if(f.getName().endsWith(".exe") || f.getName().endsWith(".bat"))
                count++;
        }
        if(f.isDirectory()){
            File[] files = f.listFiles();
            for(File file:files){
                startScanning(file.getPath());
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
