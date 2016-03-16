package jpos.config.simple.xml;

///////////////////////////////////////////////////////////////////////////////
//
// This software is provided "AS IS".  The JavaPOS working group (including
// each of the Corporate members, contributors and individuals)  MAKES NO
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED 
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
// NON-INFRINGEMENT. The JavaPOS working group shall not be liable for
// any damages suffered as a result of using, modifying or distributing this
// software or its derivatives. Permission to use, copy, modify, and distribute
// the software and its documentation for any purpose is hereby granted. 
//
// The JavaPOS Config/Loader (aka JCL) is now under the CPL license, which 
// is an OSS Apache-like license.  The complete license is located at:
//    http://www.ibm.com/developerworks/library/os-cpl.html
//
///////////////////////////////////////////////////////////////////////////////

import jpos.config.JposRegPopulator;

/**
 * Defines an interface to load, save JposEntries
 * @since 1.2 (NY 2K meeting)
 * @author E. Michael Maximilien (maxim@us.ibm.com)
 */
public interface XmlRegPopulator extends JposRegPopulator
{
    //-------------------------------------------------------------------------
    // Class constants
    //

    /**
     * Default name to save entries if the XML populator is chosen but
     * no populator file is specified
     * @since 1.2 (NY 2K meeting)
     */
    public static final String DEFAULT_XML_FILE_NAME = "jpos.xml";
}