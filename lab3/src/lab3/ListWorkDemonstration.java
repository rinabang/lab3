package lab3;
import java.util.InputMismatchException;
import java.util.Scanner;
/** 
 * Класс вывода таблицы с временем работы.
 * @author Суховеркова Екатерина (3 курс 3 группа)
*/
public class ListWorkDemonstration {
	public static void main(String[] args) {
		String f = "a";
		do
		{
			var in = new Scanner(System.in);
	        System.out.println("Введите количество вызовов методов:");
	        var n = 0;
	        
	        try {
	            n = in.nextInt();
	        } catch (InputMismatchException ex) {
	            System.out.println("Ошибка ввода.");
	        }
	        
	        ArrayListWork arrayList = new ArrayListWork(n); // @value arrayList - создание нового объекта типа ArrayListWork
	        LinkedListWork linkedList = new LinkedListWork(); // @value linkedList - создание нового объекта типа LinkedListWork
	        PrintResult.header();
	        PrintResult.resultArrayList(n, arrayList);
	        System.out.println();
	        PrintResult.resultLinkedList(n, linkedList);
	        
	        System.out.println("\nПродолжить - a, выйти - q.");
			Scanner in2 = new Scanner(System.in);
			f = in2.nextLine();
		} while (f.equals("a"));
	}
}
