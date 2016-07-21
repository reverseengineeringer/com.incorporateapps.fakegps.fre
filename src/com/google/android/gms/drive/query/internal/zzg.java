package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.zzb;
import com.google.android.gms.drive.query.Filter;
import java.util.List;

public class zzg
  implements zzf
{
  private Boolean zzaut = Boolean.valueOf(false);
  
  public static boolean zza(Filter paramFilter)
  {
    if (paramFilter == null) {
      return false;
    }
    return ((Boolean)paramFilter.zza(new zzg())).booleanValue();
  }
  
  public Boolean zzc(zzb paramzzb, Object paramObject)
  {
    return zzaut;
  }
  
  public Boolean zzc(Operator paramOperator, MetadataField paramMetadataField, Object paramObject)
  {
    return zzaut;
  }
  
  public Boolean zzc(Operator paramOperator, List paramList)
  {
    return zzaut;
  }
  
  public Boolean zzd(Boolean paramBoolean)
  {
    return zzaut;
  }
  
  public Boolean zzdk(String paramString)
  {
    if (!paramString.isEmpty()) {
      zzaut = Boolean.valueOf(true);
    }
    return zzaut;
  }
  
  public Boolean zzf(MetadataField paramMetadataField)
  {
    return zzaut;
  }
  
  public Boolean zzf(MetadataField paramMetadataField, Object paramObject)
  {
    return zzaut;
  }
  
  public Boolean zztR()
  {
    return zzaut;
  }
  
  public Boolean zztS()
  {
    return zzaut;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.query.internal.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */