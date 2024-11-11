
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

package ch.helvethink.odoo4java.test.ng.resource;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.resource.calendar.ResourceCalendarLeaves;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.resource.calendar.ResourceCalendarAttendance;;

@OdooObject("resource.calendar")
public class ResourceCalendar implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private boolean isTwoWeeksCalendar;

    
    private double hoursPerDay;

    
    private Object tz;

    
    private boolean isActive;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private int associatedLeavesCount;

    
    private String twoWeeksExplanation;

    
    private List<ResourceCalendarAttendance> attendanceIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.resource.calendar.ResourceCalendarAttendance")
        @OdooModel("resource.calendar.ResourceCalendarAttendance")
    
    private List<Integer> attendanceIds;

    
    private String tzOffset;

    
    private String name;

    
    private List<ResourceCalendarLeaves> leaveIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.resource.calendar.ResourceCalendarLeaves")
        @OdooModel("resource.calendar.ResourceCalendarLeaves")
    
    private List<Integer> leaveIds;

    
    private int contractsCount;

    
    private int id;

    
    private Date createDate;

    
    private List<ResourceCalendarLeaves> globalLeaveIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.resource.calendar.ResourceCalendarLeaves")
        @OdooModel("resource.calendar.ResourceCalendarLeaves")
    
    private List<Integer> globalLeaveIds;


    public ResourceCalendar() {
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

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public boolean getIsTwoWeeksCalendar() {
        return isTwoWeeksCalendar;
    }

    public double getHoursPerDay() {
        return hoursPerDay;
    }

    public Object getTz() {
        return tz;
    }

    public boolean getIsActive() {
        return isActive;
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

    public int getAssociatedLeavesCount() {
        return associatedLeavesCount;
    }

    public String getTwoWeeksExplanation() {
        return twoWeeksExplanation;
    }

    public List<ResourceCalendarAttendance> getAttendanceIdsAsList() {
        return attendanceIdsAsList;
    }

    public List<Integer> getAttendanceIds() {
        return attendanceIds;
    }

    public String getTzOffset() {
        return tzOffset;
    }

    public String getName() {
        return name;
    }

    public List<ResourceCalendarLeaves> getLeaveIdsAsList() {
        return leaveIdsAsList;
    }

    public List<Integer> getLeaveIds() {
        return leaveIds;
    }

    public int getContractsCount() {
        return contractsCount;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public List<ResourceCalendarLeaves> getGlobalLeaveIdsAsList() {
        return globalLeaveIdsAsList;
    }

    public List<Integer> getGlobalLeaveIds() {
        return globalLeaveIds;
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

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setIsTwoWeeksCalendar(boolean isTwoWeeksCalendar) {
        this.isTwoWeeksCalendar = isTwoWeeksCalendar;
    }

    public void setHoursPerDay(double hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
    }

    public void setTz(Object tz) {
        this.tz = tz;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
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

    public void setAssociatedLeavesCount(int associatedLeavesCount) {
        this.associatedLeavesCount = associatedLeavesCount;
    }

    public void setTwoWeeksExplanation(String twoWeeksExplanation) {
        this.twoWeeksExplanation = twoWeeksExplanation;
    }

    public void setAttendanceIdsAsList(List<ResourceCalendarAttendance> attendanceIdsAsList) {
        this.attendanceIdsAsList = attendanceIdsAsList;
    }

    public void setAttendanceIds(List<Integer> attendanceIds) {
        this.attendanceIds = attendanceIds;
    }

    public void setTzOffset(String tzOffset) {
        this.tzOffset = tzOffset;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLeaveIdsAsList(List<ResourceCalendarLeaves> leaveIdsAsList) {
        this.leaveIdsAsList = leaveIdsAsList;
    }

    public void setLeaveIds(List<Integer> leaveIds) {
        this.leaveIds = leaveIds;
    }

    public void setContractsCount(int contractsCount) {
        this.contractsCount = contractsCount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setGlobalLeaveIdsAsList(List<ResourceCalendarLeaves> globalLeaveIdsAsList) {
        this.globalLeaveIdsAsList = globalLeaveIdsAsList;
    }

    public void setGlobalLeaveIds(List<Integer> globalLeaveIds) {
        this.globalLeaveIds = globalLeaveIds;
    }



}