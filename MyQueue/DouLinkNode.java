package MyQueue;

public class DouLinkNode {
	private int num;
	DouLinkNode next;
	DouLinkNode pre;

	public DouLinkNode(int num) {
		super();
		this.num = num;
		pre = null;
		next = null;
	}

	public DouLinkNode() {
		super();
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public DouLinkNode getNext() {
		return next;
	}

	public void setNext(DouLinkNode next) {
		this.next = next;
	}

	public DouLinkNode getPre() {
		return pre;
	}

	public void setPre(DouLinkNode pre) {
		this.pre = pre;
	}

	public boolean hasNext() {
		if (next != null) {
			return true;
		} else {
			return false;
		}
	}

	public DouLinkNode goNext() {
		return next;
	}

	public boolean hasPre() {
		if (pre != null) {
			return true;
		} else {
			return false;
		}
	}

}
