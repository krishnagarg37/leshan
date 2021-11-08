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

import java.util.List;

/**
 * A list of {@link Link} with a getter to the {@link RootLink}.
 */
public class Links {

    private Integer rootIndex;
    private List<Link> links;

    public Links(List<Link> links) {
        this(links, null);
    }

    public Links(List<Link> links, Integer rootIndex) {
        this.rootIndex = rootIndex;
        this.links = links;
    }

    public List<Link> getLinks() {
        return links;
    }

    public Integer getRootIndex() {
        return rootIndex;
    }

    public RootLink getRoot() {
        if (rootIndex == null)
            return null;
        return (RootLink) links.get(rootIndex);
    }
}
