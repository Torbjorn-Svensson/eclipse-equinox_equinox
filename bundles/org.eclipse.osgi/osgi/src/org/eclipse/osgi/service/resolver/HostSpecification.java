/*******************************************************************************
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.osgi.service.resolver;

/**
 * A representation of one host bundle constraint as seen in a 
 * bundle manifest and managed by a state and resolver.
 */
public interface HostSpecification extends VersionConstraint {
	// TODO what is this method for?  I think it used to specify that
	// a fragment should force a reload of the host when attaching.
	// this should be removed.
	/**
	 * This method should not be called.
	 */
	public boolean reloadHost();

	/**
	 * Returns an array of bundle descriptions which satisfy this
	 * host specification.
	 * 
	 * @return the host bundles which satisfy this constraint
	 */
	public BundleDescription[] getSuppliers();
}