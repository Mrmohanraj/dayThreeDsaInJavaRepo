package sjb.dsa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Stack st=new Stack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println("peek element of stack : "+st.peek());
        st.display();
        System.out.println(st.isEmpty());;
        System.out.println(st.isFull());;

    }
}
