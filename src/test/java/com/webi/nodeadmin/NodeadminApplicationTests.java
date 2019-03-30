package com.webi.nodeadmin;

import com.webi.nodeadmin.param.Node;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NodeadminApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Test
	public void  test(){
            //设置链表
			Node head=new Node(0);
			Node node1 = new Node(1);
			Node node2 = new Node(2);
			Node node3 = new Node(3);
			head.setNext(node1);
			node1.setNext(node2);
			node2.setNext(node3);
			Node h=head;
			while(h!=null){
				System.out.println(h.getData()+"###");
				h=h.getNext();
			}
			//递归反转
//			Node headTmp=reverse(head);
//		while (null != headTmp) {
//			System.out.print(headTmp.getData() + " ");
//			headTmp = headTmp.getNext();
//		}
		//循环反转
		Node headTmp2=reverse1(head);
		while(null!=headTmp2){
			System.out.print(headTmp2.getData()+" $ ");
			headTmp2=headTmp2.getNext();
		}
	}
    //循环遍历反转链表
	private Node reverse1(Node head) {
		if(head==null){
			return head;
		}
		Node pre=head;//头结点
		Node cur=head.getNext();//下一节点
		Node tmp;//临时节点
		while(cur!=null){
			//节点反转
            tmp=cur.getNext();
            cur.setNext(pre);
            //指针移动
			pre=cur;
			cur=tmp;
		}
		head.setNext(null);
		return  pre;
	}
    //递归反转链表
	private Node reverse(Node head) {
		if(head==null||head.getNext()==null){
			return  head;
		}
		Node reHead = reverse(head.getNext());// 先反转后续节点head.getNext()
		head.getNext().setNext(head);// 将当前结点的指针域指向前一结点
		head.setNext(null);// 前一结点的指针域令为null;
		return reHead;// 反转后新链表的头结点
	}

}
