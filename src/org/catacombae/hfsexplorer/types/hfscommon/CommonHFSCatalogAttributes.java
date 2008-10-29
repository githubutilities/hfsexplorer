/*-
 * Copyright (C) Erik Larsson
 *
 * All rights reserved.
 */
package org.catacombae.hfsexplorer.types.hfscommon;

import java.util.Date;
import org.catacombae.hfsexplorer.types.hfsplus.HFSPlusBSDInfo;

/**
 * Generalization of the common attributes of CommonHFSCatalogFolder and CommonHFSCatalogFile.
 * 
 * Please note that this class is NOT designed to cope with subtle differences
 * between HFS and HFS+. For instance HFS does not have the concept of separate
 * content modify and attribute modify dates, and does not at all store access
 * date. This interface should be updated in a clever way some time later.
 *
 * @author Erik Larsson
 */
public interface CommonHFSCatalogAttributes {
    public short getRecordType();
    public short getFlags();
    public int getCreateDate();
    public int getContentModDate();
    public int getAttributeModDate();
    public int getAccessDate();
    public int getBackupDate();

    /**
     * Returns whether or not this object contains HFS+ permissions.
     * @return whether or not this object contains HFS+ permissions.
     */
    public boolean hasPermissions();
    public HFSPlusBSDInfo getPermissions();
    //public int getTextEncoding();
    
    public Date getCreateDateAsDate();
    public Date getContentModDateAsDate();
    public Date getAttributeModDateAsDate();
    public Date getAccessDateAsDate();
    public Date getBackupDateAsDate();
}
