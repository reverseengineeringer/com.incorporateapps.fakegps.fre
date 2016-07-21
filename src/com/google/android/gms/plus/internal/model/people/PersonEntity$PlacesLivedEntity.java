package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.people.Person.PlacesLived;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class PersonEntity$PlacesLivedEntity
  extends FastSafeParcelableJsonResponse
  implements Person.PlacesLived
{
  public static final zzi CREATOR = new zzi();
  private static final HashMap zzbeM;
  String mValue;
  final int mVersionCode;
  final Set zzbeN;
  boolean zzbgr;
  
  static
  {
    HashMap localHashMap = new HashMap();
    zzbeM = localHashMap;
    localHashMap.put("primary", FastJsonResponse.Field.zzk("primary", 2));
    zzbeM.put("value", FastJsonResponse.Field.zzl("value", 3));
  }
  
  public PersonEntity$PlacesLivedEntity()
  {
    mVersionCode = 1;
    zzbeN = new HashSet();
  }
  
  PersonEntity$PlacesLivedEntity(Set paramSet, int paramInt, boolean paramBoolean, String paramString)
  {
    zzbeN = paramSet;
    mVersionCode = paramInt;
    zzbgr = paramBoolean;
    mValue = paramString;
  }
  
  public final int describeContents()
  {
    zzi localzzi = CREATOR;
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof PlacesLivedEntity)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    paramObject = (PlacesLivedEntity)paramObject;
    Iterator localIterator = zzbeM.values().iterator();
    while (localIterator.hasNext())
    {
      FastJsonResponse.Field localField = (FastJsonResponse.Field)localIterator.next();
      if (zza(localField))
      {
        if (((PlacesLivedEntity)paramObject).zza(localField))
        {
          if (!zzb(localField).equals(((PlacesLivedEntity)paramObject).zzb(localField))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (((PlacesLivedEntity)paramObject).zza(localField)) {
        return false;
      }
    }
    return true;
  }
  
  public final String getValue()
  {
    return mValue;
  }
  
  public final boolean hasPrimary()
  {
    return zzbeN.contains(Integer.valueOf(2));
  }
  
  public final boolean hasValue()
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
  
  public final boolean isPrimary()
  {
    return zzbgr;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzi localzzi = CREATOR;
    zzi.zza(this, paramParcel, paramInt);
  }
  
  public final HashMap zzFl()
  {
    return zzbeM;
  }
  
  public final PlacesLivedEntity zzFx()
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
      return Boolean.valueOf(zzbgr);
    }
    return mValue;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.internal.model.people.PersonEntity.PlacesLivedEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */