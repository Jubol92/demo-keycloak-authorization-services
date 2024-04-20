package org.keycloak.examples.domainextension.spi;

import org.keycloak.authorization.policy.evaluation.Evaluation;
import org.keycloak.authorization.policy.provider.PolicyProvider;
import org.keycloak.models.KeycloakSession;

public class DemoService implements PolicyProvider{
    private KeycloakSession session;

    public DemoService(KeycloakSession session) {
            this.session = session;
    }

    @Override
    public void close() {

        }

    @Override
    public void evaluate(Evaluation evaluation) {

    }
}
