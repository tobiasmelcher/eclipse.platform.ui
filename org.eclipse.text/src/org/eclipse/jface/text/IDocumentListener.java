/*******************************************************************************
 * Copyright (c) 2000, 2003 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jface.text;



/**
 * Interface for objects which are interested in getting informed about 
 * document changes. A listener is informed about document changes before 
 * they are applied and after they have been applied. It is ensured that
 * the document event passed into the listener is the same for the two
 * notifications, i.e. the two document events can be checked using object identity.
 * Clients may implement this interface.
 * 
 * @see org.eclipse.jface.text.IDocument
 */
public interface IDocumentListener {
	
	
	/**
	 * The manipulation described by the document event will be performed.
	 * 
	 * @param event the document event describing the document change 
	 */
	void documentAboutToBeChanged(DocumentEvent event);

	/**
	 * The manipulation described by the document event has been performed.
	 *
	 * @param event the document event describing the document change
	 */
	void documentChanged(DocumentEvent event);
}
