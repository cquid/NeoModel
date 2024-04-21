package org.neomodel.persistence;

import java.util.ArrayList;
import java.util.List;

public interface IModelPersistence {

    <T, I> T GetEntity(I Id);

    default <T> List<T> GetEntities(IClause clause) {
        List<T> ts = new ArrayList<>();
        return ts;
    }
}