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
import org.eclipse.leshan.core.attributes.LwM2mAttributeModel;
import org.eclipse.leshan.core.node.LwM2mPath;

/**
 * A Link pretty much as defined defined in http://tools.ietf.org/html/rfc6690 but with a LWM2M flavored.
 */
public interface Link {
    enum Kind {
        ROOT, LWM2M, OTHER,
    }

    Kind getType();

    String getUriReference();

    LwM2mPath getLwM2mPath();

    Attribute getAttribute(String attrName);

    <T> T getAttributeValue(LwM2mAttributeModel<T> attrName);

    Collection<Attribute> getAttributes();
}
