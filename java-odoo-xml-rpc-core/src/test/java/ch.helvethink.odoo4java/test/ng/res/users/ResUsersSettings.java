
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

package ch.helvethink.odoo4java.test.ng.res.users;

import ch.helvethink.odoo4java.test.ng.res.users.settings.ResUsersSettingsVolumes;
import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("res.users.settings")
public class ResUsersSettings implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private boolean isUsePushToTalk;

    
    private List<ResUsersSettingsVolumes> volumeSettingsIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.users.settings.ResUsersSettingsVolumes")
        @OdooModel("res.users.settings.ResUsersSettingsVolumes")
    
    private List<Integer> volumeSettingsIds;

    
    private String pushToTalkKey;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private int voiceActiveDuration;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private boolean isIsDiscussSidebarCategoryChannelOpen;

    
    private int id;

    
    private Date createDate;

    
    private boolean isIsDiscussSidebarCategoryChatOpen;


    public ResUsersSettings() {
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

    public boolean getIsUsePushToTalk() {
        return isUsePushToTalk;
    }

    public List<ResUsersSettingsVolumes> getVolumeSettingsIdsAsList() {
        return volumeSettingsIdsAsList;
    }

    public List<Integer> getVolumeSettingsIds() {
        return volumeSettingsIds;
    }

    public String getPushToTalkKey() {
        return pushToTalkKey;
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

    public int getVoiceActiveDuration() {
        return voiceActiveDuration;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public boolean getIsIsDiscussSidebarCategoryChannelOpen() {
        return isIsDiscussSidebarCategoryChannelOpen;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public boolean getIsIsDiscussSidebarCategoryChatOpen() {
        return isIsDiscussSidebarCategoryChatOpen;
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

    public void setIsUsePushToTalk(boolean isUsePushToTalk) {
        this.isUsePushToTalk = isUsePushToTalk;
    }

    public void setVolumeSettingsIdsAsList(List<ResUsersSettingsVolumes> volumeSettingsIdsAsList) {
        this.volumeSettingsIdsAsList = volumeSettingsIdsAsList;
    }

    public void setVolumeSettingsIds(List<Integer> volumeSettingsIds) {
        this.volumeSettingsIds = volumeSettingsIds;
    }

    public void setPushToTalkKey(String pushToTalkKey) {
        this.pushToTalkKey = pushToTalkKey;
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

    public void setVoiceActiveDuration(int voiceActiveDuration) {
        this.voiceActiveDuration = voiceActiveDuration;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setIsIsDiscussSidebarCategoryChannelOpen(boolean isIsDiscussSidebarCategoryChannelOpen) {
        this.isIsDiscussSidebarCategoryChannelOpen = isIsDiscussSidebarCategoryChannelOpen;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setIsIsDiscussSidebarCategoryChatOpen(boolean isIsDiscussSidebarCategoryChatOpen) {
        this.isIsDiscussSidebarCategoryChatOpen = isIsDiscussSidebarCategoryChatOpen;
    }



}