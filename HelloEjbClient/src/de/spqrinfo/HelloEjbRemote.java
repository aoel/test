/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.spqrinfo;

import javax.ejb.Remote;

/**
 *
 * @author aoel
 */
@Remote
public interface HelloEjbRemote {

    public String sayHello();
    
}
