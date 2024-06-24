import java.util.Stack;

public class StackDSA {
    Stack<String> stack = new Stack<String>();

//    LIFO data structure last in first out
//    stores object into a sort of vertical tower
//    push() to add from the top
//    pop() to remove from the top
//    peek() looks at the object at the top of this stack without removing it from the stack.


    void show() {
        System.out.println(stack);
    }

    void add() {
        stack.push("Minecraft");
        stack.push("Terraria");
        stack.push("Stardew Valley");
        stack.push("Harvest Town");
        stack.push("Story of Seasons");

    }

    void pop() {
        stack.pop();
    }

    void search() {
        System.out.println(stack.search("Story of Seasons"));
    }


    void peek() {
        System.out.println(stack.peek());
    }


}
