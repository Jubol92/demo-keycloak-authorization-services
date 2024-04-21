package de.juchs.provider;

import org.keycloak.Config;
import org.keycloak.authorization.AuthorizationProvider;
import org.keycloak.authorization.model.Policy;
import org.keycloak.authorization.policy.provider.PolicyProvider;
import org.keycloak.authorization.policy.provider.PolicyProviderFactory;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.representations.idm.authorization.JSPolicyRepresentation;

public class DemoProviderFactory implements PolicyProviderFactory<JSPolicyRepresentation> {

    private final DemoProvider provider = new DemoProvider();

    @Override
    public String getName() {
        return "demo-policy";
    }

    @Override
    public String getGroup() {
        return "Custom Language";
    }

    @Override
    public PolicyProvider create(AuthorizationProvider authorizationProvider) {
        return provider;
    }

    @Override
    public JSPolicyRepresentation toRepresentation(Policy policy, AuthorizationProvider authorizationProvider) {
        return null;
    }

    @Override
    public Class<JSPolicyRepresentation> getRepresentationType() {
        return JSPolicyRepresentation.class;
    }

    @Override
    public PolicyProvider create(KeycloakSession keycloakSession) {
        return null;
    }

    @Override
    public void init(Config.Scope scope) {

    }

    @Override
    public void postInit(KeycloakSessionFactory keycloakSessionFactory) {

    }

    @Override
    public void close() {

    }

    @Override
    public String getId() {
        return "custom-policy";
    }
}
