package lab3;
/** 
 * Класс для запуска методов и печати результата.
 * @author Суховеркова Екатерина (3 курс 3 группа)
*/
public class PrintResult {
    /**
     * Конструктор PrintResult
     */
    private PrintResult() {
    }
    /**
     * Печать шапки таблицы
     */
    public static void header() {
		System.out.println("Название метода                      Количество выполнений     Время выполнения");
		System.out.println("\n-------------------------------------------------------------------------------\n");
	}
    /**
     * Печать строк для ArrayList
     */
    public static void resultArrayList(int n, ArrayListWork arrayList) {
    	long count = 0; // Переменная для посчёта общего времени
    	/**
         * Печать времени и количества выполнения заполнения ArrayList
         */
    	System.out.print("Заполнение ArrayList                  1");
        for(int i = 0; i < 25; i++)
        	System.out.print(" ");
        System.out.println(arrayList.fillArrayList());
        /**
         * Печать времени и количества выполнения удаления из ArrayList
         */
        System.out.print("Удаление элементов из ArrayList       " + n);
        for(int i = 0; i < 22; i++)
        	System.out.print(" ");
        for(int i = n - 1; i >= 0; i--)
        	count += arrayList.delete(i);
        System.out.println(count);
        /**
         * Печать времени и количества выполнения добавления в ArrayList
         */
        count = 0;
        System.out.print("Добавление элементов в ArrayList      " + n);
        for(int i = 0; i < 22; i++)
        	System.out.print(" ");
        for(int i = 0; i < n; i++)
        	count += arrayList.add(i);
        System.out.println(count);
        /**
         * Печать времени и количества выполнения получения из ArrayList
         */
        count = 0;
        System.out.print("Получение элементов из ArrayList      " + n);
        for(int i = 0; i < 22; i++)
        	System.out.print(" ");
        for(int i = 0; i < n; i++)
        	count += arrayList.get(i);
        System.out.println(count);
    }
    /**
     * Печать строк для LinkedList
     */
    public static void resultLinkedList(int n, LinkedListWork linkedList) {
    	long count = 0; // Переменная для посчёта общего времени
    	/**
         * Печать времени и количества выполнения заполнения LinkedList
         */
    	System.out.print("Заполнение LinkedList                 1");
        for(int i = 0; i < 25; i++)
        	System.out.print(" ");
        System.out.println(linkedList.fillLinkedList(n));
        /**
         * Печать времени и количества выполнения удаления из LinkedList
         */
        System.out.print("Удаление элементов из LinkedList      " + n);
        for(int i = 0; i < 22; i++)
        	System.out.print(" ");
        for(int i = n - 1; i >= 0; i--)
        	count += linkedList.delete(i);
        System.out.println(count);
        /**
         * Печать времени и количества выполнения добавления в LinkedList
         */
        count = 0;
        System.out.print("Добавление элементов в LinkedList     " + n);
        for(int i = 0; i < 22; i++)
        	System.out.print(" ");
        for(int i = 0; i < n; i++)
        	count += linkedList.add(i);
        System.out.println(count);
        /**
         * Печать времени и количества выполнения получения из LinkedList
         */
        count = 0;
        System.out.print("Получение элементов из LinkedList     " + n);
        for(int i = 0; i < 22; i++)
        	System.out.print(" ");
        for(int i = 0; i < n; i++)
        	count += linkedList.get(i);
        System.out.println(count);
    }
}
