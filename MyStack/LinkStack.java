package MyStack;

public class LinkStack {
	private StackNode head;
	private int count;

	public LinkStack() {
		super();
	}

	public void push(int num) {
		if (head == null) {
			head = new StackNode(num);
			count++;
		} else {
			StackNode newNode = new StackNode(num);
			newNode.setNext(head);
			head = newNode;

			count++;
		}
	}

	public int pop() {
		if (head == null) {
			System.out.println("空栈");
			return -1;
		} else {
			StackNode ptr = head;
			head = head.getNext();
			ptr.setNext(null);
			count--;
			return ptr.getNum();
		}
	}

	public int size() {
		return count;
	}

	public void show() {
		if (head != null) {
			StackNode ptr = head;
			System.out.println(ptr.getNum());
			while (ptr.getNext() != null) {
				ptr = ptr.getNext();
				System.out.println(ptr.getNum());
			}
			System.out.println("栈底");
		} else {
			System.out.println("无节点");
		}
	}
}
