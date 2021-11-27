package lab3;
import java.util.InputMismatchException;
import java.util.Scanner;
/** 
 * ����� ������ ������� � �������� ������.
 * @author ����������� ��������� (3 ���� 3 ������)
*/
public class ListWorkDemonstration {
	public static void main(String[] args) {
		String f = "a";
		do
		{
			var in = new Scanner(System.in);
	        System.out.println("������� ���������� ������� �������:");
	        var n = 0;
	        
	        try {
	            n = in.nextInt();
	        } catch (InputMismatchException ex) {
	            System.out.println("������ �����.");
	        }
	        
	        ArrayListWork arrayList = new ArrayListWork(n); // @value arrayList - �������� ������ ������� ���� ArrayListWork
	        LinkedListWork linkedList = new LinkedListWork(); // @value linkedList - �������� ������ ������� ���� LinkedListWork
	        PrintResult.header();
	        PrintResult.resultArrayList(n, arrayList);
	        System.out.println();
	        PrintResult.resultLinkedList(n, linkedList);
	        
	        System.out.println("\n���������� - a, ����� - q.");
			Scanner in2 = new Scanner(System.in);
			f = in2.nextLine();
		} while (f.equals("a"));
	}
}
