package de.juchs.provider;

import org.jboss.logging.Logger;
import org.keycloak.representations.idm.authorization.JSPolicyRepresentation;

public class DemoPolicyRepresentation extends JSPolicyRepresentation {
    private static final Logger log = Logger.getLogger(DemoPolicyRepresentation.class);

    public DemoPolicyRepresentation() {
        log.debugf("A %s is being created", this.getClass().getSimpleName());
    }

    public String getType() {
        log.debugf("Getting the type of %s", this.getClass().getSimpleName());
        return "demoPolicy";
    }
}
