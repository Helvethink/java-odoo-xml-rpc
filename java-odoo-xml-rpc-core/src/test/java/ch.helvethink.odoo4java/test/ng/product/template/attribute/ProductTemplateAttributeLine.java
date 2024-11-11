
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

package ch.helvethink.odoo4java.test.ng.product.template.attribute;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.product.attribute.ProductAttributeValue;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.product.ProductAttribute;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.product.template.attribute.ProductTemplateAttributeValue;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.product.ProductTemplate;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("product.template.attribute.line")
public class ProductTemplateAttributeLine implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private boolean isActive;

    
    private List<ProductAttributeValue> valueIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.attribute.ProductAttributeValue")
        @OdooModel("product.attribute.ProductAttributeValue")
    
    private List<Integer> valueIds;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private ProductTemplate productTmplIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductTemplate")
        @OdooModel("product.ProductTemplate")
    
    private OdooId productTmplId;

    
    private int sequence;

    
    private ProductAttribute attributeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductAttribute")
        @OdooModel("product.ProductAttribute")
    
    private OdooId attributeId;

    
    private List<ProductTemplateAttributeValue> productTemplateValueIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.template.attribute.ProductTemplateAttributeValue")
        @OdooModel("product.template.attribute.ProductTemplateAttributeValue")
    
    private List<Integer> productTemplateValueIds;

    
    private int id;

    
    private Date createDate;

    
    private int valueCount;


    public ProductTemplateAttributeLine() {
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

    public List<ProductAttributeValue> getValueIdsAsList() {
        return valueIdsAsList;
    }

    public List<Integer> getValueIds() {
        return valueIds;
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

    public ProductTemplate getProductTmplIdAsObject() {
        return productTmplIdAsObject;
    }

    public OdooId getProductTmplId() {
        return productTmplId;
    }

    public int getSequence() {
        return sequence;
    }

    public ProductAttribute getAttributeIdAsObject() {
        return attributeIdAsObject;
    }

    public OdooId getAttributeId() {
        return attributeId;
    }

    public List<ProductTemplateAttributeValue> getProductTemplateValueIdsAsList() {
        return productTemplateValueIdsAsList;
    }

    public List<Integer> getProductTemplateValueIds() {
        return productTemplateValueIds;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public int getValueCount() {
        return valueCount;
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

    public void setValueIdsAsList(List<ProductAttributeValue> valueIdsAsList) {
        this.valueIdsAsList = valueIdsAsList;
    }

    public void setValueIds(List<Integer> valueIds) {
        this.valueIds = valueIds;
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

    public void setProductTmplIdAsObject(ProductTemplate productTmplIdAsObject) {
        this.productTmplIdAsObject = productTmplIdAsObject;
    }

    public void setProductTmplId(OdooId productTmplId) {
        this.productTmplId = productTmplId;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setAttributeIdAsObject(ProductAttribute attributeIdAsObject) {
        this.attributeIdAsObject = attributeIdAsObject;
    }

    public void setAttributeId(OdooId attributeId) {
        this.attributeId = attributeId;
    }

    public void setProductTemplateValueIdsAsList(List<ProductTemplateAttributeValue> productTemplateValueIdsAsList) {
        this.productTemplateValueIdsAsList = productTemplateValueIdsAsList;
    }

    public void setProductTemplateValueIds(List<Integer> productTemplateValueIds) {
        this.productTemplateValueIds = productTemplateValueIds;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setValueCount(int valueCount) {
        this.valueCount = valueCount;
    }



}