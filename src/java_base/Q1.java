package java_base;

public class Q1 {
    /**
     * i++先将i的值压入操作数栈再自增
     * ++i先将i的值增加1再压入操作数栈
     * @param args
     */
    public static void main(String[] args) {
        //可以这样理解：一个堆内存用于存储局部变量i的值，一个栈，用于存储操作数，实际运算时从操作数栈中取值进行操作
        int i = 1;
        i = i++;  //i=1先压入操作数栈，此时局部变量i=2，操作数栈中只有一个i,值为1，在将栈中的1赋给i。此时i=1
        int j = i++; //同上 j=1,i=1
        //先将2压入栈，在先算乘法，从左到右，++i(此时将3压入栈覆)，再算i++(将3压入栈，i再自增为4)。此时栈中有3个数分别为2,3,3；即2 + 3 * 3 =11
        int k = i + ++i * i++;
        System.out.println("i:" + i); //此时i为4
        System.out.println("j:" + j); //1
        System.out.println("hot-fix modified");
        System.out.println("xixi");
        System.out.println("haha");
        System.out.println("k:" + k); //11
    }

}
