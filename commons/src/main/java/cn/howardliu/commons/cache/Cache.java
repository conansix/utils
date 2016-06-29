package cn.howardliu.commons.cache;

import java.util.Collection;

/**
 * <br/>create at 16-5-3
 *
 * @author liuxh
 * @since 1.0.0
 */
public interface Cache<T> {
    Collection<String> keys();

    T get(String k);

    void put(String k, T v);

    T remove(String k);
}
