package com.webi.nodeadmin;

import com.webi.nodeadmin.param.Node;
import com.webi.util.ReverseNodeUtil;
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
			Node headTmp=ReverseNodeUtil.reverse(head);
		while (null != headTmp) {
			System.out.print(headTmp.getData() + " ");
			headTmp = headTmp.getNext();
		}
		//循环反转
		Node headTmp2=ReverseNodeUtil.reverse1(head);
		while(null!=headTmp2){
			System.out.print(headTmp2.getData()+" $ ");
			headTmp2=headTmp2.getNext();
		}
	}



}
