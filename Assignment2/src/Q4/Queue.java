package Q4;

public class Queue {
	private int size;
	private int[] arr;
	private int front, rear;
	
	
	public Queue(int size) {
		this.size = size;
		arr = new int[size];
		front = rear = 0;
	}
	
	public void push(int value) {
			arr[rear] = value;
			rear++;
	}
	
	public void pop() {
			front++;
	}
	
	public int peek() {
		return arr[front];
	}
	
	public boolean isEmpty() {
		return front>=rear;
	}
	
	public boolean isFull() {
		return rear == size;
	}
}
