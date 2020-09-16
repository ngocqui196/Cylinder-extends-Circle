import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0,"red");
        System.out.println(c1.toString());

        Circle c2 = new Cylinder(3.0,"black",3.0);
        System.out.println(c2.toString());
    }


}
