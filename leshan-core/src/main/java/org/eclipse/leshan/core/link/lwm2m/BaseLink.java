/*******************************************************************************
 * Copyright (c) 2021 Sierra Wireless and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 * 
 * The Eclipse Public License is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 * and the Eclipse Distribution License is available at
 *    http://www.eclipse.org/org/documents/edl-v10.html.
 * 
 * Contributors:
 *     Sierra Wireless - initial API and implementation
 *******************************************************************************/
package org.eclipse.leshan.core.link.lwm2m;

import java.util.Collection;

import org.eclipse.leshan.core.attributes.Attribute;
import org.eclipse.leshan.core.attributes.AttributeSet;

public abstract class BaseLink implements Link {

    private AttributeSet attributes;

    public BaseLink(AttributeSet attributes) {
        this.attributes = attributes;
    }

    @Override
    public Attribute getAttribute(String attrName) {
        return attributes.getAttribute(attrName);
    }

    @Override
    public Collection<Attribute> getAttributes() {
        return attributes.getAttributes();
    }
}