/*
 * Beanfabrics Framework Copyright (C) by Michael Karneim, beanfabrics.org
 * Use is subject to license terms. See license.txt.
 */
package org.beanfabrics.swing.customizer.path;

import org.beanfabrics.swing.ModelSubscriberBeanInfo;

/**
 * @created by the Beanfabrics Component Wizard, www.beanfabrics.org
 */
public class PathChooserDialogBeanInfo extends ModelSubscriberBeanInfo {
    @Override
    protected Class getBeanClass() {
        return PathChooserDialog.class;
    }

    @Override
    protected boolean isPathBound() {
        return false;
    }
}