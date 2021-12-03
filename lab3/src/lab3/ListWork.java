package lab3;
import java.util.List;
/** 
 * �������� �����, ���������� �������� ������ List
 * @author ����������� ��������� (3 ���� 3 ������)
*/
public class ListWork {
	/** ���� list */
	public List<Integer> list;
	/**
     * ����� �������� ��������
     * @param index - ������ �������� ��� ��������
     * @return ���������� �����, ����������� ��� �������� ��������
     */
	public long delete(int index) {
        var startTime = System.nanoTime();
        list.remove(index);
        return System.nanoTime() - startTime;
    }
	/**
     * ����� ���������� ��������
     * @param index - ������ �������� ��� ����������
     * @return ���������� �����, ����������� ��� ���������� ��������
     */
	public long add(int index) {
        var startTime = System.nanoTime();
        list.add(index, 1);
        return System.nanoTime() - startTime;
    }
	/**
     * ����� ��������� ��������
     * @param index - ������ �������� ��� ���������
     * @return ���������� �����, ����������� ��� ��������� ��������
     */
	public long get(int index) {
        var startTime = System.nanoTime();
        int item = list.get(index);
        return System.nanoTime() - startTime;
    }
}