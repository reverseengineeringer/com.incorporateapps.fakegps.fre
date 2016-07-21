package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class MomentEntity
  extends FastSafeParcelableJsonResponse
  implements Moment
{
  public static final zzb CREATOR = new zzb();
  private static final HashMap zzbeM;
  final int mVersionCode;
  String zzJN;
  final Set zzbeN;
  String zzbfA;
  ItemScopeEntity zzbfI;
  ItemScopeEntity zzbfJ;
  String zzyv;
  
  static
  {
    HashMap localHashMap = new HashMap();
    zzbeM = localHashMap;
    localHashMap.put("id", FastJsonResponse.Field.zzl("id", 2));
    zzbeM.put("result", FastJsonResponse.Field.zza("result", 4, ItemScopeEntity.class));
    zzbeM.put("startDate", FastJsonResponse.Field.zzl("startDate", 5));
    zzbeM.put("target", FastJsonResponse.Field.zza("target", 6, ItemScopeEntity.class));
    zzbeM.put("type", FastJsonResponse.Field.zzl("type", 7));
  }
  
  public MomentEntity()
  {
    mVersionCode = 1;
    zzbeN = new HashSet();
  }
  
  MomentEntity(Set paramSet, int paramInt, String paramString1, ItemScopeEntity paramItemScopeEntity1, String paramString2, ItemScopeEntity paramItemScopeEntity2, String paramString3)
  {
    zzbeN = paramSet;
    mVersionCode = paramInt;
    zzyv = paramString1;
    zzbfI = paramItemScopeEntity1;
    zzbfA = paramString2;
    zzbfJ = paramItemScopeEntity2;
    zzJN = paramString3;
  }
  
  public MomentEntity(Set paramSet, String paramString1, ItemScopeEntity paramItemScopeEntity1, String paramString2, ItemScopeEntity paramItemScopeEntity2, String paramString3)
  {
    zzbeN = paramSet;
    mVersionCode = 1;
    zzyv = paramString1;
    zzbfI = paramItemScopeEntity1;
    zzbfA = paramString2;
    zzbfJ = paramItemScopeEntity2;
    zzJN = paramString3;
  }
  
  public final int describeContents()
  {
    zzb localzzb = CREATOR;
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof MomentEntity)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    paramObject = (MomentEntity)paramObject;
    Iterator localIterator = zzbeM.values().iterator();
    while (localIterator.hasNext())
    {
      FastJsonResponse.Field localField = (FastJsonResponse.Field)localIterator.next();
      if (zza(localField))
      {
        if (((MomentEntity)paramObject).zza(localField))
        {
          if (!zzb(localField).equals(((MomentEntity)paramObject).zzb(localField))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (((MomentEntity)paramObject).zza(localField)) {
        return false;
      }
    }
    return true;
  }
  
  public final String getId()
  {
    return zzyv;
  }
  
  public final ItemScope getResult()
  {
    return zzbfI;
  }
  
  public final String getStartDate()
  {
    return zzbfA;
  }
  
  public final ItemScope getTarget()
  {
    return zzbfJ;
  }
  
  public final String getType()
  {
    return zzJN;
  }
  
  public final boolean hasId()
  {
    return zzbeN.contains(Integer.valueOf(2));
  }
  
  public final boolean hasResult()
  {
    return zzbeN.contains(Integer.valueOf(4));
  }
  
  public final boolean hasStartDate()
  {
    return zzbeN.contains(Integer.valueOf(5));
  }
  
  public final boolean hasTarget()
  {
    return zzbeN.contains(Integer.valueOf(6));
  }
  
  public final boolean hasType()
  {
    return zzbeN.contains(Integer.valueOf(7));
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
  
  public final MomentEntity zzFn()
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
    case 3: 
    default: 
      throw new IllegalStateException("Unknown safe parcelable id=" + paramField.zzrs());
    case 2: 
      return zzyv;
    case 4: 
      return zzbfI;
    case 5: 
      return zzbfA;
    case 6: 
      return zzbfJ;
    }
    return zzJN;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.internal.model.moments.MomentEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */