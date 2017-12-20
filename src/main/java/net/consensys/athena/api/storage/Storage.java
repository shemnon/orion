package net.consensys.athena.api.storage;

import java.util.Optional;

public interface Storage<T> {

  String put(T data);

  Optional<T> get(String key);
}
