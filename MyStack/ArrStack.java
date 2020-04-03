package MyStack;

public class ArrStack {
	private int[] arr;
	private int top;

	public ArrStack(int num) {
		arr = new int[num];
		top = -1;
	}

	public int pop() {
		if (top == -1) {
			System.out.println("没有数据");
			return -1;
		} else {
			int temp = arr[top];
			arr[top] = 0;
			top--;
			return temp;
		}
	}

	public void push(int num) {
		if (top == arr.length - 1) {
			System.out.println("栈已经满了");
		} else {
			top++;
			arr[top] = num;
		}
	}

	public void show() {
		for (int i = top; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		System.out.println("栈底");
	}

	public int size() {
		return top + 1;
	}

}
