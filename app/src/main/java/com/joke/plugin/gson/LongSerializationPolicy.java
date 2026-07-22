package com.joke.plugin.gson;

/* JADX INFO: loaded from: classes3.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.joke.plugin.gson.LongSerializationPolicy.1
        @Override // com.joke.plugin.gson.LongSerializationPolicy
        public JsonElement serialize(Long l) {
            return new JsonPrimitive(l);
        }
    },
    STRING { // from class: com.joke.plugin.gson.LongSerializationPolicy.2
        @Override // com.joke.plugin.gson.LongSerializationPolicy
        public JsonElement serialize(Long l) {
            return new JsonPrimitive(String.valueOf(l));
        }
    };


    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f164short = {2833, 2832, 2835, 2836, 2816, 2841, 2817, 891, 892, 890, 865, 870, 879};

    public abstract JsonElement serialize(Long l);
}
