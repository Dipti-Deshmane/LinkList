public class DemoLinkedList {
        Node head;
        Node tail;

        void addAtEnd(int data){
            Node temp = new Node(data);
            if(head==null){
                head = tail = temp;
            }
            else{
                tail.address=temp;
                tail=temp;
            }

        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.address;
            }

        }

    }




