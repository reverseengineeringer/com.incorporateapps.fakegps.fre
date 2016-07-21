package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.zzb;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class InFilter
  extends AbstractFilter
{
  public static final zzj CREATOR = new zzj();
  final int mVersionCode;
  final MetadataBundle zzauh;
  private final zzb zzauu;
  
  InFilter(int paramInt, MetadataBundle paramMetadataBundle)
  {
    mVersionCode = paramInt;
    zzauh = paramMetadataBundle;
    zzauu = ((zzb)zze.zza(paramMetadataBundle));
  }
  
  public InFilter(SearchableCollectionMetadataField paramSearchableCollectionMetadataField, Object paramObject)
  {
    this(1, MetadataBundle.zzb(paramSearchableCollectionMetadataField, Collections.singleton(paramObject)));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Object getValue()
  {
    return ((Collection)zzauh.zza(zzauu)).iterator().next();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
  
  public Object zza(zzf paramzzf)
  {
    return paramzzf.zzb(zzauu, getValue());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.query.internal.InFilter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */