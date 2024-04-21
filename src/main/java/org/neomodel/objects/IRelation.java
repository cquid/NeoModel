package org.neomodel.objects;

import java.util.List;

public interface IRelation {

    List<IRelation> getRelations();
    List<IAttribute> getAttributes();
    IAttribute getAttributeByName();

}
