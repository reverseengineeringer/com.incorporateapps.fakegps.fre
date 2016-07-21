package com.google.android.gms.drive;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.zznm;
import com.google.android.gms.internal.zzno;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

public final class MetadataChangeSet
{
  public static final int CUSTOM_PROPERTY_SIZE_LIMIT_BYTES = 124;
  public static final int INDEXABLE_TEXT_SIZE_LIMIT_BYTES = 131072;
  public static final int MAX_PRIVATE_PROPERTIES_PER_RESOURCE_PER_APP = 30;
  public static final int MAX_PUBLIC_PROPERTIES_PER_RESOURCE = 30;
  public static final int MAX_TOTAL_PROPERTIES_PER_RESOURCE = 100;
  public static final MetadataChangeSet zzapd = new MetadataChangeSet(MetadataBundle.zztE());
  private final MetadataBundle zzape;
  
  public MetadataChangeSet(MetadataBundle paramMetadataBundle)
  {
    zzape = paramMetadataBundle.zztF();
  }
  
  public final Map getCustomPropertyChangeMap()
  {
    AppVisibleCustomProperties localAppVisibleCustomProperties = (AppVisibleCustomProperties)zzape.zza(zznm.zzasW);
    if (localAppVisibleCustomProperties == null) {
      return Collections.emptyMap();
    }
    return localAppVisibleCustomProperties.zztz();
  }
  
  public final String getDescription()
  {
    return (String)zzape.zza(zznm.zzasX);
  }
  
  public final String getIndexableText()
  {
    return (String)zzape.zza(zznm.zzatd);
  }
  
  public final Date getLastViewedByMeDate()
  {
    return (Date)zzape.zza(zzno.zzatN);
  }
  
  public final String getMimeType()
  {
    return (String)zzape.zza(zznm.zzatr);
  }
  
  public final String getTitle()
  {
    return (String)zzape.zza(zznm.zzatA);
  }
  
  public final Boolean isPinned()
  {
    return (Boolean)zzape.zza(zznm.zzatj);
  }
  
  public final Boolean isStarred()
  {
    return (Boolean)zzape.zza(zznm.zzaty);
  }
  
  public final Boolean isViewed()
  {
    return (Boolean)zzape.zza(zznm.zzatq);
  }
  
  public final MetadataChangeSet zza(MetadataField paramMetadataField, Object paramObject)
  {
    MetadataChangeSet localMetadataChangeSet = zzsM();
    localMetadataChangeSet.zzsL().zzc(paramMetadataField, paramObject);
    return localMetadataChangeSet;
  }
  
  public final MetadataBundle zzsL()
  {
    return zzape;
  }
  
  public final MetadataChangeSet zzsM()
  {
    return new MetadataChangeSet(zzsL());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.MetadataChangeSet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */