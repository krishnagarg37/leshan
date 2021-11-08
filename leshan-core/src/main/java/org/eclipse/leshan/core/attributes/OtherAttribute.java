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
package org.eclipse.leshan.core.attributes;

import org.eclipse.leshan.core.link.LinkParamValue;

/**
 * An attribute to a Link which is not a {@link LwM2mAttribute} but a simple attribute as defined in
 * http://tools.ietf.org/html/rfc6690.
 */
public class OtherAttribute implements Attribute {

    private String paramName;
    private LinkParamValue paramValue;

    @Override
    public String getCoRELinkParam() {
        return paramName;
    }

    @Override
    public String getValue() {
        if (paramName == null)
            return null;
        return paramValue.toString();
    }

    public LinkParamValue getLinkParamValue() {
        return paramValue;
    }
}
