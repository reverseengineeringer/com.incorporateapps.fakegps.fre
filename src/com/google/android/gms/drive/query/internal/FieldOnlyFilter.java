package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class FieldOnlyFilter
  extends AbstractFilter
{
  public static final Parcelable.Creator CREATOR = new zzb();
  final int mVersionCode;
  final MetadataBundle zzauh;
  private final MetadataField zzaui;
  
  FieldOnlyFilter(int paramInt, MetadataBundle paramMetadataBundle)
  {
    mVersionCode = paramInt;
    zzauh = paramMetadataBundle;
    zzaui = zze.zza(paramMetadataBundle);
  }
  
  public FieldOnlyFilter(SearchableMetadataField paramSearchableMetadataField)
  {
    this(1, MetadataBundle.zzb(paramSearchableMetadataField, null));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public Object zza(zzf paramzzf)
  {
    return paramzzf.zze(zzaui);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.query.internal.FieldOnlyFilter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */