/**
 * @(#)ReadWrite_2DarrayFromFile_UnknownRowCol.java
 *
 * ReadWrite_2DarrayFromFile_UnknownRowCol application
 *
 * @author
 * @version 1.00 2015/10/21
 */
//
import java.util.*;
import java.lang.*;
import java.io.*;

public class 矩陣Aplus2 {

    public static void main(String[] args) throws java.io.FileNotFoundException, IOException {

        Scanner in = new Scanner(new File("D:\\JavaProgramming\\N20M20Max10_A.txt"));
        //Scanner in = new Scanner(new File("D:\\JavaProgramming\\N20M20Max10_B.txt"));


        /*
         * Output 2D array (Matrix) to File
         */

        FileWriter fw =new FileWriter("D:\\JavaProgramming\\C_108021002_AddConstant.txt");
        BufferedWriter bfw=new BufferedWriter(fw);

        int nbRow = 0;
        // read the file to get number of lines
        while(in.hasNextLine()) {
            ++nbRow;
            in.nextLine();
        }
        in.close();

        System.out.println("The number of row:"+nbRow);
        // now build an int array based on the number of row
        int[][] number = new int[nbRow][];
        int[][] number_Change = new int[nbRow][];

        in = new Scanner(new File("D:\\JavaProgramming\\N20M20Max10_A.txt"));
        for(int i = 0; i < nbRow; ++i) {
            // read each line
            String line = in.nextLine();

            System.out.println(i+"=>"+line);
            // split it on " "
            String[] token = line.split(" ");
            // add the columns to each row
            number[i] = new int[token.length];
            number_Change[i] = new int[token.length];
            // translate to int each token
            for(int j = 0; j < token.length; ++j) {
                number[i][j] = Integer.parseInt(token[j]);
                number_Change[i][j] = number[i][j] +2;
                bfw.write(Integer.toString(number_Change[i][j])+" ");  // 寫入到緩衝區
                System.out.print(number_Change[i][j]+" ");
            }
            bfw.newLine(); // 寫矩陣Aplus2入換行符號
            System.out.println();
        } // End of for(int i = 0; i < nbRow; ++i)
        in = new Scanner(new File("D:\\JavaProgramming\\N20M20Max10_A.txt"));
        for(int i = 0; i < nbRow; ++i) {
            // read each line
            String line = in.nextLine();

            System.out.println(i+"=>"+line);
            // split it on " "
            String[] token = line.split(" ");
            // add the columns to each row
            number[i] = new int[token.length];
            number_Change[i] = new int[token.length];
            // translate to int each token
            for(int j = 0; j < token.length; ++j) {
                number[i][j] = Integer.parseInt(token[j]);
                number_Change[i][j] = number[i][j] +2;
                bfw.write(Integer.toString(number_Change[i][j])+" ");  // 寫入到緩衝區
                System.out.print(number_Change[i][j]+" ");
            }
            bfw.newLine(); // 寫入換行符號
            System.out.println();
        } // End of for(int i = 0; i < nbRow; ++i)
        in.close();
        bfw.flush();      // 將緩衝區內的資料寫到檔案裡
        fw.close();       // 關閉檔案
    } // End of public static void main(String[] args)
} // End of public class Reading2DarrayFromFile_UnknownRowCol