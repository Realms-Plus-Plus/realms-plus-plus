package io.github.realmspp.realmspp.api;

public final class ExampleProvider implements CommunityProvider {

    @Override
    public String id() {
        return "realmspp:example";
    }

    @Override
    public String displayName() {
        return "Example Provider";
    }

    @Override
    public ProviderCapabilities capabilities() {
        return new ProviderCapabilities(
                true,
                false,
                true,
                true,
                false,
                false
        );
    }

    @Override
    public void connect(ServerEntry server) {
        System.out.println("Connecting to " + server.address());
    }

    @Override
    public void configure() {
        System.out.println("Configuring Example Provider");
    }
}
