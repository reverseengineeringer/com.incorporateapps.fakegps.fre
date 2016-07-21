package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class HasFilter
  extends AbstractFilter
{
  public static final zzi CREATOR = new zzi();
  final int mVersionCode;
  final MetadataBundle zzauh;
  final MetadataField zzaui;
  
  HasFilter(int paramInt, MetadataBundle paramMetadataBundle)
  {
    mVersionCode = paramInt;
    zzauh = paramMetadataBundle;
    zzaui = zze.zza(paramMetadataBundle);
  }
  
  public HasFilter(SearchableMetadataField paramSearchableMetadataField, Object paramObject)
  {
    this(1, MetadataBundle.zzb(paramSearchableMetadataField, paramObject));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Object getValue()
  {
    return zzauh.zza(zzaui);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzi.zza(this, paramParcel, paramInt);
  }
  
  public Object zza(zzf paramzzf)
  {
    return paramzzf.zze(zzaui, getValue());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.query.internal.HasFilter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */