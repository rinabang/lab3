package lab3;
import java.util.LinkedList;
import java.util.List;
/** 
 * Класс, вызывающий основные методы коллекции LinkedList
 * @author Суховеркова Екатерина (3 курс 3 группа)
*/
public class LinkedListWork extends ListWork{
	/**
     * Конструктор LinkedList
     */
    public LinkedListWork() {
        list = new LinkedList<>();
    }
    /**
     * Метод заполнения LinkedList
     * @param count - количество элементов
     * @return возвращает время, необходимое для заполнения
     */
    public long fillLinkedList(int count) {
        var startTime = System.nanoTime();
        for(int i = 0; i < count; i++)
        	list.add(i);
        return System.nanoTime() - startTime;
    }
}
