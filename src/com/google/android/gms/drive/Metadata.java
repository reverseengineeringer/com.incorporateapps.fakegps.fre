package com.google.android.gms.drive;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.internal.zznm;
import com.google.android.gms.internal.zzno;
import com.google.android.gms.internal.zznq;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

public abstract class Metadata
  implements Freezable
{
  public static final int CONTENT_AVAILABLE_LOCALLY = 1;
  public static final int CONTENT_NOT_AVAILABLE_LOCALLY = 0;
  
  public String getAlternateLink()
  {
    return (String)zza(zznm.zzasV);
  }
  
  public int getContentAvailability()
  {
    Integer localInteger = (Integer)zza(zznq.zzatT);
    if (localInteger == null) {
      return 0;
    }
    return localInteger.intValue();
  }
  
  public Date getCreatedDate()
  {
    return (Date)zza(zzno.zzatM);
  }
  
  public Map getCustomProperties()
  {
    AppVisibleCustomProperties localAppVisibleCustomProperties = (AppVisibleCustomProperties)zza(zznm.zzasW);
    if (localAppVisibleCustomProperties == null) {
      return Collections.emptyMap();
    }
    return localAppVisibleCustomProperties.zztz();
  }
  
  public String getDescription()
  {
    return (String)zza(zznm.zzasX);
  }
  
  public DriveId getDriveId()
  {
    return (DriveId)zza(zznm.zzasU);
  }
  
  public String getEmbedLink()
  {
    return (String)zza(zznm.zzasY);
  }
  
  public String getFileExtension()
  {
    return (String)zza(zznm.zzasZ);
  }
  
  public long getFileSize()
  {
    return ((Long)zza(zznm.zzata)).longValue();
  }
  
  public Date getLastViewedByMeDate()
  {
    return (Date)zza(zzno.zzatN);
  }
  
  public String getMimeType()
  {
    return (String)zza(zznm.zzatr);
  }
  
  public Date getModifiedByMeDate()
  {
    return (Date)zza(zzno.zzatP);
  }
  
  public Date getModifiedDate()
  {
    return (Date)zza(zzno.zzatO);
  }
  
  public String getOriginalFilename()
  {
    return (String)zza(zznm.zzats);
  }
  
  public long getQuotaBytesUsed()
  {
    return ((Long)zza(zznm.zzatx)).longValue();
  }
  
  public Date getSharedWithMeDate()
  {
    return (Date)zza(zzno.zzatQ);
  }
  
  public String getTitle()
  {
    return (String)zza(zznm.zzatA);
  }
  
  public String getWebContentLink()
  {
    return (String)zza(zznm.zzatC);
  }
  
  public String getWebViewLink()
  {
    return (String)zza(zznm.zzatD);
  }
  
  public boolean isEditable()
  {
    Boolean localBoolean = (Boolean)zza(zznm.zzatg);
    if (localBoolean == null) {
      return false;
    }
    return localBoolean.booleanValue();
  }
  
  public boolean isExplicitlyTrashed()
  {
    Boolean localBoolean = (Boolean)zza(zznm.zzath);
    if (localBoolean == null) {
      return false;
    }
    return localBoolean.booleanValue();
  }
  
  public boolean isFolder()
  {
    return "application/vnd.google-apps.folder".equals(getMimeType());
  }
  
  public boolean isInAppFolder()
  {
    Boolean localBoolean = (Boolean)zza(zznm.zzate);
    if (localBoolean == null) {
      return false;
    }
    return localBoolean.booleanValue();
  }
  
  public boolean isPinnable()
  {
    Boolean localBoolean = (Boolean)zza(zznq.zzatU);
    if (localBoolean == null) {
      return false;
    }
    return localBoolean.booleanValue();
  }
  
  public boolean isPinned()
  {
    Boolean localBoolean = (Boolean)zza(zznm.zzatj);
    if (localBoolean == null) {
      return false;
    }
    return localBoolean.booleanValue();
  }
  
  public boolean isRestricted()
  {
    Boolean localBoolean = (Boolean)zza(zznm.zzatl);
    if (localBoolean == null) {
      return false;
    }
    return localBoolean.booleanValue();
  }
  
  public boolean isShared()
  {
    Boolean localBoolean = (Boolean)zza(zznm.zzatm);
    if (localBoolean == null) {
      return false;
    }
    return localBoolean.booleanValue();
  }
  
  public boolean isStarred()
  {
    Boolean localBoolean = (Boolean)zza(zznm.zzaty);
    if (localBoolean == null) {
      return false;
    }
    return localBoolean.booleanValue();
  }
  
  public boolean isTrashable()
  {
    Boolean localBoolean = (Boolean)zza(zznm.zzatp);
    if (localBoolean == null) {
      return true;
    }
    return localBoolean.booleanValue();
  }
  
  public boolean isTrashed()
  {
    Boolean localBoolean = (Boolean)zza(zznm.zzatB);
    if (localBoolean == null) {
      return false;
    }
    return localBoolean.booleanValue();
  }
  
  public boolean isViewed()
  {
    Boolean localBoolean = (Boolean)zza(zznm.zzatq);
    if (localBoolean == null) {
      return false;
    }
    return localBoolean.booleanValue();
  }
  
  public abstract Object zza(MetadataField paramMetadataField);
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.Metadata
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */