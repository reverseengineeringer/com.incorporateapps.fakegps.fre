package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.people.Person.AgeRange;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class PersonEntity$AgeRangeEntity
  extends FastSafeParcelableJsonResponse
  implements Person.AgeRange
{
  public static final zzb CREATOR = new zzb();
  private static final HashMap zzbeM;
  final int mVersionCode;
  final Set zzbeN;
  int zzbge;
  int zzbgf;
  
  static
  {
    HashMap localHashMap = new HashMap();
    zzbeM = localHashMap;
    localHashMap.put("max", FastJsonResponse.Field.zzi("max", 2));
    zzbeM.put("min", FastJsonResponse.Field.zzi("min", 3));
  }
  
  public PersonEntity$AgeRangeEntity()
  {
    mVersionCode = 1;
    zzbeN = new HashSet();
  }
  
  PersonEntity$AgeRangeEntity(Set paramSet, int paramInt1, int paramInt2, int paramInt3)
  {
    zzbeN = paramSet;
    mVersionCode = paramInt1;
    zzbge = paramInt2;
    zzbgf = paramInt3;
  }
  
  public final int describeContents()
  {
    zzb localzzb = CREATOR;
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof AgeRangeEntity)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    paramObject = (AgeRangeEntity)paramObject;
    Iterator localIterator = zzbeM.values().iterator();
    while (localIterator.hasNext())
    {
      FastJsonResponse.Field localField = (FastJsonResponse.Field)localIterator.next();
      if (zza(localField))
      {
        if (((AgeRangeEntity)paramObject).zza(localField))
        {
          if (!zzb(localField).equals(((AgeRangeEntity)paramObject).zzb(localField))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (((AgeRangeEntity)paramObject).zza(localField)) {
        return false;
      }
    }
    return true;
  }
  
  public final int getMax()
  {
    return zzbge;
  }
  
  public final int getMin()
  {
    return zzbgf;
  }
  
  public final boolean hasMax()
  {
    return zzbeN.contains(Integer.valueOf(2));
  }
  
  public final boolean hasMin()
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
    zzb localzzb = CREATOR;
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public final HashMap zzFl()
  {
    return zzbeM;
  }
  
  public final AgeRangeEntity zzFq()
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
      return Integer.valueOf(zzbge);
    }
    return Integer.valueOf(zzbgf);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.internal.model.people.PersonEntity.AgeRangeEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */