package helloejbclient;

import javax.ejb.EJB;
import de.spqrinfo.HelloEjbRemote;

public class HelloEjbClient {
  @EJB
  private static HelloEjbRemote helloEjb;
  
  public static void main (String[] args) {
    System.out.println(helloEjb.sayHello());
  }
}
