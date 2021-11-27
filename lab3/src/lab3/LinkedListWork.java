package lab3;
import java.util.LinkedList;
import java.util.List;
/** 
 * Класс, вызывающий основные методы коллекции LinkedList
 * @author Суховеркова Екатерина (3 курс 3 группа)
*/
public class LinkedListWork {
	/** Поле LinkedList */
	public List<Integer> linkedList;
	/**
     * Конструктор LinkedList
     */
    public LinkedListWork() {
        linkedList = new LinkedList<>();
    }
    /**
     * Метод заполнения LinkedList
     * @param count - количество элементов
     * @return возвращает время, необходимое для заполнения
     */
    public long fillLinkedList(int count) {
        var startTime = System.nanoTime();
        for(int i = 0; i < count; i++)
        	linkedList.add(i);
        return System.nanoTime() - startTime;
    }
    /**
     * Метод удаления элемента для LinkedList
     * @param index - индекс элемента для удаления
     * @return возвращает время, необходимое для удаления элемента
     */
    public long delete(int index) {
        var startTime = System.nanoTime();
        linkedList.remove(index);
        return System.nanoTime() - startTime;
    }
    /**
     * Метод добавления элемента для LinkedList
     * @param index - индекс элемента для добавления
     * @return возвращает время, необходимое для добавления элемента
     */
    public long add(int index) {
        var startTime = System.nanoTime();
        linkedList.add(index,1);
        return System.nanoTime() - startTime;
    }
    /**
     * Метод получения элемента для LinkedList
     * @param index - индекс элемента для получения
     * @return возвращает время, необходимое для получения элемента
     */
    public long get(int index) {
        var startTime = System.nanoTime();
        int item = linkedList.get(index);
        return System.nanoTime() - startTime;
    }
}
