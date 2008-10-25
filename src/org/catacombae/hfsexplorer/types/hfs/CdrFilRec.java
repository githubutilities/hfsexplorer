package org.catacombae.hfsexplorer.types.hfs;

import org.catacombae.hfsexplorer.types.finder.FInfo;
import org.catacombae.hfsexplorer.types.finder.FXInfo;
import java.io.PrintStream;
import org.catacombae.csjc.structelements.Dictionary;
import org.catacombae.hfsexplorer.Util;

/** This class was generated by CStructToJavaClass. */
public class CdrFilRec extends CatDataRec {
        /*
     * struct CdrFilRec
     * size: 86 bytes
     * description:
     *
     * BP  Size  Type        Identifier   Description
     * ---------------------------------------------------------------------------------
     * 0   1     SInt8       cdrType      record type (SignedByte)
     * 1   1     SInt8       cdrResrv2    reserved (SignedByte)
     * 2   1     SInt8       filFlags     file flags (SignedByte)
     * 3   1     SInt8       filTyp       file type (SignedByte)
     * 4   16    FInfo       filUsrWds    Finder information (FInfo)
     * 20  4     SInt32      filFlNum     file ID (LongInt)
     * 24  2     SInt16      filStBlk     first alloc. blk. of data fork (Integer)
     * 26  4     SInt32      filLgLen     logical EOF of data fork (LongInt)
     * 30  4     SInt32      filPyLen     physical EOF of data fork (LongInt)
     * 34  2     SInt16      filRStBlk    first alloc. blk. of resource fork (Integer)
     * 36  4     SInt32      filRLgLen    logical EOF of resource fork (LongInt)
     * 40  4     SInt32      filRPyLen    physical EOF of resource fork (LongInt)
     * 44  4     SInt32      filCrDat     date and time of creation (LongInt)
     * 48  4     SInt32      filMdDat     date and time of last modification (LongInt)
     * 52  4     SInt32      filBkDat     date and time of last backup (LongInt)
     * 56  16    FXInfo      filFndrInfo  additional Finder information (FXInfo)
     * 72  2     SInt16      filClpSize   file clump size (Integer)
     * 74  4     ExtDataRec  filExtRec    first data fork extent record (ExtDataRec)
     * 78  4     ExtDataRec  filRExtRec   first resource fork extent record (ExtDataRec)
     * 82  4     SInt32      filResrv     reserved (LongInt)
     */

    
    public static final int STRUCTSIZE = 86;
    
    private final byte[] filFlags = new byte[1];
    private final byte[] filTyp = new byte[1];
    private final FInfo filUsrWds;
    private final byte[] filFlNum = new byte[4];
    private final byte[] filStBlk = new byte[2];
    private final byte[] filLgLen = new byte[4];
    private final byte[] filPyLen = new byte[4];
    private final byte[] filRStBlk = new byte[2];
    private final byte[] filRLgLen = new byte[4];
    private final byte[] filRPyLen = new byte[4];
    private final byte[] filCrDat = new byte[4];
    private final byte[] filMdDat = new byte[4];
    private final byte[] filBkDat = new byte[4];
    private final FXInfo filFndrInfo;
    private final byte[] filClpSize = new byte[2];
    private final ExtDataRec filExtRec;
    private final ExtDataRec filRExtRec;
    private final byte[] filResrv = new byte[4];
    
    public CdrFilRec(byte[] data, int offset) {
        super(data, offset);
	    System.arraycopy(data, offset + 2, filFlags, 0, 1);
        System.arraycopy(data, offset + 3, filTyp, 0, 1);
        filUsrWds = new FInfo(data, offset + 4);
        System.arraycopy(data, offset + 20, filFlNum, 0, 4);
        System.arraycopy(data, offset + 24, filStBlk, 0, 2);
        System.arraycopy(data, offset + 26, filLgLen, 0, 4);
        System.arraycopy(data, offset + 30, filPyLen, 0, 4);
        System.arraycopy(data, offset + 34, filRStBlk, 0, 2);
        System.arraycopy(data, offset + 36, filRLgLen, 0, 4);
        System.arraycopy(data, offset + 40, filRPyLen, 0, 4);
        System.arraycopy(data, offset + 44, filCrDat, 0, 4);
        System.arraycopy(data, offset + 48, filMdDat, 0, 4);
        System.arraycopy(data, offset + 52, filBkDat, 0, 4);
        filFndrInfo = new FXInfo(data, offset + 56);
        System.arraycopy(data, offset + 72, filClpSize, 0, 2);
        filExtRec = new ExtDataRec(data, offset + 74);
        filRExtRec = new ExtDataRec(data, offset + 78);
        System.arraycopy(data, offset + 82, filResrv, 0, 4);
    }
    
    public static int length() { return STRUCTSIZE; }
    
    @Override
    public int size() { return length(); }
    
    /** file flags (SignedByte) */
    public byte getFilFlags() { return Util.readByteBE(filFlags); }
    /** file type (SignedByte) */
    public byte getFilTyp() { return Util.readByteBE(filTyp); }
    /** Finder information (FInfo) */
    public FInfo getFilUsrWds() { return filUsrWds; }
    /** file ID (LongInt) */
    public int getFilFlNum() { return Util.readIntBE(filFlNum); }
    /** first alloc. blk. of data fork (Integer) */
    public short getFilStBlk() { return Util.readShortBE(filStBlk); }
    /** logical EOF of data fork (LongInt) */
    public int getFilLgLen() { return Util.readIntBE(filLgLen); }
    /** physical EOF of data fork (LongInt) */
    public int getFilPyLen() { return Util.readIntBE(filPyLen); }
    /** first alloc. blk. of resource fork (Integer) */
    public short getFilRStBlk() { return Util.readShortBE(filRStBlk); }
    /** logical EOF of resource fork (LongInt) */
    public int getFilRLgLen() { return Util.readIntBE(filRLgLen); }
    /** physical EOF of resource fork (LongInt) */
    public int getFilRPyLen() { return Util.readIntBE(filRPyLen); }
    /** date and time of creation (LongInt) */
    public int getFilCrDat() { return Util.readIntBE(filCrDat); }
    /** date and time of last modification (LongInt) */
    public int getFilMdDat() { return Util.readIntBE(filMdDat); }
    /** date and time of last backup (LongInt) */
    public int getFilBkDat() { return Util.readIntBE(filBkDat); }
    /** additional Finder information (FXInfo) */
    public FXInfo getFilFndrInfo() { return filFndrInfo; }
    /** file clump size (Integer) */
    public short getFilClpSize() { return Util.readShortBE(filClpSize); }
    /** first data fork extent record (ExtDataRec) */
    public ExtDataRec getFilExtRec() { return filExtRec; }
    /** first resource fork extent record (ExtDataRec) */
    public ExtDataRec getFilRExtRec() { return filRExtRec; }
    /** reserved (LongInt) */
    public int getFilResrv() { return Util.readIntBE(filResrv); }
    
    @Override
    public void printFields(PrintStream ps, String prefix) {
        super.printFields(ps, prefix);
        ps.println(prefix + " filFlags: " + getFilFlags());
        ps.println(prefix + " filTyp: " + getFilTyp());
        ps.println(prefix + " filUsrWds: ");
        getFilUsrWds().print(ps, prefix + "  ");
        ps.println(prefix + " filFlNum: " + getFilFlNum());
        ps.println(prefix + " filStBlk: " + getFilStBlk());
        ps.println(prefix + " filLgLen: " + getFilLgLen());
        ps.println(prefix + " filPyLen: " + getFilPyLen());
        ps.println(prefix + " filRStBlk: " + getFilRStBlk());
        ps.println(prefix + " filRLgLen: " + getFilRLgLen());
        ps.println(prefix + " filRPyLen: " + getFilRPyLen());
        ps.println(prefix + " filCrDat: " + getFilCrDat());
        ps.println(prefix + " filMdDat: " + getFilMdDat());
        ps.println(prefix + " filBkDat: " + getFilBkDat());
        ps.println(prefix + " filFndrInfo: ");
        getFilFndrInfo().print(ps, prefix + "  ");
        ps.println(prefix + " filClpSize: " + getFilClpSize());
        ps.println(prefix + " filExtRec: ");
        getFilExtRec().print(ps, prefix + "  ");
        ps.println(prefix + " filRExtRec: ");
        getFilRExtRec().print(ps, prefix + "  ");
        ps.println(prefix + " filResrv: " + getFilResrv());
    }
    
    @Override
    public void print(PrintStream ps, String prefix) {
        ps.println(prefix + "CdrFilRec:");
        printFields(ps, prefix);
    }
    
    @Override
    public byte[] getBytes() {
        byte[] result = new byte[STRUCTSIZE];
        byte[] tempData;
        int offset = 0;

        byte[] superData = super.getBytes();
        System.arraycopy(superData, 0, result, offset, superData.length); offset += superData.length;
        System.arraycopy(filFlags, 0, result, offset, filFlags.length); offset += filFlags.length;
        System.arraycopy(filTyp, 0, result, offset, filTyp.length); offset += filTyp.length;
        tempData = filUsrWds.getBytes();
        System.arraycopy(tempData, 0, result, offset, tempData.length); offset += tempData.length;
        System.arraycopy(filFlNum, 0, result, offset, filFlNum.length); offset += filFlNum.length;
        System.arraycopy(filStBlk, 0, result, offset, filStBlk.length); offset += filStBlk.length;
        System.arraycopy(filLgLen, 0, result, offset, filLgLen.length); offset += filLgLen.length;
        System.arraycopy(filPyLen, 0, result, offset, filPyLen.length); offset += filPyLen.length;
        System.arraycopy(filRStBlk, 0, result, offset, filRStBlk.length); offset += filRStBlk.length;
        System.arraycopy(filRLgLen, 0, result, offset, filRLgLen.length); offset += filRLgLen.length;
        System.arraycopy(filRPyLen, 0, result, offset, filRPyLen.length); offset += filRPyLen.length;
        System.arraycopy(filCrDat, 0, result, offset, filCrDat.length); offset += filCrDat.length;
        System.arraycopy(filMdDat, 0, result, offset, filMdDat.length); offset += filMdDat.length;
        System.arraycopy(filBkDat, 0, result, offset, filBkDat.length); offset += filBkDat.length;
        tempData = filFndrInfo.getBytes();
        System.arraycopy(tempData, 0, result, offset, tempData.length); offset += tempData.length;
        System.arraycopy(filClpSize, 0, result, offset, filClpSize.length); offset += filClpSize.length;
        tempData = filExtRec.getBytes();
        System.arraycopy(tempData, 0, result, offset, tempData.length); offset += tempData.length;
        tempData = filRExtRec.getBytes();
        System.arraycopy(tempData, 0, result, offset, tempData.length); offset += tempData.length;
        System.arraycopy(filResrv, 0, result, offset, filResrv.length); offset += filResrv.length;
        return result;
    }
    
    @Override
    public Dictionary getStructElements() {
        DictionaryBuilder db = new DictionaryBuilder(CdrThdRec.class.getSimpleName());
        
        super.addSuperStructElements(db);
        db.addUIntBE("filFlags", filFlags, "File flags");
        db.addUIntBE("filTyp", filTyp, "File type");
        db.add("filUsrWds", filUsrWds.getStructElements(), "Finder info");
        db.addUIntBE("filFlNum", filFlNum, "File ID");
        db.addUIntBE("filStBlk", filStBlk, "First allocation block in data fork");
        db.addUIntBE("filLgLen", filLgLen, "Logical length of data fork", "bytes");
        db.addUIntBE("filPyLen", filPyLen, "Physical length of data fork", "bytes");
        db.addUIntBE("filRStBlk", filRStBlk, "First allocation block in resource fork");
        db.addUIntBE("filRLgLen", filRLgLen, "Logical length of resource fork", "bytes");
        db.addUIntBE("filRPyLen", filRPyLen, "Physical length of resource fork", "bytes");
        db.add("filCrDat", new HFSDateField(filCrDat), "Creation date");
        db.add("filMdDat", new HFSDateField(filMdDat), "Modify date");
        db.add("filBkDat", new HFSDateField(filBkDat), "Backup date");
        db.add("filFndrInfo", filFndrInfo.getStructElements(), "Extended Finder info");
        db.addUIntBE("filClpSize", filClpSize, "File clump size");
        db.add("filExtRec", filExtRec.getStructElements(), "First data fork extent record");
        db.add("filRExtRec", filRExtRec.getStructElements(), "First resource fork extent record");
        db.addUIntBE("filResrv", filResrv, "Reserved", HEXADECIMAL);
        
        return db.getResult();
    }
}
