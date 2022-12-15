package ListProject;


public class Programm {
    
    public static void main(String[] args) {
        
        List list = new List();
        
        list.addFirst(9);
        list.addFirst(7);
        list.addFirst(8);

        list.printList();
        list.revert();
        list.printList();
        

    }
}
