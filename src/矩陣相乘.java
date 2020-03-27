import java.util.*;
import java.lang.*;
import java.io.*;

public class 矩陣相乘 {

    public static void main(String[] args) throws java.io.FileNotFoundException, IOException {

        Scanner in = new Scanner(new File("D:\\JavaProgramming\\N20M20Max10_A.txt"));
        Scanner ln = new Scanner(new File("D:\\JavaProgramming\\N20M20Max10_B.txt"));

        FileWriter fw =new FileWriter("D:\\JavaProgramming\\C_108021002_Multplier.txt");
        BufferedWriter bfw=new BufferedWriter(fw);

        int nbRow = 0;
        // read the file to get number of lines
        while(in.hasNextLine()) {
            ++nbRow;
            in.nextLine();
        }
        in.close();
        int[][]a =new int[nbRow][];
        int[][]b =new int[nbRow][];
        int[][]c =new int[nbRow][];

        in = new Scanner(new File("D:\\JavaProgramming\\N20M20Max10_A.txt"));
        ln = new Scanner(new File("D:\\JavaProgramming\\N20M20Max10_B.txt"));
        for(int i = 0; i < nbRow; ++i) {
            String line = in.nextLine();
            String[] token = line.split(" ");
            String line2 = ln.nextLine();
            String[] token2 = line2.split(" ");
            a[i] = new int[token.length];
            b[i] = new int[token2.length];
            c[i] = new int[token.length];
            for (int j = 0; j < token.length; ++j) {
                a[i][j] = Integer.parseInt(token[j]);
                b[i][j] = Integer.parseInt(token2[j]);
            }

        }
            for (int i=0;i<nbRow;i++){
                for (int j=0;j<nbRow;j++){
                    for (int k =0;k<nbRow;k++){
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            for (int m=0;m<nbRow;m++){
                for (int n=0;n<nbRow;n++){
                    System.out.print(c[m][n]+"\t");
                    bfw.write(Integer.toString(c[m][n])+" ");
                }
                System.out.println();
            }
        bfw.newLine();
        System.out.println();
        in.close();
        bfw.flush();
        fw.close();
    }
}