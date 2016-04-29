package com.cn.sz.collection.linkList;

/**
 * linkList-链表:自定义链表-加深对LinkList的理解
 * 
 * @author HuWeiLiang
 *
 */
public class MyLinkList {
	private Node first;
	private Node last;
	private int size;

	public MyLinkList() {

	}

	/**
	 * size method
	 * 
	 * @return
	 */
	public int size() {
		return size;
	}

	/**
	 * add(Object obj) method
	 * 
	 * @param obj
	 */
	public void add(Object obj) {
		Node addNode = new Node();
		addNode.setObj(obj);
		addNode.setNext(null);
		addNode.setProvious(null);
		if (first == null) {
			first = addNode;
		} else {
			addNode.setProvious(last);
			last.setNext(addNode);
		}
		last = addNode;
		size++;
	}

	/**
	 * add(int index,Object obj) method
	 * @param index
	 * @param obj
	 */
	public void add(int index, Object obj) {
		Node addNode = new Node();
		addNode.setObj(obj);
		addNode.setNext(null);
		addNode.setProvious(null);
		if (first == null) {
			first = addNode;
		} else {
			Node fNode = first;
			for (int i = 0; i <index; i++) {
				fNode = fNode.getNext();
			}
			Node upNode = fNode.getProvious();
			Node downNode = fNode.getNext();
			if (upNode == null) {
				fNode.setProvious(addNode);
				addNode.setNext(fNode);
				addNode.setProvious(null);
				first = addNode;
			} else {
				 addNode.setProvious(upNode);
				 upNode.setNext(addNode);
	             addNode.setNext(fNode);
			}
		}
		last = addNode;
		size++;
	}

	/**
	 * get(int index) method
	 * 
	 * @param index
	 * @return
	 */
	public Object get(int index) {
		rangeCheck(index);
		Node fNode = null;
		if (null != first) {
			fNode = first;
			for (int i = 0; i < index; i++) {
				fNode = fNode.getNext();
			}
		}

		return fNode.getObj();
	}

	/**
	 * remove(int index) method
	 * 
	 * @param index
	 */
	public void remove(int index) {
		rangeCheck(index);
		Node fNode = null;
		if (null != first) {
			fNode = first;
			for (int i = 0; i < index; i++) {
				fNode = fNode.getNext();
			}
			doRemove(fNode);
		}
	}

	/**
	 * remove(Object obj) method
	 * 
	 * @param obj
	 */
	public void remove(Object obj) {
		Node fNode = null;
		if (null != first) {
			fNode = first;
			for (int i = 0; i < size; i++) {
				if (fNode.getObj().equals(obj)) {
					break;
				} else {
					fNode = fNode.getNext();
				}
			}

			doRemove(fNode);

		}
	}

	/**
	 * doRemove(Node fNode) method
	 * 
	 * @param fNode
	 */
	private void doRemove(Node fNode) {
		if (null != fNode) {
			Node upNode = fNode.getProvious();
			Node downNode = fNode.getNext();
			if (upNode == null) {
				downNode.setProvious(null);
				first = downNode;
			} else if (downNode == null) {
				upNode.setNext(null);
			} else {
				upNode.setNext(downNode);
				downNode.setProvious(upNode);
			}
			size--;
		}
	}

	/**
	 * 范围检测
	 * 
	 * @param index
	 */
	private void rangeCheck(int index) {
		if (index < 0 || index >= size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
