
/*
 * MIT License
 *
 * Copyright (c) 2024 Helvethink
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package ch.helvethink.odoo4java.test.ng.ir.model;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.ir.IrModel;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.res.ResGroups;;

@OdooObject("ir.model.access")
public class IrModelAccess implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private boolean isActive;

    
    private IrModel modelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId modelId;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private ResGroups groupIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResGroups")
        @OdooModel("res.ResGroups")
    
    private OdooId groupId;

    
    private String name;

    
    private boolean isPermRead;

    
    private boolean isPermUnlink;

    
    private int id;

    
    private Date createDate;

    
    private boolean isPermWrite;

    
    private boolean isPermCreate;


    public IrModelAccess() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public IrModel getModelIdAsObject() {
        return modelIdAsObject;
    }

    public OdooId getModelId() {
        return modelId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public ResUsers getCreateUidAsObject() {
        return createUidAsObject;
    }

    public OdooId getCreateUid() {
        return createUid;
    }

    public ResGroups getGroupIdAsObject() {
        return groupIdAsObject;
    }

    public OdooId getGroupId() {
        return groupId;
    }

    public String getName() {
        return name;
    }

    public boolean getIsPermRead() {
        return isPermRead;
    }

    public boolean getIsPermUnlink() {
        return isPermUnlink;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public boolean getIsPermWrite() {
        return isPermWrite;
    }

    public boolean getIsPermCreate() {
        return isPermCreate;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setModelIdAsObject(IrModel modelIdAsObject) {
        this.modelIdAsObject = modelIdAsObject;
    }

    public void setModelId(OdooId modelId) {
        this.modelId = modelId;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setCreateUidAsObject(ResUsers createUidAsObject) {
        this.createUidAsObject = createUidAsObject;
    }

    public void setCreateUid(OdooId createUid) {
        this.createUid = createUid;
    }

    public void setGroupIdAsObject(ResGroups groupIdAsObject) {
        this.groupIdAsObject = groupIdAsObject;
    }

    public void setGroupId(OdooId groupId) {
        this.groupId = groupId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsPermRead(boolean isPermRead) {
        this.isPermRead = isPermRead;
    }

    public void setIsPermUnlink(boolean isPermUnlink) {
        this.isPermUnlink = isPermUnlink;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setIsPermWrite(boolean isPermWrite) {
        this.isPermWrite = isPermWrite;
    }

    public void setIsPermCreate(boolean isPermCreate) {
        this.isPermCreate = isPermCreate;
    }



}