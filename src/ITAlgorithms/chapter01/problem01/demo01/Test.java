package ITAlgorithms.chapter01.problem01.demo01;

/**
 * @author cg
 * @description desc
 * @date 2020-11-01 21:02
 */
public class Test {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push(34);
        myStack.push(1);
        myStack.push(12);
        myStack.push(-1);

        System.out.println(myStack.getMin());

        System.out.println(myStack.pop());

        System.out.println(myStack.getMin());
    }

}
