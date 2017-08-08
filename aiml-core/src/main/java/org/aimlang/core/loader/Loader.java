package org.aimlang.core.loader;

import java.util.Collection;

/**
 * Abstract interface for any types of loader specified by two types: type of source and type of results
 *
 * @param <S> source type of data
 * @param <R> result type of data
 * @author anton
 * @since 25/10/16
 */
public interface Loader<R, S> {
    /**
     * Load data from collection of sources
     *
     * @param sources of data
     * @return data from ${sources}
     */
    Collection<R> load(S... sources);
}