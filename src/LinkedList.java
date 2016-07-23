class LinkedList {
	private Node head;
	private Node tail;

	public LinkedList() {
		head = null;
		tail = null;
	}

	public void insert(String s1, int a) {
		Node temp = new Node(s1, a);
		temp.next = head;
		head = temp;
	}

	public void insert_second(String s1, int a) {

		Node temp = new Node(s1, a);
		temp.next = head.next;
		head.next = temp;

	}

	public void insert_last(String s1, int a) {

		Node ptr = head;
		while (ptr.next != null) {
			ptr = ptr.next;
		}

		Node temp = new Node(s1, a);
		temp.next = null;
		ptr.next = temp;

	}

	public int addAges() {

		int res = 0;
		Node temp = head;
		while (temp != null) {

			res += temp.readage();
			temp = temp.next;
		}
		return res;
	}

	public boolean search(String s1) {

		Node temp = head;
		while (temp != null) {

			if (s1.equals(temp.readname())) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public int count(String s1) {

		int res = 0;
		Node temp = head;
		while (temp != null) {

			if (s1.equals(temp.readname())) {
				res++;
			}
			temp = temp.next;
		}
		return res;
	}

	public String delete_first() {
		if (head == null)
			return null;
		String res = head.readname();
		head = head.next;
		return res;
	}

	public void printlist() {
		Node temp = head;
		System.out.println("\nList:");
		System.out.print("HEAD->");
		while (temp != null) {
			temp.print();
			temp = temp.next;
		}

		System.out.print("NULL");

	}
}
