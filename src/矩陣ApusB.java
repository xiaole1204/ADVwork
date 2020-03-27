import java.util.*;
import java.lang.*;
import java.io.*;

public class 矩陣ApusB {

    public static void main(String[] args) throws java.io.FileNotFoundException, IOException {

        Scanner in = new Scanner(new File("D:\\JavaProgramming\\N20M20Max10_A.txt"));
        Scanner ln = new Scanner(new File("D:\\JavaProgramming\\N20M20Max10_B.txt"));


        /*
         * Output 2D array (Matrix) to File
         */

        FileWriter fw =new FileWriter("D:\\JavaProgramming\\C_108021002_add.txt");
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

        //int[][] number = new int[nbRow][];
        //int[][] number_Change = new int[nbRow][];

        in = new Scanner(new File("D:\\JavaProgramming\\N20M20Max10_A.txt"));
        ln = new Scanner(new File("D:\\JavaProgramming\\N20M20Max10_B.txt"));
        for(int i = 0; i < nbRow; ++i) {
            // read each line
            String line = in.nextLine();
            String[] token=line.split(" ");
            String line2=ln.nextLine();
            String[] token2 = line2.split(" ");
            a[i]=new int[token.length];
            b[i]=new int[token2.length];
            c[i]=new int[token.length];
            for (int j =0;j<token.length;++j) {
                a[i][j]= Integer.parseInt(token[j]);
                b[i][j]=Integer.parseInt(token2[j]);
                c[i][j]=Integer.parseInt(token[j]);
                c[i][j]=a[i][j]+b[i][j];
                bfw.write(Integer.toString(c[i][j])+" ");
                System.out.print(c[i][j]+" ");
            }
            bfw.newLine(); // 寫入換行符號
            System.out.println();
        } // End of for(int i = 0; i < nbRow; ++i)
        in.close();
        bfw.flush();      // 將緩衝區內的資料寫到檔案裡
        fw.close();       // 關閉檔案
    } // End of public static void main(String[] args)
} // End of public class Reading2DarrayFromFile_UnknownRowCol