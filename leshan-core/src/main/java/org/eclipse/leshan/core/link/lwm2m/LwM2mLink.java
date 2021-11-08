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

import org.eclipse.leshan.core.attributes.Attribute;
import org.eclipse.leshan.core.attributes.AttributeSet;
import org.eclipse.leshan.core.attributes.LwM2mAttributeModel;
import org.eclipse.leshan.core.node.LwM2mPath;

/**
 * This is a link which refers to a LWM2M Node (Object, Object Instance, resource or resource instance).
 */
public class LwM2mLink extends BaseLink {

    private LwM2mPath path;

    public LwM2mLink(LwM2mPath path, AttributeSet attributes) {
        super(attributes);
        this.path = path;
    }

    @Override
    public Kind getType() {
        return Kind.LWM2M;
    }

    @Override
    public LwM2mPath getLwM2mPath() {
        return path;
    }

    @Override
    public String getUriReference() {
        throw new UnsupportedOperationException("LwM2mLink does not have a UriReference, use getUriReference instead.");
    };

    @SuppressWarnings("unchecked")
    @Override
    public <T> T getAttributeValue(LwM2mAttributeModel<T> attr) {
        Attribute attribute = getAttribute(attr.getCoRELinkParam());
        if (attribute != null) {
            return (T) attribute.getValue();
        }
        return null;
    }
}
