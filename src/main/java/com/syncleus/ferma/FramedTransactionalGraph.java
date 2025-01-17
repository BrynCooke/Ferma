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

import com.tinkerpop.blueprints.TransactionalGraph;

import java.util.Collection;

public class FramedTransactionalGraph extends FramedGraph implements TransactionalGraph {

    public FramedTransactionalGraph(TransactionalGraph delegate, FrameFactory builder, TypeResolver defaultResolver) {
        super(delegate, builder, defaultResolver);
    }

    public FramedTransactionalGraph(TransactionalGraph delegate) {
        super(delegate);
    }

    public FramedTransactionalGraph(TransactionalGraph delegate, ReflectionCache reflections) {
        super(delegate, reflections);
    }

    public FramedTransactionalGraph(TransactionalGraph delegate, TypeResolver defaultResolver) {
        super(delegate, defaultResolver);
    }

    public FramedTransactionalGraph(TransactionalGraph delegate, boolean typeResolution, boolean annotationsSupported) {
        super(delegate, typeResolution, annotationsSupported);
    }

    public FramedTransactionalGraph(TransactionalGraph delegate, ReflectionCache reflections, boolean typeResolution, boolean annotationsSupported) {
        super(delegate, reflections, typeResolution, annotationsSupported);
    }

    public FramedTransactionalGraph(TransactionalGraph delegate, Collection<? extends Class<?>> types) {
        super(delegate, types);
    }

    public FramedTransactionalGraph(TransactionalGraph delegate, boolean typeResolution, Collection<? extends Class<?>> types) {
        super(delegate, typeResolution, types);
    }

    @Override
    public void stopTransaction(Conclusion conclusion) {
        ((TransactionalGraph)this.getDelegate()).stopTransaction(conclusion);
    }

    @Override
    public void commit() {
        ((TransactionalGraph)this.getDelegate()).commit();
    }

    @Override
    public void rollback() {
        ((TransactionalGraph)this.getDelegate()).rollback();
    }
}
