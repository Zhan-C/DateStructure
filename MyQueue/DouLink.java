package MyQueue;

public class DouLink {
	private DouLinkNode head;

	public DouLink() {
		super();
		head = new DouLinkNode();
	}

	public void addRear(int n) {
		DouLinkNode ptr = head;
		while (ptr.hasNext()) {
			ptr = ptr.getNext();
		}
		DouLinkNode newP = new DouLinkNode(n);
		newP.pre = ptr;
		ptr.next = newP;
		head.setNum(head.getNum() + 1);
	}

	public void removeRear() {
		if (head.hasNext()) {
			DouLinkNode ptr = head;
			while (ptr.hasNext()) {
				ptr = ptr.getNext();
			}
			ptr.pre.next = null;
			ptr.pre = null;
			head.setNum(head.getNum() - 1);
		} else {
			return;
		}
	}

	public void addFront(int num) {
		if (head.hasNext()) {
			DouLinkNode newNode = new DouLinkNode(num);
			newNode.next = head.next;
			newNode.next.pre = newNode;
			head.next = newNode;
			newNode.pre = head;
			head.setNum(head.getNum() + 1);
		} else {
			DouLinkNode newNode = new DouLinkNode(num);
			newNode.pre = head;
			head.next = newNode;
			head.setNum(head.getNum() + 1);
		}

	}

	public void removeFront() {
		if (head.next == null) {
			return;
		} else if (head.next.next == null) {
			head.next.pre = null;
			head.next = null;
			head.setNum(head.getNum() - 1);
		} else {
			DouLinkNode ptr = head.next;
			ptr.next.pre = head;
			head.next = ptr.next;
			ptr.pre = null;
			ptr.next = null;
			head.setNum(head.getNum() - 1);
		}
	}

	public void show() {
		DouLinkNode ptr = head;
		System.out.print(ptr.getNum() + "个节点 <--> ");
		while (ptr.hasNext()) {
			ptr = ptr.next;
			System.out.print(ptr.getNum() + " <--> ");
		}
		System.out.print("null");
		System.out.println();
	}
}
