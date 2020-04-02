package MyQueue;

public class Link {
	private LinkNode head;
	private int count;

	public Link() {
		super();
		head = null;
	}

	public Link(int num) {
		head = new LinkNode(num);
		count++;
	}

	public boolean isEmpty() {
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int size() {
		return count;
	}

	public void addRear(int num) {
		if (count == 0) {
			head = new LinkNode(num);
			count++;
		} else {
			LinkNode ptr = head;
			while (ptr.hasNext()) {
				ptr = ptr.getNext();
			}
			LinkNode newNode = new LinkNode(num);
			ptr.setNext(newNode);
			count++;
		}
	}

	public int removeRear() {
		if (count == 0) {
			return -1;
		} else if (count == 1) {
			int temp = head.getNum();
			head = null;
			count--;
			return temp;
		} else {
			LinkNode arrNode = head;
			while (arrNode.getNext().getNext() != null) {
				arrNode = arrNode.getNext();
			}
			int temp = arrNode.getNext().getNum();
			arrNode.setNext(null);
			count--;
			return temp;
		}
	}

	public void addFront(int num) {
		if (count == 0) {
			head = new LinkNode(num);
			count++;
		} else {
			LinkNode newNode = new LinkNode(num);
			LinkNode tempNode = head;
			head = newNode;
			head.setNext(tempNode);
			count++;
		}
	}

	public int removeFront() {
		if (count == 0) {
			return -1;
		} else {
			int temp = head.getNum();
			LinkNode tempNode = head.getNext();
			head.setNext(null);
			head = tempNode;
			count--;
			return temp;
		}
	}

	public void remove(int num) {
		if (count == 0) {
			System.out.println("没有节点可以删除");
		} else if (head.getNum() == num) {
			LinkNode ptr = head.getNext();
			head = ptr;
			count--;
		} else {
			LinkNode ptr = head.getNext();
			LinkNode ptr2 = head;
			while (ptr.getNum() != num && ptr.hasNext()) {
				ptr2 = ptr;
				ptr = ptr.getNext();
			}
			if (ptr.getNum() == num) {
				ptr2.setNext(ptr.getNext());
				ptr = null;
				count--;
			}
		}
	}

	public void modify(int target, int num) {
		if (head == null) {
			System.out.println("无节点");
		} else {
			LinkNode ptr = head;
			while (ptr.getNum() != target && ptr.hasNext()) {
				ptr = ptr.getNext();
			}
			if (ptr.getNum() == target) {
				ptr.setNum(num);
			}
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (count == 0) {
			return "这个链表中没有存放节点";
		} else {
			LinkNode ptr = head;
			System.out.print(ptr.getNum() + " -> ");
			while (ptr.hasNext()) {
				ptr = ptr.getNext();
				System.out.print(ptr.getNum() + " -> ");
			}
			System.out.print("null");
			return "打印完毕";
		}
	}
}
