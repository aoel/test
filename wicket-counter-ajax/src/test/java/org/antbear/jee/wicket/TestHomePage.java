package org.antbear.jee.wicket;

import org.antbear.jee.wicket.WicketApplication;
import org.antbear.jee.wicket.CounterAjax;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;

/**
 * Simple test using the WicketTester
 */
public class TestHomePage {

    private WicketTester tester;

    @Before
    public void setUp() {
        tester = new WicketTester(new WicketApplication());
    }

    @Test
    public void testRenderMyPage() {
        //start and render the test page
        tester.startPage(CounterAjax.class);

        //assert rendered page class
        tester.assertRenderedPage(CounterAjax.class);

        //assert rendered label component
        tester.assertLabel("message", "If you see this message wicket is properly configured and running");
    }
}
