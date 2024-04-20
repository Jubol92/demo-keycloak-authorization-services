package org.keycloak.examples.domainextension.spi;

import org.keycloak.authorization.model.Policy;
import org.keycloak.authorization.model.Resource;
import org.keycloak.authorization.model.ResourceServer;
import org.keycloak.authorization.model.Scope;
import org.keycloak.representations.idm.authorization.DecisionStrategy;
import org.keycloak.representations.idm.authorization.Logic;

import java.util.Map;
import java.util.Set;

public class DemoPolicy implements Policy {
    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getType() {
        return "Demo Custom Policy";
    }

    @Override
    public DecisionStrategy getDecisionStrategy() {
        return DecisionStrategy.AFFIRMATIVE;
    }

    @Override
    public void setDecisionStrategy(DecisionStrategy decisionStrategy) {
    }

    @Override
    public Logic getLogic() {
        return Logic.POSITIVE;
    }

    @Override
    public void setLogic(Logic logic) {
    }

    @Override
    public Map<String, String> getConfig() {
        return null;
    }

    @Override
    public void setConfig(Map<String, String> map) {

    }

    @Override
    public void removeConfig(String s) {

    }

    @Override
    public void putConfig(String s, String s1) {

    }

    @Override
    public String getName() {
        return "Demo Custom Policy";
    }

    @Override
    public void setName(String s) {

    }

    @Override
    public String getDescription() {
        return "Demo Custom Policy";
    }

    @Override
    public void setDescription(String s) {

    }

    @Override
    public ResourceServer getResourceServer() {
        return null;
    }

    @Override
    public Set<Policy> getAssociatedPolicies() {
        return null;
    }

    @Override
    public Set<Resource> getResources() {
        return null;
    }

    @Override
    public Set<Scope> getScopes() {
        return null;
    }

    @Override
    public String getOwner() {
        return null;
    }

    @Override
    public void setOwner(String s) {

    }

    @Override
    public void addScope(Scope scope) {

    }

    @Override
    public void removeScope(Scope scope) {

    }

    @Override
    public void addAssociatedPolicy(Policy policy) {

    }

    @Override
    public void removeAssociatedPolicy(Policy policy) {

    }

    @Override
    public void addResource(Resource resource) {

    }

    @Override
    public void removeResource(Resource resource) {

    }
}
