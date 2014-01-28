/*
 * Beanfabrics Framework Copyright (C) by Michael Karneim, beanfabrics.org
 * Use is subject to license terms. See license.txt.
 */
package org.beanfabrics.swing.customizer.path;

import org.beanfabrics.Path;
import org.beanfabrics.meta.PathTree;
import org.beanfabrics.meta.TypeInfo;

/**
 * @author Michael Karneim
 */
public class PathContext {
    public final PathTree root;
    public final TypeInfo requiredModelTypeInfo;
    public final Path initialPath;

    public PathContext(PathTree rootPathTree, TypeInfo requiredModelTypeInfo, Path initialPath) {
        super();
        this.initialPath = initialPath;
        this.requiredModelTypeInfo = requiredModelTypeInfo;
        this.root = rootPathTree;
    }

}