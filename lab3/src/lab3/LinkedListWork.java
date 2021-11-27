package lab3;
import java.util.LinkedList;
import java.util.List;
/** 
 * �����, ���������� �������� ������ ��������� LinkedList
 * @author ����������� ��������� (3 ���� 3 ������)
*/
public class LinkedListWork {
	/** ���� LinkedList */
	public List<Integer> linkedList;
	/**
     * ����������� LinkedList
     */
    public LinkedListWork() {
        linkedList = new LinkedList<>();
    }
    /**
     * ����� ���������� LinkedList
     * @param count - ���������� ���������
     * @return ���������� �����, ����������� ��� ����������
     */
    public long fillLinkedList(int count) {
        var startTime = System.nanoTime();
        for(int i = 0; i < count; i++)
        	linkedList.add(i);
        return System.nanoTime() - startTime;
    }
    /**
     * ����� �������� �������� ��� LinkedList
     * @param index - ������ �������� ��� ��������
     * @return ���������� �����, ����������� ��� �������� ��������
     */
    public long delete(int index) {
        var startTime = System.nanoTime();
        linkedList.remove(index);
        return System.nanoTime() - startTime;
    }
    /**
     * ����� ���������� �������� ��� LinkedList
     * @param index - ������ �������� ��� ����������
     * @return ���������� �����, ����������� ��� ���������� ��������
     */
    public long add(int index) {
        var startTime = System.nanoTime();
        linkedList.add(index,1);
        return System.nanoTime() - startTime;
    }
    /**
     * ����� ��������� �������� ��� LinkedList
     * @param index - ������ �������� ��� ���������
     * @return ���������� �����, ����������� ��� ��������� ��������
     */
    public long get(int index) {
        var startTime = System.nanoTime();
        int item = linkedList.get(index);
        return System.nanoTime() - startTime;
    }
}
