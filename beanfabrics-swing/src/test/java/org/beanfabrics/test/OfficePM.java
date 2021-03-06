/*
 * Beanfabrics Framework Copyright (C) by Michael Karneim, beanfabrics.org
 * Use is subject to license terms. See license.txt.
 */
package org.beanfabrics.test;

import org.beanfabrics.model.AbstractPM;
import org.beanfabrics.model.PMManager;
import org.beanfabrics.model.TextPM;

/**
 * @author Michael Karneim
 */
public class OfficePM extends AbstractPM {
    public final TextPM name = new TextPM();
    public final AddressPM address = new AddressPM();

    public OfficePM() {
        PMManager.setup(this);
    }
}