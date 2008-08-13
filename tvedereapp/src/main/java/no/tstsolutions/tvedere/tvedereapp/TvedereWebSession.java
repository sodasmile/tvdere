package no.tstsolutions.tvedere.tvedereapp;

import org.apache.wicket.Request;
import org.apache.wicket.authentication.AuthenticatedWebSession;
import org.apache.wicket.authorization.strategies.role.Roles;

/**
 *
 * @author asm
 */
public class TvedereWebSession extends AuthenticatedWebSession {

    private static final long serialVersionUID = 2L;

    public TvedereWebSession(Request request) {
        super(request);
    }

    @Override
    public boolean authenticate(String arg0, String arg1) {
        return false;
    }

    @Override
    public Roles getRoles() {
        return null;
    }
}
