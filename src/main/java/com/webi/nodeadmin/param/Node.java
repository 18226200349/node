package com.webi.nodeadmin.param;

/**
 * Title: Node<br>
 * Description: Node<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年03月30日 17:30
 *
 * @author Administrator
 */
public class Node {
     int data;
     Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
    }
}
