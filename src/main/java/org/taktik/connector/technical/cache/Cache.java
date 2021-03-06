package org.taktik.connector.technical.cache;

import java.util.Map;

public interface Cache<K, V> {
   String getName();

   V get(K var1);

   boolean containsKey(K var1);

   void put(K var1, V var2);

   void remove(K var1);

   void clear();

   void putAll(Map<K, V> var1);
}
