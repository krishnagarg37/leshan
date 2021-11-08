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

import org.eclipse.leshan.core.attributes.AttributeSet;
import org.eclipse.leshan.core.attributes.LwM2mAttributeModel;
import org.eclipse.leshan.core.node.LwM2mPath;

/**
 * This is a link which does not refer to the root resource (see {@link RootLink}) or to a LWM2M resource (@see
 * {@link LwM2mLink})
 */
public class OtherLink extends BaseLink {

    private String uriReference;

    public OtherLink(String uriReference, AttributeSet attributes) {
        super(attributes);
        this.uriReference = uriReference;
    }

    @Override
    public Kind getType() {
        return Kind.OTHER;
    }

    @Override
    public String getUriReference() {
        return uriReference;
    }

    @Override
    public LwM2mPath getLwM2mPath() {
        throw new UnsupportedOperationException("OtherLink does not have a LWM2M path, use getUriReference instead.");
    }

    @Override
    public <T> T getAttributeValue(LwM2mAttributeModel<T> attrName) {
        throw new UnsupportedOperationException("OtherLink has not LWM2M defined attribute, use getAttribute instead");
    }
}
