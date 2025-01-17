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

/*
 * Part or all of this source file was forked from a third-party project, the details of which are listed below.
 *
 * Source Project: Totorom
 * Source URL: https://github.com/BrynCooke/totorom
 * Source License: Apache Public License v2.0
 * When: November, 20th 2014
 */
package com.syncleus.ferma;

public interface SplitTraversal<T> {

	/**
	 * Add an ExhaustMergePipe to the end of the pipeline. The one-step previous
	 * MetaPipe in the pipeline's pipes are used as the internal pipes. The
	 * pipes' emitted objects are merged where the first pipe's objects are
	 * exhausted, then the second, etc.
	 *
	 * @return the extended Pipeline
	 */
	public abstract T exhaustMerge();

	/**
	 * Add a FairMergePipe to the end of the Pipeline. The one-step previous
	 * MetaPipe in the pipeline's pipes are used as the internal pipes. The
	 * pipes' emitted objects are merged in a round robin fashion.
	 *
	 * @return the extended Pipeline
	 */
	public abstract T fairMerge();

}
