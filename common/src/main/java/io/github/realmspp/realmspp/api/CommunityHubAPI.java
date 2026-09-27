package io.github.realmspp.realmspp.api;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public final class CommunityHubAPI {

    private static final Map<String, CommunityProvider> PROVIDERS =
            new LinkedHashMap<>();

    private CommunityHubAPI() {
    }

    public static void registerProvider(CommunityProvider provider) {
        if (PROVIDERS.containsKey(provider.id())) {
            throw new IllegalArgumentException(
                    "Provider already registered: " + provider.id()
            );
        }

        PROVIDERS.put(provider.id(), provider);
    }

    public static CommunityProvider getProvider(String id) {
        return PROVIDERS.get(id);
    }

    public static Collection<CommunityProvider> getProviders() {
        return PROVIDERS.values();
    }
}
