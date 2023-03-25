package basic.dev;
import java.util.Scanner;
import java.util.Stack;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int count = stack.size();
        System.out.println("Số phần tử của stack: " + count);
    
        System.out.println("Nhập vị trí : ");
        int n =  sc.nextInt();
        int index = stack.size() - n;
        Integer d = stack.get(index);
        System.out.println("Nội dung là : " + d);
        int indexToRemove = 1;
        int removedElement = stack.remove(indexToRemove);
        System.out.println("Removed element at index " + indexToRemove + ": " + removedElement);
	}
}
	

