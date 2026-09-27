package io.github.realmspp.realmspp.api;

public interface CommunityProvider {
    String id();

    String displayName();

    ProviderCapabilities capabilities();

    void connect(ServerEntry server);

    void configure();
}
