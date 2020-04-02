package MyQueue;

public class LinkNode {
	private int num;
	private LinkNode next;

	public LinkNode() {
		// TODO Auto-generated constructor stub
		this.num = 0;
		next = null;
	}

	public LinkNode(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
		next = null;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public boolean hasNext() {
		if (this.next != null) {
			return true;
		} else {
			return false;
		}
	}

	public LinkNode getNext() {
		LinkNode ptr = this.next;
		return ptr;
	}

	public void setNext(LinkNode next) {
		this.next = next;
	}
}
