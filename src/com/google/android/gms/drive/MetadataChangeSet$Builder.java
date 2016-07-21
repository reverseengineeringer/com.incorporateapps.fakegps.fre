package com.google.android.gms.drive;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.zznm;
import com.google.android.gms.internal.zzno;
import java.util.Date;

public class MetadataChangeSet$Builder
{
  private final MetadataBundle zzape = MetadataBundle.zztE();
  private AppVisibleCustomProperties.zza zzapf;
  
  private int zzda(String paramString)
  {
    if (paramString == null) {
      return 0;
    }
    return paramString.getBytes().length;
  }
  
  private String zzj(String paramString, int paramInt1, int paramInt2)
  {
    return String.format("%s must be no more than %d bytes, but is %d bytes.", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
  
  private void zzk(String paramString, int paramInt1, int paramInt2)
  {
    if (paramInt2 <= paramInt1) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, zzj(paramString, paramInt1, paramInt2));
      return;
    }
  }
  
  private AppVisibleCustomProperties.zza zzsN()
  {
    if (zzapf == null) {
      zzapf = new AppVisibleCustomProperties.zza();
    }
    return zzapf;
  }
  
  public MetadataChangeSet build()
  {
    if (zzapf != null) {
      zzape.zzc(zznm.zzasW, zzapf.zztA());
    }
    return new MetadataChangeSet(zzape);
  }
  
  public Builder deleteCustomProperty(CustomPropertyKey paramCustomPropertyKey)
  {
    zzx.zzb(paramCustomPropertyKey, "key");
    zzsN().zza(paramCustomPropertyKey, null);
    return this;
  }
  
  public Builder setCustomProperty(CustomPropertyKey paramCustomPropertyKey, String paramString)
  {
    zzx.zzb(paramCustomPropertyKey, "key");
    zzx.zzb(paramString, "value");
    zzk("The total size of key string and value string of a custom property", 124, zzda(paramCustomPropertyKey.getKey()) + zzda(paramString));
    zzsN().zza(paramCustomPropertyKey, paramString);
    return this;
  }
  
  public Builder setDescription(String paramString)
  {
    zzape.zzc(zznm.zzasX, paramString);
    return this;
  }
  
  public Builder setIndexableText(String paramString)
  {
    zzk("Indexable text size", 131072, zzda(paramString));
    zzape.zzc(zznm.zzatd, paramString);
    return this;
  }
  
  public Builder setLastViewedByMeDate(Date paramDate)
  {
    zzape.zzc(zzno.zzatN, paramDate);
    return this;
  }
  
  public Builder setMimeType(String paramString)
  {
    zzape.zzc(zznm.zzatr, paramString);
    return this;
  }
  
  public Builder setPinned(boolean paramBoolean)
  {
    zzape.zzc(zznm.zzatj, Boolean.valueOf(paramBoolean));
    return this;
  }
  
  public Builder setStarred(boolean paramBoolean)
  {
    zzape.zzc(zznm.zzaty, Boolean.valueOf(paramBoolean));
    return this;
  }
  
  public Builder setTitle(String paramString)
  {
    zzape.zzc(zznm.zzatA, paramString);
    return this;
  }
  
  public Builder setViewed(boolean paramBoolean)
  {
    zzape.zzc(zznm.zzatq, Boolean.valueOf(paramBoolean));
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.MetadataChangeSet.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */