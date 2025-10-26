import java.io.RandomAccessFile;

public class RAF2Demo {
    public static void main(String[] args) throws Exception{
        RandomAccessFile raf = new RandomAccessFile("src/Data.txt", "rw");
        // A, B, C, D, E, F, G, H, I, J

        System.out.println((char)raf.read()); // A
        System.out.println((char)raf.read()); // B
        System.out.println((char)raf.read()); // C
        raf.write('d');                    // Changes D to d
        System.out.println((char)raf.read()); // E
        raf.skipBytes(3); // Skips F, G, H
        System.out.println((char)raf.read()); // I
        raf.seek(3); // Go Back to Index 3 that is at d
        System.out.println((char)raf.read()); // d
        System.out.println(raf.getFilePointer()); // Current Pointer Location - 4
        raf.seek(raf.getFilePointer() + 2); // 4 + 2 = 6 i.e G
        System.out.println((char)raf.read()); // G
    }
}
