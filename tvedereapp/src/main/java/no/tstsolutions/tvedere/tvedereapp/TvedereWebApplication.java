package no.tstsolutions.tvedere.tvedereapp;

import org.apache.wicket.authentication.AuthenticatedWebApplication;
import org.apache.wicket.authentication.AuthenticatedWebSession;
import org.apache.wicket.markup.html.WebPage;
import no.tstsolutions.tvedere.tvedereapp.pages.HomePage;

/**
 *
 * @author asm
 */
public class TvedereWebApplication extends AuthenticatedWebApplication {

    @Override
    protected Class<? extends AuthenticatedWebSession> getWebSessionClass() {
        return TvedereWebSession.class;
    }

    @Override
    protected Class<? extends WebPage> getSignInPageClass() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Class getHomePage() {
        return HomePage.class;
    }

}
