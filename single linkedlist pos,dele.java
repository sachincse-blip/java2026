class LinkedList 
{
    Node head;
    
    static class Node {
    int data;
    Node next;
    
    Node(int val)
    {
        data=val;
        next=null;
    }
}
static LinkedList insert(LinkedList list,int val)
{
    Node newnode=new Node(val);
    if(list.head==null)
    {
        list.head=newnode;
    }
    else
    {
        Node temp=list.head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
    }
    return list;
}
static void display(LinkedList list)
{
    System.out.println("LinkedList");
    Node current=list.head;
    while(current!=null)
    {
        System.out.print(current.data+" ");
        current=current.next;
    }
}
static LinkedList insertbegin(LinkedList list,int val)
{
    Node newnode=new Node(val);
    if(list.head==null)
    {
        list.head=newnode;
    }
    else
    {
        newnode.next=list.head;
        list.head=newnode;
    }
    return list;
}
static LinkedList insertpos(LinkedList list,int pos,int val)
{
    Node newnode=new Node(val);
    Node temp=list.head;
    for(int i=1;i<pos;i++)
    {
        temp=temp.next;
    }
    newnode.next=temp.next; 
    temp.next=newnode;
    return list;
   
}
static LinkedList delete(LinkedList list)
{ 
    Node temp=list.head; 
    list.head=temp.next; 
    temp.next=null;
    return list;
}
static LinkedList deletepos(LinkedList list,int pos)
{
    Node temp=list.head;
    for(int i=1;i<pos;i++)
    {
        temp=temp.next;
    }
    temp.next=temp.next.next;
    return list;
}
static LinkedList deletelast(LinkedList list)
{
    Node temp=list.head;
    while(temp.next.next!=null)
    {
        temp=temp.next;
    }
    temp.next=null;
    return list;
}
    public static void main(String[]args)
    {
        LinkedList list =new LinkedList();
        list=insert(list,10);
        list=insert(list,20);
        list=insert(list,30);
        list=insert(list,40);
        list=insertbegin(list,100);
        list=insertpos(list,3,300);
        list =delete(list);
        list =deletepos(list,2);
        list =deletelast(list);
        display(list);
    }
}



