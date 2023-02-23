package paramType;

/**
 * @Description TODO
 * @Date 2023/2/4 10:15
 * @Created by 18355
 */
public class LinkedStack<T> {
    
    private static class Node<U>{
        U item;
        Node<U> next;
        Node(){
            item = null;
            next = null;
        }
        Node(U u,Node<U> next){
            item = u;
            this.next = next;
        }
        boolean end(){
            return item == null && next == null;
        }
    }
    
    private Node<T> top = new Node<>();
    
    public void push(T item){
        top = new Node<T>(item,top);
    }
    
    public T pop(){
        T result = top.item;
        if(!top.end()){
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<Integer> stringLinkedStack = new LinkedStack<>();
        for(int i = 1; i < 5; i++){
            stringLinkedStack.push(i);
        }
        Integer i;
        while((i=stringLinkedStack.pop()) != null){
            System.err.println(i);
        }
    }
}
