package com.webi.util;

import com.webi.nodeadmin.param.Node;

/**
 * Title: MergeNodeUtil<br>
 * Description: MergeNodeUtil<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年03月30日 21:56
 *
 * @author Administrator
 */
public class MergeNodeUtil {
    public static Node merge(Node head, Node head1) {
        if(head==null){
            return head1;
        }
        if(head1==null){
            return head;
        }
        Node head3=null;
        if(head.getData()<=head1.getData()){
            head3=head;
            head3.setNext(merge(head.getNext(),head1));
        }
        else{
            head3=head1;
            head3.setNext(merge(head,head1.getNext()));
        }
        return  head3;
    }
}
