package org.keycloak.examples.domainextension.spi;

import org.keycloak.provider.Provider;
import org.keycloak.provider.ProviderFactory;
import org.keycloak.provider.Spi;

public class DemoPolicyImplementation implements Spi {

    @Override
    public boolean isInternal() {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Class<? extends Provider> getProviderClass() {
        return DemoService.class;
    }

    @Override
    public Class<? extends ProviderFactory> getProviderFactoryClass() {
        return DemoServiceProvider.class;
    }
}