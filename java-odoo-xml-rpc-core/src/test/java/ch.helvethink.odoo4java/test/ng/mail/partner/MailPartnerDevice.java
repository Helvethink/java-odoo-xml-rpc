
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

package ch.helvethink.odoo4java.test.ng.mail.partner;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("mail.partner.device")
public class MailPartnerDevice implements OdooObj {

    
    private Date writeDate;

    
    private String endpoint;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private String keys;

    
    private Date expirationTime;

    
    private int id;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Date createDate;


    public MailPartnerDevice() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public String getKeys() {
        return keys;
    }

    public Date getExpirationTime() {
        return expirationTime;
    }

    public int getId() {
        return id;
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

    public Date getCreateDate() {
        return createDate;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }

    public void setExpirationTime(Date expirationTime) {
        this.expirationTime = expirationTime;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}