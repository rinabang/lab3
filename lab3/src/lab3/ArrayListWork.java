package lab3;
import java.util.ArrayList;
import java.util.List;
/** 
 * �����, ���������� �������� ������ ��������� ArrayList
 * @author ����������� ��������� (3 ���� 3 ������)
*/
public class ArrayListWork {
	/** ���� ArrayList */
	public List<Integer> arrayList;
	/** ���� ������� arrayList */
    private int size;
    /**
     * ����������� ArrayList
     * @param s - ������
     */
    public ArrayListWork(int s) {
        size = s;
        arrayList = new ArrayList<>(size);
    }
    /**
     * ����� ���������� ArrayList
     * @return ���������� �����, ����������� ��� ����������
     */
    public long fillArrayList() {
        var startTime = System.nanoTime();
        for (int i = 0; i < size; i++)
            arrayList.add(i);
        return System.nanoTime() - startTime;
    }
    /**
     * ����� �������� �������� ��� ArrayList
     * @param index - ������ �������� ��� ��������
     * @return ���������� �����, ����������� ��� �������� ��������
     */
    public long delete(int index) {
        var startTime = System.nanoTime();
        arrayList.remove(index);
        return System.nanoTime() - startTime;
    }
    /**
     * ����� ���������� �������� ��� ArrayList
     * @param index - ������ �������� ��� ����������
     * @return ���������� �����, ����������� ��� ���������� ��������
     */
    public long add(int index) {
        var startTime = System.nanoTime();
        arrayList.add(index, 1);
        return System.nanoTime() - startTime;
    }
    /**
     * ����� ��������� �������� ��� ArrayList
     * @param index - ������ �������� ��� ���������
     * @return ���������� �����, ����������� ��� ��������� ��������
     */
    public long get(int index) {
        var startTime = System.nanoTime();
        int item = arrayList.get(index);
        return System.nanoTime() - startTime;
    }
}
