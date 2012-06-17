package org.antbear.jee.wicket;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxFallbackLink;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.PropertyModel;


public class CounterAjax extends WebPage {
    private int counter = 0;
	private Label label;

    public CounterAjax() {
        add(new AjaxFallbackLink("link") {
		  @Override
		  public void onClick(AjaxRequestTarget target) {
		    counter++;
			if(target != null) {
			  target.addComponent(label);
                        }
		  }
		});
		label = new Label("label", new PropertyModel(this,"counter"));
		label.setOutputMarkupId(true);
		add(label);
    }
}
