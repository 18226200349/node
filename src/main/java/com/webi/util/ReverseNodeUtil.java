package com.webi.util;

import com.webi.nodeadmin.param.Node;

/**
 * Title: ReverseNodeUtil<br>
 * Description: ReverseNodeUtil<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年03月30日 21:14
 *
 * @author Administrator
 */
public class ReverseNodeUtil {
    /**
     * Title:  循环遍历反转链表<br>
     * Description: 循环遍历反转链表<br>
     * CreateDate: 2019/3/30 21:15<br>
     *
     * @category  循环遍历反转链表
     * @author Administrator
     * @param head
     * @return com.webi.nodeadmin.param.Node
     * @exception Exception
     */
    public static  Node reverse1(Node head) {

        if(head==null){
            return head;
        }
        //头结点
        Node pre=head;
        //下一节点
        Node cur=head.getNext();
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
    /**
     * Title: 递归反转链表<br>
     * Description: 递归反转链表<br>
     * CreateDate: 2019/3/30 21:20<br>
     *
     * @category 递归反转链表
     * @author Administrator
     * @param head
     * @return com.webi.nodeadmin.param.Node
     * @exception Exception
     */
    public static Node reverse(Node head) {
        if(head==null||head.getNext()==null){
            return  head;
        }
        // 先反转后续节点head.getNext()
        Node reHead = reverse(head.getNext());
        // 将当前结点的指针域指向前一结点
        head.getNext().setNext(head);
        // 前一结点的指针域令为null;
        head.setNext(null);
        // 反转后新链表的头结点
        return reHead;
    }
}
