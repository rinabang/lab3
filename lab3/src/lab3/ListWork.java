package lab3;
import java.util.List;
/** 
 * Основной класс, вызывающий основные методы List
 * @author Суховеркова Екатерина (3 курс 3 группа)
*/
public class ListWork {
	/** Поле list */
	public List<Integer> list;
	/**
     * Метод удаления элемента
     * @param index - индекс элемента для удаления
     * @return возвращает время, необходимое для удаления элемента
     */
	public long delete(int index) {
        var startTime = System.nanoTime();
        list.remove(index);
        return System.nanoTime() - startTime;
    }
	/**
     * Метод добавления элемента
     * @param index - индекс элемента для добавления
     * @return возвращает время, необходимое для добавления элемента
     */
	public long add(int index) {
        var startTime = System.nanoTime();
        list.add(index, 1);
        return System.nanoTime() - startTime;
    }
	/**
     * Метод получения элемента
     * @param index - индекс элемента для получения
     * @return возвращает время, необходимое для получения элемента
     */
	public long get(int index) {
        var startTime = System.nanoTime();
        int item = list.get(index);
        return System.nanoTime() - startTime;
    }
}