import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// 2個分數加減乘除
public class test {
    public static void main(String[] args) throws IOException{
        String fileName = "C_108021002_Multplier.txt";
        FileReader fr = new FileReader("D:\\JavaProgramming\\N20M20Max10_A.txt");
        BufferedReader br = new BufferedReader(fr);

        String s;
        while ((s=br.readLine())!=null && s.length()>0){
            String[] tmp = s.split(",");
            tmp[2] = tmp[2].trim();
            int num1s=Integer.parseInt(tmp[0].trim());
            int num1p=Integer.parseInt(tmp[1].trim());
            int num2s=Integer.parseInt(tmp[3].trim());
            int num2p=Integer.parseInt(tmp[4].trim());
            System.out.print(num1s+"/"+num1p+" "+tmp[2]+" "+num2s+"/"+num2p+" = ");
            switch(tmp[2]){
                case "+":
                    System.out.println(plus(num1s,num1p,num2s,num2p));
                    break;
                case "-":
                    System.out.println(minus(num1s,num1p,num2s,num2p));
                    break;
                case "*":
                    System.out.println(mul(num1s,num1p,num2s,num2p));
                    break;
                case "/":
                    System.out.println(div(num1s,num1p,num2s,num2p));
                    break;
            }
        }

        fr.close();
    }

    // 加法
    public static String plus(int num1s, int num1p, int num2s, int num2p){
        int news = num1s*num2p+num1p*num2s;
        int newp = num1p*num2p;
        return simple(news, newp);
    }

    // 減法
    public static String minus(int num1s, int num1p, int num2s, int num2p){
        int news = num1s*num2p-num1p*num2s;
        int newp = num1p*num2p;
        return simple(news, newp);
    }

    // 乘法
    public static String mul(int num1s, int num1p, int num2s, int num2p){
        int news = num1s*num2s;
        int newp = num1p*num2p;
        return simple(news, newp);
    }

    // 除法
    public static String div(int num1s, int num1p, int num2s, int num2p){
        int news = num1s*num2p;
        int newp = num1p*num2s;
        return simple(news, newp);
    }
    // 約分
    public static String simple(int s,int p){
        if (s==p) return "1";
        if (s==0) return "0";
        for (int i=2; i<s; i++)
            if (s%i==0 && p%i==0){
                s/=i;
                p/=i;
            }
        return String.valueOf(s)+"/"+String.valueOf(p);
    }
}
