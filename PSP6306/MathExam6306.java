import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
public class MathExam306 {

	public static void main(String[] args) throws FileNotFoundException {		
		// TODO �Զ����ɵķ������
		int n;
		Scanner scanner = new Scanner(System.in);
		// �Ӽ��̽�������
		n = scanner.nextInt();
		 // ���յ����ݸ�ֵ��n
		String[] str = new String[n];
		File file = new File("out6306.txt");
		PrintStream ps = new PrintStream(file);
		System.setOut(ps);
		zzz(n,str);
	}
	public static void zzz(int n,String[] str) {
		int x;
		int y;
		for (int i = 0; i < n; i++) {
			int z = (int)(Math.random()*(2));
			
		if(z==0) {
			x = (int)(Math.random()*100);
			y = (int)(Math.random()*100);
			System.out.println("("+(i+1)+")" + "" + x + "+" + y + "" + "=" + "" );
			str[i] = "(" + (i+1) + ")" +" " + x + "+" + y + " " + "=" + " " + (x+y);}
		if(z==1) {
			x = (int)(Math.random()*100);
			y = (int)(Math.random()*100);
			System.out.println("("+(i+1)+")" + "" + x + "+" + y + "" + "=" + "" );
			str[i] = "(" + (i+1) + ")" +" " + x + "-2" + y + " " + "=" + " " + (x-y);
		}
		}
		System.out.println("��׼��");
		for(String s:str)
			System.out.println(s);

		
	}
		

		
		
}

