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
 * The root link is the link referencing the "/" resource or a resource with the resource type "oma.lwm2m". (e.g.
 * {@code </lwm2m>;rt="oma.lwm2m"})
 *
 */
public class RootLink extends OtherLink {

    public RootLink(AttributeSet attributes) {
        super("/", attributes);
    }

    public RootLink(String uriReference, AttributeSet attributes) {
        super(uriReference, attributes);
    }

    @Override
    public Kind getType() {
        return Kind.ROOT;
    }

    @Override
    public LwM2mPath getLwM2mPath() {
        throw new UnsupportedOperationException("RootLink does not have a LWM2M path, use getUriReference instead.");
    }

    @Override
    public <T> T getAttributeValue(LwM2mAttributeModel<T> attrName) {
        throw new UnsupportedOperationException("RootLink has not LWM2M defined attribute, use getAttribute instead");
    }
}
