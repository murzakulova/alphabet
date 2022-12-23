import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("Text.txt");
        fileWriter.write("1.Aa, 2.Bb, 3.Cc, 4.Dd, 5.Ee, \n 6.Ff, 7.Gg, 8.Hh, 9.Ii, 10.Jj, 11.Kk, \n 12.Ll, 13.Mm, 14.Nn, 15.Oo, 16.Pp, \n 17.Qq, 18.Rr, 19.Ss, 20.Tt, 21.Uu, \n 22.Vv, 23.Ww, 24.Xx, 25.Yy, 26.Zz ");
        fileWriter.close();
    }
}