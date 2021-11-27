package lab3;
/** 
 * ����� ��� ������� ������� � ������ ����������.
 * @author ����������� ��������� (3 ���� 3 ������)
*/
public class PrintResult {
    /**
     * ����������� PrintResult
     */
    private PrintResult() {
    }
    /**
     * ������ ����� �������
     */
    public static void header() {
		System.out.println("�������� ������                      ���������� ����������     ����� ����������");
		System.out.println("\n-------------------------------------------------------------------------------\n");
	}
    /**
     * ������ ����� ��� ArrayList
     */
    public static void resultArrayList(int n, ArrayListWork arrayList) {
    	long count = 0; // ���������� ��� ������� ������ �������
    	/**
         * ������ ������� � ���������� ���������� ���������� ArrayList
         */
    	System.out.print("���������� ArrayList                  1");
        for(int i = 0; i < 25; i++)
        	System.out.print(" ");
        System.out.println(arrayList.fillArrayList());
        /**
         * ������ ������� � ���������� ���������� �������� �� ArrayList
         */
        System.out.print("�������� ��������� �� ArrayList       " + n);
        for(int i = 0; i < 22; i++)
        	System.out.print(" ");
        for(int i = n - 1; i >= 0; i--)
        	count += arrayList.delete(i);
        System.out.println(count);
        /**
         * ������ ������� � ���������� ���������� ���������� � ArrayList
         */
        count = 0;
        System.out.print("���������� ��������� � ArrayList      " + n);
        for(int i = 0; i < 22; i++)
        	System.out.print(" ");
        for(int i = 0; i < n; i++)
        	count += arrayList.add(i);
        System.out.println(count);
        /**
         * ������ ������� � ���������� ���������� ��������� �� ArrayList
         */
        count = 0;
        System.out.print("��������� ��������� �� ArrayList      " + n);
        for(int i = 0; i < 22; i++)
        	System.out.print(" ");
        for(int i = 0; i < n; i++)
        	count += arrayList.get(i);
        System.out.println(count);
    }
    /**
     * ������ ����� ��� LinkedList
     */
    public static void resultLinkedList(int n, LinkedListWork linkedList) {
    	long count = 0; // ���������� ��� ������� ������ �������
    	/**
         * ������ ������� � ���������� ���������� ���������� LinkedList
         */
    	System.out.print("���������� LinkedList                 1");
        for(int i = 0; i < 25; i++)
        	System.out.print(" ");
        System.out.println(linkedList.fillLinkedList(n));
        /**
         * ������ ������� � ���������� ���������� �������� �� LinkedList
         */
        System.out.print("�������� ��������� �� LinkedList      " + n);
        for(int i = 0; i < 22; i++)
        	System.out.print(" ");
        for(int i = n - 1; i >= 0; i--)
        	count += linkedList.delete(i);
        System.out.println(count);
        /**
         * ������ ������� � ���������� ���������� ���������� � LinkedList
         */
        count = 0;
        System.out.print("���������� ��������� � LinkedList     " + n);
        for(int i = 0; i < 22; i++)
        	System.out.print(" ");
        for(int i = 0; i < n; i++)
        	count += linkedList.add(i);
        System.out.println(count);
        /**
         * ������ ������� � ���������� ���������� ��������� �� LinkedList
         */
        count = 0;
        System.out.print("��������� ��������� �� LinkedList     " + n);
        for(int i = 0; i < 22; i++)
        	System.out.print(" ");
        for(int i = 0; i < n; i++)
        	count += linkedList.get(i);
        System.out.println(count);
    }
}
