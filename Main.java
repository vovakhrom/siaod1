import java.util.LinkedHashSet;
import java.util.Random;
public class Main {
	 public static void main(String[] args){
	        //������ ��� ��������� ��������� �����
	        Random rand = new Random();
	        //LinkedHashSet ��� ���������� ���������� ������. ����� ��������� ������� �������
	        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
	        //������� ���� ������� �������� ������ ������
	        BinTree tree = new BinTree();


	        //������� 1000 ������ � ������ �� �� ���������
	        for (int i = 0; i < 100; i++)
	            set.add(rand.nextInt(10));
	        //���������� �� ��������� � ������ ��� ������� ��������� � ������ ��������� ������
	        System.out.println("������� ������� ��������� � �������� ������ ������: ");
	        for (Integer it : set){
	            System.out.print(it + " ");
	            tree.insert(it);
	        }
	        System.out.println();

	        //������ ��������
	        tree.doThreading();

	        System.out.println("������ �� ��������� ������ � ������ �������:");
	        tree.doTraversing();

	        //������ ������� ��������� � �������� ������
	        tree.insertToThreadedBinaryTree(-1);
	        tree.insertToThreadedBinaryTree(-500);
	        tree.insertToThreadedBinaryTree(20);
	        tree.insertToThreadedBinaryTree(999);
	        tree.insertToThreadedBinaryTree(15);
	        tree.insertToThreadedBinaryTree(30);
	        tree.insertToThreadedBinaryTree(-45);

	        System.out.println("������ �� ��������� ������ � ������ ������� ����� �������:");
	        tree.doTraversing();

	        //������� �������� ������ �������� ����������� ���������
	        int K = set.size() / 2;
	        for (Integer it : set){
	            tree.deleteFromThreadedBinaryTree(it);
	            K--;
	            if (K == 0) break;
	        }

	        System.out.println("������ �� ��������� ������ � ������ ������� ����� ��������:");
	        tree.doTraversing();
	    }
}
