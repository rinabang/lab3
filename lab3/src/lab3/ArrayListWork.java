package lab3;
import java.util.ArrayList;
import java.util.List;
/** 
 * Класс, вызывающий основные методы коллекции ArrayList
 * @author Суховеркова Екатерина (3 курс 3 группа)
*/
public class ArrayListWork extends ListWork {
	/** Поле размера arrayList */
    private int size;
    /**
     * Конструктор ArrayList
     * @param s - размер
     */
    public ArrayListWork(int s) {
        size = s;
        list = new ArrayList<>(size);
    }
    /**
     * Метод заполнения ArrayList
     * @return возвращает время, необходимое для заполнения
     */
    public long fillArrayList() {
        var startTime = System.nanoTime();
        for (int i = 0; i < size; i++)
            list.add(i);
        return System.nanoTime() - startTime;
    }
}
