package org.antbear.jee.wicket;

import org.apache.wicket.protocol.http.WebApplication;

/**
 * Application object for your web application. If you want to run this application without deploying,
 * run the Start class.
 *
 * @see org.antbear.Start#main(String[])
 */
public class WicketApplication extends WebApplication {

    /**
     * @see org.apache.wicket.Application#getHomePage()
     */
    public Class<CounterAjax> getHomePage() {
        return CounterAjax.class;
    }
}
