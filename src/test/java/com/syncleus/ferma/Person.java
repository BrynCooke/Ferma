/******************************************************************************
 *                                                                             *
 *  Copyright: (c) Syncleus, Inc.                                              *
 *                                                                             *
 *  You may redistribute and modify this source code under the terms and       *
 *  conditions of the Open Source Community License - Type C version 1.0       *
 *  or any later version as published by Syncleus, Inc. at www.syncleus.com.   *
 *  There should be a copy of the license included with this file. If a copy   *
 *  of the license is not included you are granted no right to distribute or   *
 *  otherwise use this file except through a legal and valid license. You      *
 *  should also contact Syncleus, Inc. at the information below if you cannot  *
 *  find a license:                                                            *
 *                                                                             *
 *  Syncleus, Inc.                                                             *
 *  2604 South 12th Street                                                     *
 *  Philadelphia, PA 19148                                                     *
 *                                                                             *
 ******************************************************************************/
package com.syncleus.ferma;

import java.util.Iterator;
import java.util.List;

/**
 * @author Bryn Cooke (http://jglue.org)
 */

public class Person extends FramedVertex {




    public String getName() {
        return getProperty("name");
    }

    public void setName(String name) {
        setProperty("name", name);
    }

    public Iterator<Person> getKnows() {

        return out("knows").frame(Person.class).iterator();
    }

    public Iterator<Person> getKnowsExplicit() {

        return out("knows").frame(Person.class).iterator();
    }

    public List<Knows> getKnowsList() {
        return outE("knows").toList(Knows.class);
    }

    public List<Knows> getKnowsListExplicit() {
        return outE("knows").toListExplicit(Knows.class);
    }
    
    public List<Person> getKnowsCollectionVertices() {
        return out("knows").toList(Person.class);
    }

    public List<Person> getKnowsCollectionVerticesExplicit() {
        return out("knows").toListExplicit(Person.class);
    }


    public Person getFirst() {
        return out("knows").next(Person.class);
    }

    public Person getFirstExplicit() {
        return out("knows").nextExplicit(Person.class);
    }

    public Knows addKnows(Person friend) {
        return addFramedEdge("knows", friend, Knows.class);
    }

    public Knows addKnowsExplicit(Person friend) {
        return addFramedEdgeExplicit("knows", friend, Knows.class);
    }


}
