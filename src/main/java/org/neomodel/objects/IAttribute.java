package org.neomodel.objects;

public interface IAttribute {

    boolean isNullable();
    int minCardinality();
    int maxCardinality();
    String getName();
    Class getType();
    boolean isId();

}
