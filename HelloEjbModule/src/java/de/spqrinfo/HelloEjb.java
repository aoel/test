package de.spqrinfo;

import javax.ejb.Stateless;

@Stateless
public class HelloEjb implements HelloEjbRemote {

    @Override
    public String sayHello() {
        return "Hello World";
    }
  
}
