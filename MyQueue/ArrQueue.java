package MyQueue;

import java.util.Arrays;

public class ArrQueue {
	private int queueMaxSize;
	private int front;
	private int rear;
	private int[] arr;
	
	public ArrQueue(int queueMaxSize) {
		this.queueMaxSize = queueMaxSize;
		this.front=-1;
		this.rear=-1;
		arr=new int[queueMaxSize];
	
	}
	
	
/*
 * 这个方法的用途是检查队列是否满了
 */
	public boolean isFull() {
		if(this.rear==queueMaxSize)
			return true;
		else 
			return false;		
	}
	public boolean isEmpty() {
		if(this.rear==this.front)
			return true;
		else {
			return false;
		}
	}
/*
 *
 */
	public int size() {
		return rear-front;
	}
/*
 * 
 */
	public int add(int num) {
		if(isFull()){
			System.out.println("队列已经满了");
			return -1;
		}else {
			arr[rear+1]=num;
			rear++;
			return 1;
		}
	}
/*
 * 
 */
	public int pop() {
		if(this.front==this.rear){
				return -1;	
		}else {
			front++;
			int num=arr[front];
			arr[front]=0;
			return num;
		}
	}
	public void show() {
		if(this.isEmpty())
			System.out.println("该队列是空队列");
		else {
			for (int i = front+1; i <= rear; i++) {
				System.out.println(arr[i]);
			}
		}
	}


	@Override
	public String toString() {
		return "ArrQueue [queueMaxSize=" + queueMaxSize + ", front=" + front + ", rear=" + rear + ", arr="
				+ Arrays.toString(arr) + "]";
	}
	
}
