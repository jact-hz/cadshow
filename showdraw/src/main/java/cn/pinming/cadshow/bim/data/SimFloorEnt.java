package cn.pinming.cadshow.bim.data;

import com.weqia.data.UtilData;
import com.weqia.utils.annotation.sqlite.Id;
import com.weqia.utils.annotation.sqlite.Table;

/**
 * Created by berwin on 2017/3/17.
 */

@Table(name = "SimFloorEnt_1")
public class SimFloorEnt extends UtilData {
    private @Id int id;
    private int objid;
    private int tag;
    private byte[] entinfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getObjid() {
        return objid;
    }

    public void setObjid(int objid) {
        this.objid = objid;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public byte[] getEntinfo() {
        return entinfo;
    }

    public void setEntinfo(byte[] entinfo) {
        this.entinfo = entinfo;
    }
}
