//Variable length of arguments with string arguments
public class varargs {
    public void display(String...values){
        System.out.println("Number of arguments passed: "+values.length);
        for(String s:values)
        System.out.println(s+" ");
    }
    public static void main(String[] args) {
        varargs obj=new varargs();
        obj.display("Sare","Jahan","se","achha");    //with four arguments
        obj.display("Hum","honge","kamyab");        //with three arguments
        obj.display();                             //with no arguments
    }
}
