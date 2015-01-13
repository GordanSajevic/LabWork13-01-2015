
public class PriorityQueue {
	
	private Node head;
	private Node tail;
	
	public PriorityQueue()
	{
		this.head = head;
		this.tail = tail;
	}
	
	public void push(int value, int priority)
	{
		Node newNode = new Node(value, priority);
		if (head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			if (head.priority <= newNode.priority)
			{
				newNode.next = head;
				head = newNode;
				return;
			}
			else
			{
				tail.next = newNode;
				tail = newNode;
			}
		}
	}
	
	public int pop()
	{
		if (isEmpty() == true)
		{
			throw new NullPointerException("Queue is empty!");
		}
		if (head == tail)
		{
			tail = null;
		}
		int value = head.value;
		head = head.next;
		return value;
	}
	
	public int peek()
	{
		if (isEmpty() == true)
		{
			throw new NullPointerException("Queue is empty!");
		}
		return head.value;
	}
	
	public boolean isEmpty()
	{
		if (head == null)
		{
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		String str = "";
		Node current = head;
		while (current != null)
		{
			str += current.value + " ";
			current = current.next;
		}
		return str;
	}
	
	private class Node
	{
		private int value;
		private Node next;
		private int priority;
		
		public Node(int value, int priority)
		{
			this.value = value;
			this.priority = priority;
			this.next = null;
		}
		
		public Node(int value, int priority, Node next)
		{
			this.value = value;
			this.priority = priority;
			this.next = next;
		}
	}

}
