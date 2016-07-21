package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class ComparisonFilter
  extends AbstractFilter
{
  public static final zza CREATOR = new zza();
  final int mVersionCode;
  final Operator zzaug;
  final MetadataBundle zzauh;
  final MetadataField zzaui;
  
  ComparisonFilter(int paramInt, Operator paramOperator, MetadataBundle paramMetadataBundle)
  {
    mVersionCode = paramInt;
    zzaug = paramOperator;
    zzauh = paramMetadataBundle;
    zzaui = zze.zza(paramMetadataBundle);
  }
  
  public ComparisonFilter(Operator paramOperator, SearchableMetadataField paramSearchableMetadataField, Object paramObject)
  {
    this(1, paramOperator, MetadataBundle.zzb(paramSearchableMetadataField, paramObject));
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
    zza.zza(this, paramParcel, paramInt);
  }
  
  public Object zza(zzf paramzzf)
  {
    return paramzzf.zzb(zzaug, zzaui, getValue());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.query.internal.ComparisonFilter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */