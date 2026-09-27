package io.github.realmspp.realmspp.api;

public record ServerEntry(
        String id,
        String name,
        String address,
        String providerId,
        String software,
        String minecraftVersion
) {
}
