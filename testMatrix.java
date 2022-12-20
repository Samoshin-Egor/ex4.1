package ex4_1_4;
import java.io.FileWriter;
import java.io.IOException;
public class testMatrix {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("matrix.txt");

        Matrix a = new Matrix(4, 4);
        a.fillRandom();
        a.print("A (random filled matrix)");
        a.toFile(fw, "A (random filled matrix)");

        Matrix b = new Matrix(new double[][]{{1, 2, 1, 2}, {2, 1, 2, 1}, {1, 2, 1, 2}, {2, 1, 2, 1}});
        b.print("B (manually filled matrix)");
        b.toFile(fw, "B (manually filled matrix)");

        Matrix c = a.add(b);
        c.print("C = A + B");
        c.toFile(fw, "C = A + B");

        Matrix d = c.multiply(2);
        d.print("D = C * 2");
        d.toFile(fw, "D = C * 2");
        fw.close();
    }
}
