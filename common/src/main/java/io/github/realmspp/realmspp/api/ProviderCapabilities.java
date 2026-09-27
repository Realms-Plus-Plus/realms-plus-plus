package io.github.realmspp.realmspp.api;

public record ProviderCapabilities(
        boolean supportsServers,
        boolean supportsRealms,
        boolean supportsMods,
        boolean supportsPlugins,
        boolean supportsConsole,
        boolean supportsRestart
) {
}
