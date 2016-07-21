package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.people.Person.Cover.CoverInfo;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class PersonEntity$CoverEntity$CoverInfoEntity
  extends FastSafeParcelableJsonResponse
  implements Person.Cover.CoverInfo
{
  public static final zzd CREATOR = new zzd();
  private static final HashMap zzbeM;
  final int mVersionCode;
  final Set zzbeN;
  int zzbgj;
  int zzbgk;
  
  static
  {
    HashMap localHashMap = new HashMap();
    zzbeM = localHashMap;
    localHashMap.put("leftImageOffset", FastJsonResponse.Field.zzi("leftImageOffset", 2));
    zzbeM.put("topImageOffset", FastJsonResponse.Field.zzi("topImageOffset", 3));
  }
  
  public PersonEntity$CoverEntity$CoverInfoEntity()
  {
    mVersionCode = 1;
    zzbeN = new HashSet();
  }
  
  PersonEntity$CoverEntity$CoverInfoEntity(Set paramSet, int paramInt1, int paramInt2, int paramInt3)
  {
    zzbeN = paramSet;
    mVersionCode = paramInt1;
    zzbgj = paramInt2;
    zzbgk = paramInt3;
  }
  
  public final int describeContents()
  {
    zzd localzzd = CREATOR;
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof CoverInfoEntity)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    paramObject = (CoverInfoEntity)paramObject;
    Iterator localIterator = zzbeM.values().iterator();
    while (localIterator.hasNext())
    {
      FastJsonResponse.Field localField = (FastJsonResponse.Field)localIterator.next();
      if (zza(localField))
      {
        if (((CoverInfoEntity)paramObject).zza(localField))
        {
          if (!zzb(localField).equals(((CoverInfoEntity)paramObject).zzb(localField))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (((CoverInfoEntity)paramObject).zza(localField)) {
        return false;
      }
    }
    return true;
  }
  
  public final int getLeftImageOffset()
  {
    return zzbgj;
  }
  
  public final int getTopImageOffset()
  {
    return zzbgk;
  }
  
  public final boolean hasLeftImageOffset()
  {
    return zzbeN.contains(Integer.valueOf(2));
  }
  
  public final boolean hasTopImageOffset()
  {
    return zzbeN.contains(Integer.valueOf(3));
  }
  
  public final int hashCode()
  {
    Iterator localIterator = zzbeM.values().iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      FastJsonResponse.Field localField = (FastJsonResponse.Field)localIterator.next();
      if (!zza(localField)) {
        break label68;
      }
      int j = localField.zzrs();
      i = zzb(localField).hashCode() + (i + j);
    }
    label68:
    for (;;)
    {
      break;
      return i;
    }
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd localzzd = CREATOR;
    zzd.zza(this, paramParcel, paramInt);
  }
  
  public final HashMap zzFl()
  {
    return zzbeM;
  }
  
  public final CoverInfoEntity zzFs()
  {
    return this;
  }
  
  protected final boolean zza(FastJsonResponse.Field paramField)
  {
    return zzbeN.contains(Integer.valueOf(paramField.zzrs()));
  }
  
  protected final Object zzb(FastJsonResponse.Field paramField)
  {
    switch (paramField.zzrs())
    {
    default: 
      throw new IllegalStateException("Unknown safe parcelable id=" + paramField.zzrs());
    case 2: 
      return Integer.valueOf(zzbgj);
    }
    return Integer.valueOf(zzbgk);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.internal.model.people.PersonEntity.CoverEntity.CoverInfoEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */