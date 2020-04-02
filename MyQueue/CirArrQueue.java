package MyQueue;

import java.util.Arrays;

public class CirArrQueue {
		private int maxSize;
		private int front;
		private int rear;
		private int[] arr;
		public CirArrQueue(int maxSize) {
			this.maxSize = maxSize;
			arr=new int[maxSize];
			front=0;
			rear=0;
		}
		public boolean isFull() {
			if((rear+1)%maxSize==front)
				return true;
			else {
				return false;
			}
		}
		public boolean isEmpty() {
			if(rear==front)
				return true;
			else {
				return false;
			}
		}
		public int add(int num) {
			if(this.isFull()){
				return -1;
			}
			else {
				arr[rear]=num;
				rear++;
				rear=rear%maxSize;
				return 1;
			}
		}
		public int pop() {
			if(this.isEmpty()){
				return -1;
			}else {
				int num=arr[front];
				arr[front]=0;
				front++;
				front=front%maxSize;
				return num;
			}
		}
		@Override
		public String toString() {
			return "CirArrQueue [maxSize=" + maxSize + ", front=" + front + ", rear=" + rear + ", arr="
					+ Arrays.toString(arr) + "]";
		}
		public void show() {
			if(this.isEmpty()){
				System.out.println("该数组是空的");
			}else {
				if(rear>front){
					for (int i = front; i < rear; i++) {
						System.err.print(arr[i]+" ");
					}
				}else {
					for (int i = front; i < arr.length; i++) {
						System.err.print(arr[i]+" ");
					}
					for (int i = 0; i < rear; i++) {
						System.err.println(arr[i]+" ");
					}
				}
			System.err.println();	
			}
			
		}
		public int size() {
			return ((rear+maxSize)-front)%maxSize;
			
		}
		
}
