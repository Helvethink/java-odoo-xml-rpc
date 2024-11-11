
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

package ch.helvethink.odoo4java.test.ng.project;

import java.util.List;
import ch.helvethink.odoo4java.test.ng.project.Project;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.project.ProjectTask;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("project.tags")
public class ProjectTags implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private int color;

    
    private String name;

    
    private int id;

    
    private List<ProjectTask> taskIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectTask")
        @OdooModel("project.ProjectTask")
    
    private List<Integer> taskIds;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Date createDate;

    
    private List<Project> projectIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.Project")
        @OdooModel("project.Project")
    
    private List<Integer> projectIds;


    public ProjectTags() {
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

    public int getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<ProjectTask> getTaskIdsAsList() {
        return taskIdsAsList;
    }

    public List<Integer> getTaskIds() {
        return taskIds;
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

    public List<Project> getProjectIdsAsList() {
        return projectIdsAsList;
    }

    public List<Integer> getProjectIds() {
        return projectIds;
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

    public void setColor(int color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTaskIdsAsList(List<ProjectTask> taskIdsAsList) {
        this.taskIdsAsList = taskIdsAsList;
    }

    public void setTaskIds(List<Integer> taskIds) {
        this.taskIds = taskIds;
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

    public void setProjectIdsAsList(List<Project> projectIdsAsList) {
        this.projectIdsAsList = projectIdsAsList;
    }

    public void setProjectIds(List<Integer> projectIds) {
        this.projectIds = projectIds;
    }



}