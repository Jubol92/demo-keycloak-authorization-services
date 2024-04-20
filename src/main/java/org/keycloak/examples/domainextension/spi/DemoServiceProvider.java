package org.keycloak.examples.domainextension.spi;

import org.keycloak.Config;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.provider.ProviderFactory;

public class DemoServiceProvider implements ProviderFactory<DemoService> {
    @Override
    public DemoService create(KeycloakSession keycloakSession) {
        return new DemoService(keycloakSession);
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
        return "demo-service";
    }
}
