package lab3;
import java.util.ArrayList;
import java.util.List;
/** 
 * Класс, вызывающий основные методы коллекции ArrayList
 * @author Суховеркова Екатерина (3 курс 3 группа)
*/
public class ArrayListWork {
	/** Поле ArrayList */
	public List<Integer> arrayList;
	/** Поле размера arrayList */
    private int size;
    /**
     * Конструктор ArrayList
     * @param s - размер
     */
    public ArrayListWork(int s) {
        size = s;
        arrayList = new ArrayList<>(size);
    }
    /**
     * Метод заполнения ArrayList
     * @return возвращает время, необходимое для заполнения
     */
    public long fillArrayList() {
        var startTime = System.nanoTime();
        for (int i = 0; i < size; i++)
            arrayList.add(i);
        return System.nanoTime() - startTime;
    }
    /**
     * Метод удаления элемента для ArrayList
     * @param index - индекс элемента для удаления
     * @return возвращает время, необходимое для удаления элемента
     */
    public long delete(int index) {
        var startTime = System.nanoTime();
        arrayList.remove(index);
        return System.nanoTime() - startTime;
    }
    /**
     * Метод добавления элемента для ArrayList
     * @param index - индекс элемента для добавления
     * @return возвращает время, необходимое для добавления элемента
     */
    public long add(int index) {
        var startTime = System.nanoTime();
        arrayList.add(index, 1);
        return System.nanoTime() - startTime;
    }
    /**
     * Метод получения элемента для ArrayList
     * @param index - индекс элемента для получения
     * @return возвращает время, необходимое для получения элемента
     */
    public long get(int index) {
        var startTime = System.nanoTime();
        int item = arrayList.get(index);
        return System.nanoTime() - startTime;
    }
}
